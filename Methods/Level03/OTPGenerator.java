import java.util.Arrays;
import java.util.Random;

public class OTPGenerator {

    public static String generateOTP() {
        Random rand = new Random();
        String otp = "";
        for (int i = 0; i < 6; i++) {
            otp += rand.nextInt(10);
        }
        return otp;
    }

    public static boolean areOTPsUnique(String[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i].equals(otps[j])) {
                    return false; // If any two OTPs are the same, return false
                }
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        String[] generatedOTPs = new String[10];

        for (int i = 0; i < 10; i++) {
            generatedOTPs[i] = generateOTP();
        }

        boolean uniqueOTPs = areOTPsUnique(generatedOTPs);

        if (uniqueOTPs) {
            System.out.println("All OTPs are unique.");
            for (String otp : generatedOTPs) {
                System.out.println(otp);
            }
        } else {
            System.out.println("Some OTPs are duplicates.");
        }
    }
}