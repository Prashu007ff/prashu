import java.util.*;

public class SimpleOTPVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String generatedOTP = generateOTP();
        System.out.println("Your OTP (simulated email): " + generatedOTP); 

        
        System.out.println("Enter the OTP: ");
        String userInput = sc.nextLine();

        
        if (generatedOTP.equals(userInput.trim())) {
            System.out.println("OTP Verified! Access Granted.");
        } else {
            System.out.println("Incorrect OTP. Access Denied.");
        }

        sc.close();
    }

    public static String generateOTP() {
        Random rand = new Random();
        int otp = 100000 + rand.nextInt(900000); // 6-digit OTP
        return String.valueOf(otp);
    }
}