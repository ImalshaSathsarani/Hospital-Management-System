import java.util.ArrayList;

public    class Doctor extends Employee implements HouseOfficer {
    private int SLMC_registrationNumber;
    //DoctorSpecialization category;
    ArrayList<Doctor>doctors=new ArrayList<>();
    ArrayList<Ward>visitedWardsD=new ArrayList<>();
    public Doctor(String name, int employeeNumber, Shift currentShift, int SLMC_registrationNumber) {
        super(name, employeeNumber, currentShift);
        this.SLMC_registrationNumber = SLMC_registrationNumber;

    }
    public Doctor(){

    }

    public int getSLMC_registrationNumber() {
        return SLMC_registrationNumber;
    }

    public void setSLMC_registrationNumber(int SLMC_registrationNumber) {
        this.SLMC_registrationNumber = SLMC_registrationNumber;
    }


    public void attachToWard(Ward ward) {
        ward.setHouseOfficer(this);
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }



    @Override
    public void addWard(String wName, int wNum,HouseOfficer houseOfficer, DoctorSpecialization type) {
        Ward  ward=new Ward(wName,wNum,houseOfficer,type);
       visitedWardsD.add(ward);

   }


    public void displayDoctorDetails(){
        for(Doctor doctor:doctors){
            System.out.println("The name of the doctor:"+doctor.getE_name());
            System.out.println("The employee number of the doctor:"+doctor.getEmployeeNumber());
            System.out.println("The current shift of the doctor:"+doctor.getCurrentShift());
            System.out.println("The SLMC registration number of the doctor:"+doctor.getSLMC_registrationNumber());
        }
    }
    public void displayVisitedWardsD() {
        for (Ward ward : visitedWardsD) {
            System.out.println("The ward name visited:" + ward.getWardName());
            System.out.println("The ward number  visited:" + ward.getWardNum());
            Doctor doctor=(Doctor)ward.getHouseOfficer();
            System.out.println("The name of the doctor:"+doctor.getE_name());
            System.out.println("The type of the ward:" + ward.getWardType());
        }
    }
}
