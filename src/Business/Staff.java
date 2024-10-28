package Business;

import java.sql.Date;

public class Staff implements Comparable<Staff> {
    private String id = "AASP1";
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String telephone;
    private String email;

    //constructor 
    public Staff() {
    	
    }
    public Staff(String lastName, String firstName, Date dateofBirth, String address, String city, String state, String telephone, String email) {
    	setLastName(lastName);
    	setFirstName(firstName);
    	setDateOfBirth(dateofBirth);
    	setAddress(address);
    	setCity(city);
    	setState(state);
    	setTelephone(telephone);
    	setEmail(email);
    }
    
    //setter methods 
    public void setId() {
    	
    }
    public void setLastName(String lastName) throws IllegalArgumentException{
    	if(lastName.length()<0 || lastName.length() > 15) {
    		//throw an exception if the length of the first name is either less than zero or more than 15 characters 
    		throw new IllegalArgumentException("Invalid last name. Last name cannot be more than 15 characters. Please enter a valid last name");
    	}
    	
    	 if (lastName == null || lastName.trim().isEmpty()) {
  		   // Throw an exception with an error message if the last Name is null or is empty
  	        throw new IllegalArgumentException("Last Name cannot be null or empty. Please re-enter your Last name.");
  	    }
  	    // Allows alphabets but no special characters or symbols
  	    if (!lastName.matches("[a-zA-Z ]+")) {
  	    	//Throw an exception with an error message if the last Name contains invalid characters.
  	        throw new IllegalArgumentException("Last Name contains invalid characters. Please try again.");
  	    }
  	    
  	  this.lastName = lastName;
    }
    
    public void setFirstName(String firstName) throws IllegalArgumentException{
    	if(firstName.length()<0 || firstName.length() > 15) {
    		//throw an exception if the length of the first name is either less than zero or more than 15 characters 
    		throw new IllegalArgumentException("Invalid First name. First name cannot be more than 15 characters. Please enter a valid last name");
    	}
    	 if (firstName == null || firstName.trim().isEmpty()) {
  		   // Throw an exception with an error message if the first Name is null or is empty
  	        throw new IllegalArgumentException("First name cannot be null or empty. Please re-enter your Last name.");
  	    }
  	    // Allows alphabets but no special characters or symbols
  	    if (!firstName.matches("[a-zA-Z ]+")) {
  	    	//Throw an exception with an error message if the first Name contains invalid characters.
  	        throw new IllegalArgumentException("First name contains invalid characters. Please try again.");
  	    }
  	    
  	  this.firstName = firstName;
    }
    // Setter method for dateOfBirth
    public void setDateOfBirth(Date dateOfBirth) {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("Date of birth cannot be null.");
        }
        this.dateOfBirth = dateOfBirth;
    }
    
 
    public void setAddress(String address) throws IllegalArgumentException{
    	if(address.length()<0 || address.length() > 20) {
    		//throw an exception if the length of the first name is either less than zero or more than 15 characters 
    		throw new IllegalArgumentException("Invalid Address. Address can contain only 20 characters. Please enter a valid address");
    	}
    	 if (address == null || address.trim().isEmpty()) {
  		   // Throw an exception with an error message if the first Name is null or is empty
  	        throw new IllegalArgumentException("Address cannot be null or empty. Please re-enter your Address.");
  	    }
  	    // Allows alphabets but no special characters or symbols
  	    if (!address.matches("^[a-zA-Z0-9,\\\\.\\\\-/\\\\s]+$")) {
  	    	//Throw an exception with an error message if the first Name contains invalid characters.
  	        throw new IllegalArgumentException("Address contains invalid characters. Please try again.");
  	    }
  	    
  	  this.address = address;
    }
   
    public void setCity(String city) throws IllegalArgumentException{
    	if(city.length()<0 || city.length() > 20) {
    		//throw an exception if the length of the city is either less than zero or more than 20 characters 
    		throw new IllegalArgumentException("Invalid City. City can contain only 20 characters. Please enter a valid City");
    	}
    	 if (city == null || city.trim().isEmpty()) {
  		   // Throw an exception with an error message if the city is null or is empty
  	        throw new IllegalArgumentException("City cannot be null or empty. Please re-enter city.");
  	    }
  	    // Allows alphabets but no special characters or symbols
  	    if (!city.matches("[a-zA-Z ]+")) {
  	    	//Throw an exception with an error message if the city contains invalid characters.
  	        throw new IllegalArgumentException("City contains invalid characters. Please try again.");
  	    }
  	    
  	  this.city = city;
    }
    public void setState(String state) throws IllegalArgumentException{
    	if(state.length()<0 || state.length() > 20) {
    		//throw an exception if the length of the city is either less than zero or more than 20 characters 
    		throw new IllegalArgumentException("Invalid State. State can contain only 20 characters. Please enter a valid State");
    	}
    	 if (state == null || state.trim().isEmpty()) {
  		   // Throw an exception with an error message if the city is null or is empty
  	        throw new IllegalArgumentException("State cannot be null or empty. Please re-enter the State.");
  	    }
  	    // Allows alphabets but no special characters or symbols
  	    if (!state.matches("[a-zA-Z ]+")) {
  	    	//Throw an exception with an error message if the city contains invalid characters.
  	        throw new IllegalArgumentException("State contains invalid characters. Please try again.");
  	    }
  	    
  	  this.state = state;
    }

    public void setTelephone(String telephone) throws IllegalArgumentException{
    	if(telephone.length()<0 || telephone.length() > 10) {
    		//throw an exception if the length of the telephone number is either less than zero or more than 10 characters 
    		throw new IllegalArgumentException("Invalid telephone number. Telephone number can contain only 10 digits. Please enter a valid telephone number");
    	}
    	 if (telephone == null || telephone.trim().isEmpty()) {
  		   // Throw an exception with an error message if the telephone number is null or is empty
  	        throw new IllegalArgumentException("Telephone number cannot be null or empty. Please re-enter the number.");
  	    }
  	    // Allows alphabets but no special characters or symbols
  	    if (!telephone.matches("[0-9]+")) {
  	    	//Throw an exception with an error message if the telephone number contains invalid characters.
  	        throw new IllegalArgumentException("Telephone number contains invalid characters. Please try again.");
  	    }
  	    
  	  this.telephone = telephone;
    }
    public void setEmail(String email) throws IllegalArgumentException{
    	if(email.length()<0 || email.length() > 40) {
    		//throw an exception if the length of the city is either less than zero or more than 20 characters 
    		throw new IllegalArgumentException("Invalid Email. Email can contain only 40 characters. Please enter a valid Email");
    	}
    	 if (email == null || email.trim().isEmpty()) {
  		   // Throw an exception with an error message if the city is null or is empty
  	        throw new IllegalArgumentException("Email cannot be null or empty. Please re-enter the Email.");
  	    }
  	    if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
  	    	//Throw an exception with an error message if the email contains invalid characters.
  	        throw new IllegalArgumentException("Email contains invalid characters. Please try again.");
  	    }
  	    
  	  this.email = email;
    }
    
    public String getId() {
    	return id;
    }
    
    public String getLastName() {
    	return this.lastName;
    }
    
    public String getFirstName() {
    	return this.firstName;
    }
    public Date getDateOfBirth() {
    	return this.dateOfBirth;
    }
    public String getAddress() {
    	return this.address;
    }
    public String getCity() {
    	return this.city;
    }
    public String getState() {
    	return this.state;
    }
    public String getTelephone() {
    	return this.telephone;
    }
    public String getEmail() {
    	return this.email;
    }
    @Override
    public int compareTo(Staff other) {
        return this.dateOfBirth.compareTo(other.dateOfBirth); // Sorting by date of birth
    }
}
	

