import java.util.ArrayList;

public class Nurse extends Employee{
    private int nurseRegistrationNum;
    ArrayList<Nurse>nurses=new ArrayList<>();

    public Nurse(String name, int employeeNumber, Shift currentShift, int nurseRegistrationNum) {
        super(name, employeeNumber, currentShift);
        this.nurseRegistrationNum = nurseRegistrationNum;
    }

    public Nurse(){

    }

    public int getNurseRegistrationNum() {
        return nurseRegistrationNum;
    }

    public void setNurseRegistrationNum(int nurseRegistrationNum) {
        this.nurseRegistrationNum = nurseRegistrationNum;
    }

    public void addNurse(Nurse nurse){
        nurses.add(nurse);
    }

    public void displayNurseDetails(){
        for(Nurse nurse:nurses){
            System.out.println("The name of the nurse:"+nurse.getE_name());
            System.out.println("The employee number of the nurse:"+nurse.getEmployeeNumber());
            System.out.println("The current shift of the nurse:"+nurse.getCurrentShift());
            System.out.println("The nurse's registration number of the doctor:"+nurse.getNurseRegistrationNum());
        }
    }
}
