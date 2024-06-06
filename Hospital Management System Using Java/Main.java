import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Doctor doctor=new Doctor();
        Surgeon surgeon=new Surgeon();
        Nurse nurse=new Nurse();
        Sister sister =new Sister();
        Patient patient=new Patient();

        Scanner sc= new Scanner(System.in);

        ArrayList<Doctor>doctors=new ArrayList<>();
        ArrayList<Nurse>nurses=new ArrayList<>();
        ArrayList<Patient>patients=new ArrayList<>();
        ArrayList<Surgeon>surgeons=new ArrayList<>();
        ArrayList<Patient> surgeryPatients=new ArrayList<>();
        ArrayList<Ward> visitedWards=new ArrayList<>();

        int choice;
do{
        System.out.println(" \n\n WELCOME TO HOSPITAL MANAGEMENT SYSTEM !!! \n\n");
        System.out.println("1)Add doctor ");
        System.out.println("2)Add nurse");
        System.out.println( "3)Add Patient");
        System.out.println("4)Add record of patients that are subjected to surgeries ");
        System.out.println("5)Display the details of the doctors");
        System.out.println("6)Display the details of the surgeons");
        System.out.println("7)Display details of the nurses");
        System.out.println("8)Display  details of the patients");
        System.out.println("9)Display details of the patients who have subjected to surgeries");
        System.out.println("10)Add Record about sisters' visited wards");
        System.out.println("11)Display the details of the sister's visited wards:");
        System.out.println("12)Attach doctor to a ward ");
        System.out.println("13)Attach sister to a ward ");
        System.out.println("14)Exit");
        System.out.println("\nEnter the relevant number:\n ");
        choice=sc.nextInt();
        sc.nextLine();

    switch (choice) {
        case 1:
            System.out.println("Enter the name of the doctor:");
            String dcName = sc.nextLine();
            System.out.println("Enter the employee number:");
            int dcENum = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the current shift(MORNING/EVENING/NIGHT/FULLDAY)");
            Shift currentShift = Shift.valueOf(sc.nextLine());
            System.out.println("Enter the SLMC registration number:");
            int SLMCno = sc.nextInt();
            sc.nextLine();
            System.out.println("Is the doctor is a surgeon?(yes/no)");
            String dec = sc.nextLine();
            if (dec.equals("yes")) {
                System.out.println("Enter the category of the surgeon(GENERAL/CARDIOTHARACIC/NEURO/PEDIATRIC/PLASTIC/OTOLARYNGOLOGY)");
                DoctorSpecialization category = DoctorSpecialization.valueOf(sc.nextLine());
                Surgeon newSurgeon = new Surgeon(dcName, dcENum, currentShift, SLMCno, category);
                surgeon.addSurgeon(newSurgeon);
                System.out.println("Surgeon added successfully");
            } else if (dec.equals("no")) {
                Doctor newDoctor = new Doctor(dcName, dcENum, currentShift, SLMCno);
                doctor.addDoctor(newDoctor);
                System.out.println("Doctor added successfully...");
            } else {
                System.out.println("Invalid input");
            }

            break;

        case 2:
            System.out.println("Enter the name of the nurse:");
            String nuName = sc.nextLine();
            System.out.println("Enter the employee number:");
            int nuENum = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the current shift(MORNING/EVENING/NIGHT/FULLDAY)");
            Shift nuCurrentShift = Shift.valueOf(sc.nextLine());
            System.out.println("Enter the nurse's registration number:");
            int regNo = sc.nextInt();
            sc.nextLine();

            Nurse newNurse = new Nurse(nuName, nuENum, nuCurrentShift, regNo);
            nurse.addNurse(newNurse);
            System.out.println("Nurse added successfully...");

            break;

        case 3:
            System.out.println("Enter the name of the patient:");
            String pName = sc.nextLine();
            System.out.println("Enter the date of admission:");
            String date = sc.nextLine();
            System.out.println("Enter the bed head ticket number:");
            int num = sc.nextInt();
            sc.nextLine();

            Patient newPatient = new Patient(pName, date, num);
            patient.addPatient(newPatient);
            System.out.println("Patient added successfully... ");

            break;

        case 4:
            System.out.println("Enter the name of the patient who has subjected to the surgery:");
            String s_pName = sc.nextLine();
            System.out.println("Enter the date of admission:");
            String s_date = sc.nextLine();
            System.out.println("Enter the bed head ticket number:");
            int s_num = sc.nextInt();
            sc.nextLine();

            Patient surgeryPatient = new Patient(s_pName, s_date, s_num);
            surgeon.addSurgeriedPatient(surgeryPatient);
            System.out.println("The patient added successfully...");

            break;
        case 5:
            doctor.displayDoctorDetails();
            break;
        case 6 :
            surgeon.displaySurgeonsDetails();
            break;
        case 7:
            nurse.displayNurseDetails();
            break;
        case 8:
            patient.displayPatientsDetails();
            break;
        case 9:
            surgeon.dislaySurgerideptients();
            break;

        case 10:
            System.out.println("Enter the ward name: ");
            String wName = sc.nextLine();
            System.out.println("Enter ward number:");
            int wNum = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the ward  type(GENERAL/CARDIOTHARACIC/NEURO/PEDIATRIC/PLASTIC/OTOLARYNGOLOGY):");
            DoctorSpecialization type = DoctorSpecialization.valueOf(sc.nextLine());
            System.out.println("Enter the details of the house officer:");
            System.out.println("Is the house officer is a doctor or a sister:");
            String ho = sc.nextLine();
            if (ho.equals("doctor")) {
                System.out.println("Enter the name of the doctor:");
                String dcWName = sc.nextLine();
                System.out.println("Enter the employee number:");
                int dcWENum = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the current shift(MORNING/EVENING/NIGHT/FULLDAY)");
                Shift w_currentShift = Shift.valueOf(sc.nextLine());
                System.out.println("Enter the SLMC registration number:");
                int w_SLMCno = sc.nextInt();
                sc.nextLine();

                Doctor w_newDoctor = new Doctor(dcWName, dcWENum, w_currentShift, w_SLMCno);

                doctor.addWard(wName, wNum, w_newDoctor, type);
                System.out.println("The Record added successfully");

            } else if (ho.equals("sister")) {
                System.out.println("Enter the name of the sister:");
                String s_nuName = sc.nextLine();
                System.out.println("Enter the employee number:");
                int s_nuENum = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the current shift(MORNING/EVENING/NIGHT/FULLDAY)");
                Shift s_nuCurrentShift = Shift.valueOf(sc.nextLine());
                System.out.println("Enter the sister's registration number:");
                int s_regNo = sc.nextInt();
                sc.nextLine();

                Sister  newSister = new Sister (s_nuName, s_nuENum, s_nuCurrentShift, s_regNo);
                sister.addWard(wName, wNum, newSister, type);
                System.out.println("The record added successfully");

            } else {
                System.out.println("Invalid input");
            }

            break;

        case 11:
            System.out.println("Visited wards that the house officer is doctor");
            doctor.displayVisitedWardsD();

            System.out.println("\n\n Visited wards that the house officer is sister\n\n");
            sister.displayVisitedWardsN();

            break;

        case 12:
            System.out.println("Enter the ward name: ");
            String a_wName = sc.nextLine();
            System.out.println("Enter ward number:");
            int a_wNum = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the ward  type(GENERAL/CARDIOTHARACIC/NEURO/PEDIATRIC/PLASTIC/OTOLARYNGOLOGY):");
            DoctorSpecialization a_type = DoctorSpecialization.valueOf(sc.nextLine());
            System.out.println("Enter the details of the doctor:");
            System.out.println("Enter the name of the doctor:");
            String a_dcWName = sc.nextLine();
            System.out.println("Enter the employee number:");
            int a_dcWENum = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the current shift(MORNING/EVENING/NIGHT/FULLDAY)");
            Shift a_w_currentShift = Shift.valueOf(sc.nextLine());
            System.out.println("Enter the SLMC registration number:");
            int a_w_SLMCno = sc.nextInt();
            sc.nextLine();

            Doctor a_doctor = new Doctor(a_dcWName, a_dcWENum, a_w_currentShift, a_w_SLMCno);
            Ward a_ward = new Ward(a_wName, a_wNum, a_doctor, a_type);
            doctor.attachToWard(a_ward);
            System.out.println("The doctor attached successfully");

             break;

        case 13:
            System.out.println("Enter the ward name: ");
            String a_NwName = sc.nextLine();
            System.out.println("Enter ward number:");
            int a_NwNum = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the ward type(GENERAL/CARDIOTHARACIC/NEURO/PEDIATRIC/PLASTIC/OTOLARYNGOLOGY):");
            DoctorSpecialization a_Ntype = DoctorSpecialization.valueOf(sc.nextLine());
            System.out.println("Enter the details  of the sister:");
            System.out.println("Enter the name of the sister:");
            String as_nuName = sc.nextLine();
            System.out.println("Enter the employee number:");
            int as_nuENum = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the current shift(MORNING/EVENING/NIGHT/FULLDAY)");
            Shift as_nuCurrentShift = Shift.valueOf(sc.nextLine());
            System.out.println("Enter the sister's registration number:");
            int as_regNo = sc.nextInt();
            sc.nextLine();

            Sister a_sister = new Sister(as_nuName, as_nuENum, as_nuCurrentShift, as_regNo);
            Ward n_ward = new Ward(a_NwName, a_NwNum, a_sister, a_Ntype);
            sister.attachToWard(n_ward);
            System.out.println("The sister attached successfully");

            break;

        case 14:
            System.out.println("Exiting program thank you!!!");

            break;
    }
}while(choice!=14);

    }
}