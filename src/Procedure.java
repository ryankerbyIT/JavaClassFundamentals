public class Procedure {
    // Fields
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharge;

    // Constructor
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharge = procedureCharge;
    }

    // Getters
    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getProcedureCharge() {
        return procedureCharge;
    }
}
/*
Explanation:
Procedure Class:

Stores details of a medical procedure including 
its name, date, practitioner, and charge.
Contains a constructor and getters to retrieve 
the procedure details.

*/