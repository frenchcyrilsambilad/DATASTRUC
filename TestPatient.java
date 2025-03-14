import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)ected

        Patient defaultPatient = new Patient();
        System.out.println("Default Patient Details:");
        displayPatientDetails(defaultPatient);

        System.out.println("\nEnter details for the second patient:");
        System.out.print("Enter ID Number: ");
        int idNumber = scanner.nextInt();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Blood Type (O, A, B, AB): ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh Factor (+, -): ");
        String rhFactor = scanner.nextLine();

        BloodData userBloodData = new BloodData(bloodType, rhFactor);
        Patient userPatient = new Patient(idNumber, age, userBloodData);

        System.out.println("\nUser Patient Details:");
        displayPatientDetails(userPatient);

        System.out.println("\nEnter details for the third patient (BloodData will use defaults):");
        System.out.print("Enter ID Number: ");
        idNumber = scanner.nextInt();

        System.out.print("Enter Age: ");
        age = scanner.nextInt();

        Patient thirdPatient = new Patient(idNumber, age, new BloodData());

        System.out.println("\nThird Patient Details:");
        displayPatientDetails(thirdPatient);

        scanner.close();
    }

    public static void displayPatientDetails(Patient patient) {
        System.out.println("ID Number: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Data: " + patient.getBloodData().getBloodType() + patient.getBloodData().getRhFactor());
    }
}