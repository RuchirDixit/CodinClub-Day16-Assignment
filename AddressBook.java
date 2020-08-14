import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddressBook implements Comparable<AddressBook> {
    public String firstName,lastName,address,state,city;
    public int zip, number;
    
    public static List<AddressBook> addressBook=new ArrayList<>();
    
    public AddressBook(String firstName, String lastName, String address, String state, String city, int zip,
			int number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.number = number;
	}
    
    
    public int getNumber() {
    	return this.number;
    }


	public <AnyType> void setFirstName(AnyType firstName) {
		this.firstName = (String)firstName;
	}





	public <AnyType> void setLastName(AnyType lastName) {
		this.lastName = (String)lastName;
	}





	public <AnyType> void setAddress(AnyType address) {
		this.address = (String)address;
	}





	public <AnyType> void setState(AnyType state) {
		this.state = (String)state;
	}





	public <AnyType> void setCity(AnyType city) {
		this.city = (String)city;
	}





	public <AnyType> void setZip(AnyType zip) {
		this.zip = (int)zip;
	}





	public <AnyType> void setNumber(AnyType number) {
		this.number = (int)number;
	}





	public static void setAddressBook(List<AddressBook> addressBook) {
		AddressBook.addressBook = addressBook;
	}





	public static void addPerson(AddressBook obj) {
    	addressBook.add(obj);
    }   
    
    public static void getPerson() {
    	for(AddressBook e : addressBook) {
    		System.out.println("First Name: "+e.firstName+" Last Name: "+e.lastName+" Address: "+e.address+" Zip code: "+e.zip+" Number:"+e.number);
    	}
    } 
    
    public static <GenericType> void updatePerson(String name,GenericType updateParameter,String fieldToUpdate) {
    	for (int i=0;i<=addressBook.size()-1;i++) {
    		if(addressBook.get(i).firstName.equals(name)) {
    			if(fieldToUpdate.equals("Address")) {
    				addressBook.get(i).setAddress(updateParameter);
    			}
    			else if(fieldToUpdate.equals("State")) {
    				addressBook.get(i).setState(updateParameter);
    			}
    			else if(fieldToUpdate.equals("City")) {
    				addressBook.get(i).setCity(updateParameter);
    			}
    			else if(fieldToUpdate.equals("Zip")) {
    				addressBook.get(i).setZip(updateParameter);
    			}
    			else if(fieldToUpdate.equals("Number")) {
    				addressBook.get(i).setNumber(updateParameter);
    			}
    		}
    	}
    }
    public static void deletePerson(String fname) {
    	for (int i=0;i<=addressBook.size()-1;i++) {
    		if(addressBook.get(i).firstName.equals(fname)) {
    			addressBook.remove(addressBook.get(i));
    		}
    	}
    }
    
    public static void sortCollection() {
    	Collections.sort(addressBook);
    }










	@Override
	public int compareTo(AddressBook o) {
		// TODO Auto-generated method stub
		return (this.getNumber() < o.getNumber() ? -1 : 
            (this.getNumber() == o.getNumber() ? 0 : 1)); 
	}
    

}
