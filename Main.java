import java.util.Scanner;

public class Main {

    public static void encryptionFunction() {

    }

    public static void decryptionFunction() {

    }

    public static void bruteForceFunction() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        // Menu Display
        System.out.println("Choose amongst the following:\n Press 1 for Encryption.\n Press 2 for Decryption. \n Press 3 for Brute Force Attack.");
        num = scanner.nextInt();

        // Switch case for calling the required functions
        switch (num) {
            case 1:
                encryptionFunction();
                break;
            case 2:
                decryptionFunction();
                break;
            case 3:
                bruteForceFunction();
                break;
            default:
                System.out.println("Invalid choice! Please enter a valid input.");
                break;
        }
        scanner.close();

    }

}
