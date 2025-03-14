import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BloodData defaultBloodData = new BloodData();

        System.out.print("Enter blood type (O, A, B, AB): ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh factor (+, -): ");
        String rhFactor = scanner.nextLine();

        BloodData userBloodData = new BloodData(bloodType, rhFactor);

        System.out.println("\nDefault Blood Data: " + defaultBloodData.getBloodType() + defaultBloodData.getRhFactor());
        System.out.println("User Blood Data: " + userBloodData.getBloodType() + userBloodData.getRhFactor());

        defaultBloodData.setBloodType(userBloodData.getBloodType());
        defaultBloodData.setRhFactor(userBloodData.getRhFactor());

        System.out.println("\nUpdated Default Blood Data: " + defaultBloodData.getBloodType() + defaultBloodData.getRhFactor());

        scanner.close();
    }
}