import java.util.ArrayList;

public class  Sister extends Nurse implements HouseOfficer{

ArrayList<Ward> visitedWards=new ArrayList<>();
    public Sister(String name, int employeeNumber, Shift currentShift, int nurseRegistrationNum) {
        super(name, employeeNumber, currentShift, nurseRegistrationNum);
    }
    public Sister(){

    }


    public void attachToWard(Ward  ward){
       ward.setHouseOfficer(this);

    }

    @Override
    public void addWard(String wName, int wNum, HouseOfficer houseOfficer, DoctorSpecialization type) {
        Ward  ward=new Ward(wName,wNum,houseOfficer,type);
        visitedWards.add(ward);
    }

    public void displayVisitedWardsN(){
        for (Ward ward:visitedWards){
            System.out.println("The ward name visited:"+ward.getWardName());
            System.out.println("The ward number  visited:"+ward.getWardNum());
            Sister sister  =(Sister)ward.getHouseOfficer();
            System.out.println("The house officer  sister name:"+sister.getE_name());
            System.out.println("The type of the ward:"+ward.getWardType());
        }
    }

}
