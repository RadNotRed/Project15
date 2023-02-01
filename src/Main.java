import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the array of size 1000
        int[] arr = new int[1000];

        // Initialize a Scanner object to read inputs
        Scanner sc = new Scanner(System.in);

        // Initialize a Server object
        Server server = new Server();

        // Fill the array with random integers between 34 and 918
        for (int i = 0; i < 1000; i++) {
            arr[i] = (int) (Math.random() * 884) + 34;
        }

        // Print prompt to ask user for sorting method
        System.out.println("Which sorting method would you like to use?");
        System.out.println("1. Selection sort");
        System.out.println("2. Bubble sort");
        System.out.println("3. Insertion sort");

        // Read the choice of sorting method
        int choice = sc.nextInt();
        sc.nextLine();

        // Call appropriate sorting method based on user's choice
        switch (choice) {
            case 1 -> server.selectionSort(arr);
            case 2 -> server.bubbleSort(arr);
            case 3 -> server.insertionSort(arr);
        }

        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + ": " + arr[i]);
        }

        // Print prompt to ask user for number to find
        System.out.println("Enter the number you want to find: ");

        // Read the number to find
        int num = sc.nextInt();

        // Call linear search method and print result
        System.out.println("Linear search result: " + server.linearSearch(arr, num));

        // Call binary search method and print result
        System.out.println("Binary search result: " + server.binarySearch(arr, num));
    }
}
