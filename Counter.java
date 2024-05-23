import java.util.Scanner;

public class Counter {
    private int count;

    // Constructor
    public Counter() {
        count = 0; // Initializing counter to 0
    }

    // Method to increment the counter
    public void increment() {
        count++;
    }

    // Method to decrement the counter
    public void decrement() {
        if (count > 0) {
            count--;
        } else {
            System.out.println("Counter cannot be decremented further, it's already at 0.");
        }
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter(); // Creating an instance of Counter
        Scanner scanner = new Scanner(System.in);

        // Menu for user interaction
        System.out.println("Counter Program");
        System.out.println("1. Increment");
        System.out.println("2. Decrement");
        System.out.println("3. Display Count");
        System.out.println("0. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    counter.increment();
                    System.out.println("Count incremented.");
                    break;
                case 2:
                    counter.decrement();
                    System.out.println("Count decremented.");
                    break;
                case 3:
                    System.out.println("Current Count: " + counter.getCount());
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
