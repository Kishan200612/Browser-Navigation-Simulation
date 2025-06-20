import java.util.Scanner;

public class BrowserApp {
    public static void main(String[] args) {
        Browser browser = new Browser();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Browser Navigation ---");
            System.out.println("1. Visit a new page");
            System.out.println("2. Go back");
            System.out.println("3. Go forward");
            System.out.println("4. Show current page");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter URL to visit: ");
                    String url = scanner.nextLine();
                    browser.visit(url);
                    break;
                case 2:
                    browser.goBack();
                    break;
                case 3:
                    browser.goForward();
                    break;
                case 4:
                    browser.currentPage();
                    break;
                case 5:
                    System.out.println("Exiting browser...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
