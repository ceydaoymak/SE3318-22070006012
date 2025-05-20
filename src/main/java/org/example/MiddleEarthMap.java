package org.example;

public class MiddleEarthMap {

    /**
     * This method helps the character go to a location.
     * If 'isSecretPassage' is true, it also uses a secret path.
     *
     * @param location        The place to go (like Mordor or Shire)
     * @param isSecretPassage True if using a secret path
     */
    public void navigate(String location, boolean isSecretPassage) {
        // This switch block checks where to go
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break; // End this case, do not go to next

            case "Shire":
                System.out.println("Navigating to the Shire");
                break;

            case "Gondor":
                System.out.println("Navigating to Gondor");
                break;

            default:
                System.out.println("Unknown location");
                break;
        }

        // Another switch to check if location is Lothlórien
        switch (location) {
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");
                break;
        }

        // This block runs if secret path is true
        if (isSecretPassage) {
            System.out.println("Secret passage flag is true.");
        }

        // Show "Secret" or "Normal" depending on the flag
        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
