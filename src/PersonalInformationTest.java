public class PersonalInformationTest {
    public static void main(String[] args) {
        // Create three instances of PersonalInformation
        PersonalInformation myInfo = new PersonalInformation("Ryan Kerby", "123 Main St, Memphis, TN", 45, "901-674-0140");
        PersonalInformation friendInfo = new PersonalInformation("John Doe", "456 Oak St, Nashville, TN", 40, "615-555-1234");
        PersonalInformation familyInfo = new PersonalInformation("Jane Smith", "789 Pine St, Knoxville, TN", 42, "865-555-5678");

        // Display the information for each instance
        System.out.println("My Information:");
        System.out.println("Name: " + myInfo.getName());
        System.out.println("Address: " + myInfo.getAddress());
        System.out.println("Age: " + myInfo.getAge());
        System.out.println("Phone Number: " + myInfo.getPhoneNumber());

        System.out.println("\nFriend's Information:");
        System.out.println("Name: " + friendInfo.getName());
        System.out.println("Address: " + friendInfo.getAddress());
        System.out.println("Age: " + friendInfo.getAge());
        System.out.println("Phone Number: " + friendInfo.getPhoneNumber());

        System.out.println("\nFamily Member's Information:");
        System.out.println("Name: " + familyInfo.getName());
        System.out.println("Address: " + familyInfo.getAddress());
        System.out.println("Age: " + familyInfo.getAge());
        System.out.println("Phone Number: " + familyInfo.getPhoneNumber());
    }
}
/*
PersonalInformationTest Class:

Creates three instances of PersonalInformation: 
one for the user, one for a friend, and one for 
a family member. Displays the information for 
each instance.

*/