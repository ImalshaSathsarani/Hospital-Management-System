public class Ward {
    private String wardName;
    private int wardNum;

    private HouseOfficer houseOfficer;
    private DoctorSpecialization wardType;

    public Ward(String wardName, int wardNum,HouseOfficer houseOfficer, DoctorSpecialization wardType) {
        this.wardName = wardName;
        this.wardNum = wardNum;
        this.houseOfficer=houseOfficer;
        this.wardType = wardType;
    }
    public Ward(){

    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public int getWardNum() {
        return wardNum;
    }

    public void setWardNum(int wardNum) {
        this.wardNum = wardNum;
    }

    public DoctorSpecialization getWardType() {
        return wardType;
    }

    public void setWardType(DoctorSpecialization wardType) {
        this.wardType = wardType;
    }

    public HouseOfficer getHouseOfficer() {
        return houseOfficer;
    }

    public void setHouseOfficer(HouseOfficer houseOfficer) {
        this.houseOfficer = houseOfficer;
    }
}
