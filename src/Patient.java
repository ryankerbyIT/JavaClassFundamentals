public class Patient {
    // Fields
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // Constructor
    public Patient(String firstName, String middleName, String lastName,
                   String address, String city, String state, String zip,
                   String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Getters
    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getAddress() {
        return address + ", " + city + ", " + state + " " + zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmergencyContact() {
        return emergencyContactName + " (" + emergencyContactPhone + ")";
    }
}
/*
Explanation:
Patient Class:

Stores the patient's details such as name, 
address, phone number, and emergency contact.
Contains a constructor and getters to retrieve 
the full name, address, and contact information.

*/