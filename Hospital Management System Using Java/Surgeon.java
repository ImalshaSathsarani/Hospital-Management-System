import java.util.ArrayList;

public  class Surgeon extends Doctor{
  private DoctorSpecialization category;
  ArrayList<Surgeon>surgeons=new ArrayList<>();
ArrayList<Patient>surgeryPatients=new ArrayList<>();
    public Surgeon(String name, int employeeNumber, Shift currentShift, int SLMC_registrationNumber, DoctorSpecialization category) {
        super(name, employeeNumber, currentShift, SLMC_registrationNumber);
        this.category = category;
    }

    public Surgeon(){

    }

    public DoctorSpecialization getCategory() {
        return category;
    }

    public void setCategory(DoctorSpecialization category) {
        this.category = category;
    }

    public void addSurgeriedPatient(Patient patient){
        surgeryPatients.add(patient);
    }

    public void addSurgeon(Surgeon surgeon){
        surgeons.add(surgeon);
    }

    public void dislaySurgerideptients(){
        for(Patient patient:surgeryPatients){
            System.out.println("The name of the patient:"+patient.getName());
            System.out.println("The date of admission:"+patient.getDateOfAdmission());
            System.out.println("The bed head ticket number:"+patient.getBeadHeadTicketNumber());
        }
    }

    public void displaySurgeonsDetails(){
        for(Surgeon surgeon:surgeons){
            System.out.println("The name of the surgeon:"+surgeon.getE_name());
            System.out.println("The employee number of the surgeon:"+surgeon.getEmployeeNumber());
            System.out.println("The current shift of the surgeon:"+surgeon.getCurrentShift());
            System.out.println("The category of the surgeon:"+surgeon.getCategory());
        }
    }

}
