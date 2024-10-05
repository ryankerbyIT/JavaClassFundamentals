public class PatientProcedureTest {
    public static void main(String[] args) {
        // Create a Patient object with sample data
        Patient patient = new Patient("John", "A.", "Doe", "1234 Elm St",
                "Memphis", "TN", "38104", "901-555-1234", "Jane Doe", "901-555-5678");

        // Create three Procedure objects with sample data
        Procedure procedure1 = new Procedure("Physical Exam", "Today", "Dr. Irvine", 250.00);
        Procedure procedure2 = new Procedure("X-ray", "Today", "Dr. Jamison", 500.00);
        Procedure procedure3 = new Procedure("Blood test", "Today", "Dr. Smith", 200.00);

        // Display patient's information
        System.out.println("Patient Information:");
        System.out.println("Name: " + patient.getFullName());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("Phone: " + patient.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient.getEmergencyContact());

        // Display procedure information and calculate total charges
        System.out.println("\nProcedures:");
        System.out.println("Procedure 1: " + procedure1.getProcedureName() + " | Date: " + procedure1.getProcedureDate() +
                " | Practitioner: " + procedure1.getPractitionerName() + " | Charge: $" + procedure1.getProcedureCharge());
        System.out.println("Procedure 2: " + procedure2.getProcedureName() + " | Date: " + procedure2.getProcedureDate() +
                " | Practitioner: " + procedure2.getPractitionerName() + " | Charge: $" + procedure2.getProcedureCharge());
        System.out.println("Procedure 3: " + procedure3.getProcedureName() + " | Date: " + procedure3.getProcedureDate() +
                " | Practitioner: " + procedure3.getPractitionerName() + " | Charge: $" + procedure3.getProcedureCharge());

        // Calculate and display total charges
        double totalCharges = procedure1.getProcedureCharge() + procedure2.getProcedureCharge() + procedure3.getProcedureCharge();
        System.out.println("\nTotal Charges: $" + totalCharges);
    }
}
/*
Explanation:
Main Program:

Creates a sample patient.
Creates three procedures.
Displays the patient's information, 
details of each procedure, and 
calculates the total charges of 
all procedures.

*/