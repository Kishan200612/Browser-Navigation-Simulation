import java.util.Stack;

public class Browser {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public Browser() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = "home";
    }

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear(); // visiting a new page resets forward history
        System.out.println("Visited: " + currentPage);
    }

    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No back history.");
        }
    }

    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No forward history.");
        }
    }

    public void currentPage() {
        System.out.println("Current page: " + currentPage);
    }
}
