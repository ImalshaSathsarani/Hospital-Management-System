public class Employee {
    private String e_name;
    private int employeeNumber;
    private Shift currentShift;

    public Employee(String e_name, int employeeNumber, Shift currentShift) {
        this.e_name = e_name;
        this.employeeNumber = employeeNumber;
        this.currentShift = currentShift;
    }
    public Employee(){

    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Shift getCurrentShift() {
        return currentShift;
    }

    public void setCurrentShift(Shift currentShift) {
        this.currentShift = currentShift;
    }
}
