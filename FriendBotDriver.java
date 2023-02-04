
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

    public static void main(String[] args) {
        welcomePrompt();
    }

    public static void welcomePrompt() {
        System.out.println(BLUE +
                " __          __  _                            _          " + GREEN + "______    _                _   "
                + BLUE + "____        _     _ ");
        System.out.println(
                " \\ \\        / / | |                          | |        " + GREEN
                        + "|  ____|  (_)              | |" + BLUE + " |  _ \\      | |   | |");
        System.out.println(
                "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___   " + GREEN
                        + "| |__ _ __ _  ___ _ __   __| |" + BLUE + " | |_) | ___ | |_  | |");
        System.out.println(
                "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  " + GREEN
                        + "|  __| '__| |/ _ \\ '_ \\ / _` |" + BLUE + " |  _ < / _ \\| __| | |");
        System.out.println(
                "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | " + GREEN
                        + "| |  | |  | |  __/ | | | (_| |" + BLUE + " | |_) | (_) | |_  |_|");
        System.out.println(
                "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  " + GREEN
                        + "|_|  |_|  |_|\\___|_| |_|\\__,_|" + BLUE + " |____/ \\___/ \\__| (_)"
                        + RESET);
    }

}