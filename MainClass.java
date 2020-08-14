import java.io.*;
import java.util.*;

public class MainClass {
	static Scanner sc=new Scanner(System.in);
	
	
	public static void add() {
		System.out.println("Enter first name:");
		String fname=sc.next();
		System.out.println("Enter last name:");
		String lname=sc.next();
		System.out.println("Enter address:");
		String addr=sc.next();
		System.out.println("Enter state:");
		String state=sc.next();
		System.out.println("Enter city:");
		String city=sc.next();
		System.out.println("Enter zip code:");
		int zip=sc.nextInt();
		System.out.println("Enter number:");
		int number=sc.nextInt();
		AddressBook p1=new AddressBook(fname,lname,addr,state,city,zip,number);
		AddressBook.addPerson(p1);
	}
	
	
	public static void delete() {
		System.out.println("Enter first name to delete:");
		String fname=sc.next();
		AddressBook.deletePerson(fname);
	}
	
	public static void update() {
		System.out.println("Enter first name from list which you want to update:");
		String fname=sc.next();
		System.out.println("1. Address");
		System.out.println("2. State");
		System.out.println("3. City");
		System.out.println("4. Zip code");
		System.out.println("5. Number");
		System.out.println("Enter field number to enter:");
		int field=sc.nextInt();
		switch(field) {
		case 1:
			System.out.println("Enter new Address:");
			String newAdd=sc.next();
			AddressBook.updatePerson(fname,newAdd,"Address");
			break;
		case 2:
			System.out.println("Enter new state:");
			String newState=sc.next();
			AddressBook.updatePerson(fname,newState,"State");
			break;
		case 3:
			System.out.println("Enter new city:");
			String newCity=sc.next();
			AddressBook.updatePerson(fname,newCity,"City");
			break;
		case 4:
			System.out.println("Enter new zip code:");
			int newZip=sc.nextInt();
			AddressBook.updatePerson(fname,newZip,"Zip");
			break;
		case 5:
			System.out.println("Enter new number:");
			int newNumber=sc.nextInt();
			AddressBook.updatePerson(fname,newNumber,"Number");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		while(true) {
			System.out.println("1. Add Person");
			System.out.println("2. Show all people");
			System.out.println("3. Delete Person");
			System.out.println("4. Update Person");
			System.out.println("5. Sort collection using Mobile Number");
			System.out.println("6. Quit");
			System.out.println("Enter you choice:");
			int choice=sc1.nextInt();
			switch(choice) {
			case 1:
				add();
				break;
			case 2:
				AddressBook.getPerson();
				break;
			case 3:
				delete();
				break;
			case 4:
				update();
				break;
			case 5:
				AddressBook.sortCollection();
				break;
			case 6:
				System.exit(1);
			}
		}
		
	}
}
