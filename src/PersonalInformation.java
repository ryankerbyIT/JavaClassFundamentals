public class PersonalInformation {
    // Fields
    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    // Constructor that accepts all fields as arguments
    public PersonalInformation(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Setters (Mutators)
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters (Accessors)
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
/*
 * PersonalInformation Class:

Contains fields for name, address, age, 
and phoneNumber. The constructor accepts 
values for all fields. Setters (mutators) 
and getters (accessors) are provided to 
allow modification and retrieval 
of the field values.

*/
