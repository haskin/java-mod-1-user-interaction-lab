import java.util.Scanner;

public class Main {
    private static final String CHILD_GREETING = "Wow! A whipper snapper!";
    private static final String TEEN_GREETING = "How Do You Do, Fellow Kids?";
    private static final String EIGHTEEN_GREETING = "Wow eighteen. A number that is one more than seventeen.";
    private static final String ADULT_GREETING = "Parties over. Get back to work!";

    public static void main(String[] args) {
        System.out.println(chooseGreeting(getAge()));
    }

    /**
     * Gets the users age using the CLI.
     * 
     * @return
     */
    public static int getAge() {
        String question = "Please enter your age:";
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.println(question);
                    return scanner.nextInt();
                } catch (Exception e) {
                    question = "Please enter a VALID age:";
                    scanner.next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Display a greeting to them based on whether they are younger or older than
     * 18. Take care to handle the case where they are exactly 18.
     * Display an extra special message to them if they are younger than 10.
     * 
     * @param age
     * @return
     */
    public static String chooseGreeting(int age) {
        if (age < 10)
            return CHILD_GREETING;
        if (age < 18)
            return TEEN_GREETING;
        if (age > 18)
            return ADULT_GREETING;
        return EIGHTEEN_GREETING;
    }
}
