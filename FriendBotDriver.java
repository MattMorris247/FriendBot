import java.util.Scanner;

public class FriendBotDriver {

    /**
     * Colar Scheme Console
     * Make sure to place a RESET after any color change...
     */
    public static final String RESET = "\033[0m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String PURP = "\u001B[35m";
    public static final String RED = "\u001B[31m";
    public static final String CYAN = "\u001B[36m";
    // Scanner Object to read user input
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        welcomePrompt();

        chatPrompt();

        promptUser();

    }

    public static void welcomePrompt() {
        System.out.println(CYAN +
                " __          __  _                            _          " + GREEN + "______    _                _   "
                + CYAN + "____        _     _ ");
        System.out.println(
                " \\ \\        / / | |                          | |        " + GREEN
                        + "|  ____|  (_)              | |" + CYAN + " |  _ \\      | |   | |");
        System.out.println(
                "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___   " + GREEN
                        + "| |__ _ __ _  ___ _ __   __| |" + CYAN + " | |_) | ___ | |_  | |");
        System.out.println(
                "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  " + GREEN
                        + "|  __| '__| |/ _ \\ '_ \\ / _` |" + CYAN + " |  _ < / _ \\| __| | |");
        System.out.println(
                "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | " + GREEN
                        + "| |  | |  | |  __/ | | | (_| |" + CYAN + " | |_) | (_) | |_  |_|");
        System.out.println(
                "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  " + GREEN
                        + "|_|  |_|  |_|\\___|_| |_|\\__,_|" + CYAN + " |____/ \\___/ \\__| (_)"
                        + BLUE + "            -Molly Gilson and Matt Morris" + RESET);
        System.out.println("\n\n\n\n"); // Spacing
    }

    public static void chatPrompt() {

        // How to Respond
        System.out.println(YELLOW
                + "**You can respond to friendBot using either the number (1,2,3) or the respective text(happy,sad,mad)**"
                + RESET);
        System.out.println(
                YELLOW + "                                   **Enter quit (or q) at anytime to leave.**\n" + RESET);

        // Initial Greeting
        System.out.println(PURP + "friendBot: " + GREEN + "Hello Friend! How are you feeling today?" + RESET);
        System.out.println(YELLOW + "**Responses availible**" + CYAN);
        System.out.println("1) Happy");
        System.out.println("2) Sad");
        System.out.println("3) Overwhelmed");
        System.out.println("4) Anxious");
        System.out.println("5) Stressed");
        System.out.println("6) Lonely");
        System.out.println("7) Excited");
        System.out.println("8) Embarrassed");
        System.out.println("9) Tired");
        System.out.println("10) one more");
        System.out.println(RESET);
    }

    public static void promptUser() {
        boolean on = true;
        while (on) {
            System.out.print(BLUE + "Your Response : " + RESET);
            String respond = keyboard.nextLine();

            System.out.println(RED + "DEBUG:: RESPONSE = " + respond + RESET);

            responseReader(respond);
        }
    }

    public static void responseReader(String resp) {
        String ans = resp.toLowerCase();
        if (ans.equals("q") || ans.equals("quit")) {
            System.out.println(PURP + "friendBot: Good bye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else if (ans.equals("1") || ans.equals("happy")) {
            runHappy();
        } else {
            System.out
                    .println(RED + "Sorry, I couldn't read your response, please try using the options above." + RESET);
            promptUser();
        }
    }

    public static void runHappy() {
        System.out.println(RED + "DEBUG - inside Happy" + RESET);
    }
}