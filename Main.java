import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Reading the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int se = sc.nextInt(); // Element to search

        boolean found = false; // Flag to track if the element is found

        // Loop to search for the element and print all occurrences
        for (int i = 0; i < n; i++) {
            if (se == arr[i]) {
                System.out.println(se + " is at index " + i);
                found = true; // Set flag to true if element is found
                break;
            }
        }

        // If element is not found, print "F of!!"
        if (!found) {
            System.out.println("No !!!");
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}

       