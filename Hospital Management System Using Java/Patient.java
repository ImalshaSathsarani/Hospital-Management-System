import java.util.ArrayList;

public class Patient {
    private String name;
    private String dateOfAdmission;
    private int beadHeadTicketNumber;

    ArrayList<Patient>patients=new ArrayList<>();

    public Patient(String name, String dateOfAdmission, int beadHeadTicketNumber) {
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
        this.beadHeadTicketNumber = beadHeadTicketNumber;
    }
    public Patient(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public int getBeadHeadTicketNumber() {
        return beadHeadTicketNumber;
    }

    public void setBeadHeadTicketNumber(int beadHeadTicketNumber) {
        this.beadHeadTicketNumber = beadHeadTicketNumber;
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void displayPatientsDetails(){
        for (Patient patient:patients){
            System.out.println("The name of the patient:"+patient.name);
            System.out.println("The date of admission:"+patient.dateOfAdmission);
            System.out.println("The bed head ticket number:"+patient.beadHeadTicketNumber);
        }
    }
}
