import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];           // To store input names
        String[] consonantArray = new String[10];  // To store only consonants from each name

        System.out.println("Enter 10 friends' names:");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        // Extract consonants and store in second array
        for (int i = 0; i < 10; i++) {
            String name = names[i];
            String consonants = "";

            for (int j = 0; j < name.length(); j++) {
                char ch = Character.toLowerCase(name.charAt(j));

                // Check if it’s a consonant
                if (Character.isLetter(ch) && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    consonants += ch;
                }
            }

            consonantArray[i] = consonants;  // Store result in another array
        }

        // Print both arrays
        System.out.println("\n--- Name and Consonant Array ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Original Name: " + names[i] + " → Consonants Only: " + consonantArray[i]);
        }

        sc.close();
    }
}
