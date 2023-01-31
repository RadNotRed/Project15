import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Scanner sc = new Scanner(System.in);
        Server server = new Server();

        // Fill the array with random integers
        for (int i = 0; i < 1000; i++) {
            arr[i] = (int) (Math.random() * 884) + 34;
        }

        System.out.println("Which sorting method would you like to use?");
        System.out.println("1. Selection sort");
        System.out.println("2. Bubble sort");
        System.out.println("3. Insertion sort");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1 -> server.selectionSort(arr);
            case 2 -> server.bubbleSort(arr);
            case 3 -> server.insertionSort(arr);
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + ": " + arr[i]);
        }

        System.out.println("Enter the number you want to find: ");
        int num = sc.nextInt();

        System.out.println("Linear search result: " + server.linearSearch(arr, num));
        System.out.println("Binary search result: " + server.binarySearch(arr, num));
    }
}
