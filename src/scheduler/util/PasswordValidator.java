package scheduler.util;

public final class PasswordValidator {

    private PasswordValidator() {
    }

    public static boolean isStrong(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        for (char character : password.toCharArray()) {
            if (Character.isUpperCase(character)) {
                upper = true;
            } else if (Character.isLowerCase(character)) {
                lower = true;
            } else if (Character.isDigit(character)) {
                digit = true;
            } else {
                special = true;
            }
        }

        return upper && lower && digit && special;
    }

    public static String requirementsMessage() {
        return "Password must contain at least 8 characters, including "
                + "an uppercase letter, lowercase letter, digit, and special character.";
    }
}