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

    // Boolean to turn off/on response loop...
    public static boolean on = true;
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
        System.out.println("\n\n"); // Spacing
    }

    public static void continueTalking() {

        System.out
                .println(PURP + "friendBot: " + GREEN + " You wanted to talk some more! How are you feeling?" + RESET);
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
        System.out.println("10) Confused");
        System.out.println(RESET);

    }

    public static void chatPrompt() {

        // How to Respond
        System.out.println(YELLOW
                + "**You can respond to friendBot using either the number (1,2,3) or the respective text(happy,sad,tired)**"
                + RESET);
        System.out.println(
                YELLOW + "                                   ** Messages marked with *FP* are Free Response  **"
                        + RESET);
        System.out.println(
                YELLOW + "                                     ** Enter quit (or q) at anytime to leave  **\n"
                        + RESET);

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

        promptUser();
    }

    public static void promptUser() {

        while (on) {
            System.out.print(BLUE + "Your Response : " + RESET);
            String respond = keyboard.nextLine();

            responseReader(respond);
        }
    }

    public static void responseReader(String resp) {
        String ans = resp.toLowerCase();
        if (ans.equals("q") || ans.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else if (ans.equals("1") || ans.equals("happy")) {
            runHappy();
        } else if (ans.equals("2") || ans.equals("sad")) {
            runSad();
        } else if (ans.equals("3") || ans.equals("overwhelmed")) {
            runOverwhelmed();
        } else if (ans.equals("4") || ans.equals("anxious")) {
            runAnxious();
        } else if (ans.equals("5") || ans.equals("stressed")) {
            runStressed();
        } else if (ans.equals("6") || ans.equals("lonely")) {
            runLonely();
        } else if (ans.equals("7") || ans.equals("excited")) {
            runExcited();
        } else if (ans.equals("8") || ans.equals("embarrassed")) {
            runEmbarrassed();
        } else if (ans.equals("9") || ans.equals("tired")) {
            runTired();
        } else if (ans.equals("10") || ans.equals("confused")) {
            runConfused();
        } else {
            System.out
                    .println(RED + "Sorry, I couldn't read your response, please try using the options above." + RESET);
            promptUser();
        }
    }

    public static void runConfused() {
        System.out.println(PURP + "friendBot: " + GREEN
                + "I am a computer, and even I get confused sometimes! What is confusing you?"
                + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "I can see how that can be confusing, journaling your thoughts may help you have a better understanding of what is going on. Would you like to hear more tips? "
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + " Give yourself a pep talk! Affirmations can help you be more confident and think clearer."
                    + RESET);
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + " For more information about dealing with confusion, check out this link : "
                            + YELLOW
                            + "https://divethru.com/feeling-confused-a-guide-to-your-emotions/\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();

        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + " If you can't nap, try to exercise or simulate your mind until you are ready to sleep. Try to make a plan to get in bed earlier. We all need sleep!"
                            + RESET);
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + " For more information about getting your energy back, check out this link : "
                                    + YELLOW
                                    + "https://www.webmd.com/balance/features/get-energy-back\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();

                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }
    }

    public static void runTired() {
        System.out.println(PURP + "friendBot: " + GREEN
                + "Hey even I get tired sometimes , and I literally run on electricity! . What is making you feel tired?"
                + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "That's understandable, take a nap, you deserve it! Would you like to me to tell you some more ways to deal with being tired?"
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + " If you can't nap, try to exercise or simulate your mind until you are ready to sleep. Try to make a plan to get in bed earlier. We all need sleep!"
                    + RESET);
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + " For more information about getting your energy back, check out this link : "
                            + YELLOW
                            + "https://www.webmd.com/balance/features/get-energy-back\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();

        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + " If you can't nap, try to exercise or simulate your mind until you are ready to sleep. Try to make a plan to get in bed earlier. We all need sleep!"
                            + RESET);
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + " For more information about getting your energy back, check out this link : "
                                    + YELLOW
                                    + "https://www.webmd.com/balance/features/get-energy-back\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();

                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }
    }

    public static void runAnxious() {
        System.out.println(PURP + "friendBot: " + GREEN
                + "Well I am here to make you feel better. What's making you feel anxious?" + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "That's understandable, but don't worry, everything will be okay. Would you like to me to tell you ways to calm you down?"
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + " Try taking a few deep breaths! Or you can do an activity to help calm you down, such as cooking,walking, or reading a good book! "
                    + RESET);
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + " For more information about overcoming anxiety, check out this link : "
                            + YELLOW
                            + "https://www.mayoclinichealthsystem.org/hometown-health/speaking-of-health/11-tips-for-coping-with-an-anxiety-disorder\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();

        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + " Try taking a few deep breaths! Or you can do an activity to help calm you down, such as cooking,walking, or reading a good book! "
                            + RESET);
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + " For more information about overcoming anxiety, check out this link : "
                                    + YELLOW
                                    + "https://www.mayoclinichealthsystem.org/hometown-health/speaking-of-health/11-tips-for-coping-with-an-anxiety-disorder\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();
                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }
    }

    public static void runEmbarrassed() {
        System.out.println(PURP + "friendBot: " + GREEN
                + "Aww, I am sorry you're feeling that way. What happened?" + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "Don't worry, everything will be okay. Would you like to me to encourage you more?"
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + " Everyone makes mistakes. People only remember the mistakes they make, not others'!! "
                    + RESET);
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + " For more information about overcoming embarrassment, check out this link : "
                            + YELLOW + "https://psychcentral.com/blog/how-to-overcome-embarrassment\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();
        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + " Everyone makes mistakes. People only remember the mistakes they make, not others'!! "
                            + RESET);
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + " For more information about overcoming embarrassment, check out this link : "
                                    + YELLOW + "https://psychcentral.com/blog/how-to-overcome-embarrassment\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();
                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }

    }

    public static void runExcited() {
        System.out.println(PURP + "friendBot: " + GREEN
                + "Yay! I am happy you are excited ! What is making you feel excited?" + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "That is EXCITING! I am so glad to hear that. Would you like to hear more about excitement?"
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + " Excitement is a tempory , but powerful emotion! It breaks up the boredom and makes us appreciate our lives! "
                    + RESET);
            System.out.println(
                    PURP + "friendBot: " + GREEN + " For more information about being excited, check out this link : "
                            + YELLOW + "https://divethru.com/feeling-excited-a-guide-to-your-emotions/\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();
        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + " Excitement is a tempory , but powerful emotion! It breaks up the boredom and makes us appreciate our lives! "
                            + RESET);
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + " For more information about being excited, check out this link : "
                                    + YELLOW + "https://divethru.com/feeling-excited-a-guide-to-your-emotions/\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();
                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }
    }

    public static void runLonely() {
        System.out.println(PURP + "friendBot: " + GREEN
                + "You are not alone, I am here for you! What is making you feel lonely?"
                + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "That's understandable. Would you like to hear about ways make you not feel lonely?"
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + "Think about adopting or fostering a pet to keep you company. You can also join a volunteer group to make new friends, or call your friends and family!"
                    + RESET);
            System.out
                    .println(PURP + "friendBot: " + GREEN
                            + " For more ways to deal with loneliness, you can visit this link: "
                            + YELLOW
                            + "https://www.cigna.com/knowledge-center/how-to-deal-with-loneliness\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();
        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + "Think about adopting or fostering a pet to keep you company. You can also join a volunteer group to make new friends, or call your friends and family!"
                            + RESET);
                    System.out
                            .println(PURP + "friendBot: " + GREEN
                                    + " For more ways to deal with loneliness, you can visit this link: "
                                    + YELLOW
                                    + "https://www.cigna.com/knowledge-center/how-to-deal-with-loneliness\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();
                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }
    }

    public static void runStressed() {
        System.out.println(PURP + "friendBot: " + GREEN
                + "Life can get intense! I will try my best to make you feel more at ease. What is making you feel stressed?"
                + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "That's understandable. Would you like to hear about ways to ease your stress?"
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + "Take some time to unwind and relax, put on some of your favorite music, or even go for a walk!"
                    + RESET);
            System.out
                    .println(PURP + "friendBot: " + GREEN
                            + " For more ways to ease your stress, you can visit this link: "
                            + YELLOW
                            + "https://www.cdc.gov/violenceprevention/about/copingwith-stresstips.html\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();
        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + "Take some time to unwind and relax, put on some of your favorite music, or even go for a walk!"
                            + RESET);
                    System.out
                            .println(PURP + "friendBot: " + GREEN
                                    + " For more ways to ease your stress, you can visit this link: "
                                    + YELLOW
                                    + "https://www.cdc.gov/violenceprevention/about/copingwith-stresstips.html\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();
                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }
    }

    public static void runOverwhelmed() {
        System.out.println(PURP + "friendBot: " + GREEN
                + "That's okay, I will try my best to make you feel more at ease. What is making you feel overwhelmed?"
                + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "That's understandable. Would you like to hear about ways to calm down?"
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + "Take a few deep breaths, and if it is really too much, just step away and give yourself some space!"
                    + RESET);
            System.out
                    .println(PURP + "friendBot: " + GREEN + " For more ways to calm down, you can visit this link: "
                            + YELLOW
                            + "https://www.mentalhealthfirstaid.org/2021/03/how-to-take-care-of-yourself-when-youre-feeling-overwhelmed\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();
        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + "Take a few deep breaths, and if it is really too much, just step away and give yourself some space!"
                            + RESET);
                    System.out
                            .println(PURP + "friendBot: " + GREEN
                                    + " For more ways to calm down, you can visit this link: "
                                    + YELLOW
                                    + "https://www.mentalhealthfirstaid.org/2021/03/how-to-take-care-of-yourself-when-youre-feeling-overwhelmed\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();
                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }
    }

    public static void keepTalking() {
        String resp = keyboard.nextLine().toLowerCase();
        if (resp.equals("1") || resp.equals("yes")) {
            continueTalking();
        } else if (resp.equals("2") || resp.equals("no")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + "Okay, I hope you have a great rest of your day !" + RESET);
            System.exit(0);
        } else if (resp.equals("q") || resp.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();
        }

    }

    public static void runHappy() {
        System.out.println(PURP + "friendBot: " + GREEN
                + "Yay! That is great to hear! What is making you feel happy today?" + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "That is awesome ! I am so glad to hear that. Would you like to hear about ways to stay happy?"
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + " You can stay happy by doing activites you enjoy or even just getting out and relaxing in the Sun!  "
                    + RESET);
            System.out.println(PURP + "friendBot: " + GREEN + " For more ways to stay happy, you can visit this link: "
                    + YELLOW + "https://www.cigna.com/knowledge-center/how-to-be-happy\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();

        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + " You can stay happy by doing activites you enjoy or even just getting out and relaxing in the Sun!  "
                            + RESET);
                    System.out.println(
                            PURP + "friendBot: " + GREEN + " For more ways to stay happy, you can visit this link: "
                                    + YELLOW + "https://www.cigna.com/knowledge-center/how-to-be-happy\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();

                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }

    }

    public static void runSad() {

        System.out.println(PURP + "friendBot: " + GREEN
                + "Aww, cheer up buttercup! What is making you feel sad? " + RESET);
        System.out.print(BLUE + "Your Response " + YELLOW + "*FP*" + BLUE + ": " + RESET);
        String freeResponseAnswer = keyboard.nextLine();

        System.out.println(PURP + "friendBot: " + GREEN
                + "I am sorry to hear that :( . Don't worry, it will pass. Would you like to hear about ways to overcome sadness?"
                + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();
        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            System.out.println(PURP + "friendBot: " + GREEN
                    + " You can stay overcome your sadness by being around other people or watching your favorite movie! Pets are also a great companion to help boost your mood."
                    + RESET);
            System.out
                    .println(PURP + "friendBot: " + GREEN
                            + " For more ways to overcome sadness, you can visit this link: "
                            + YELLOW + "https://www.cdc.gov/howrightnow/resources/coping-with-sadness/index.html\n");

            System.out.println(
                    PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            keepTalking();
        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            runNoResponse();
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        } else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    System.out.println(PURP + "friendBot: " + GREEN
                            + " You can stay overcome your sadness by being around other people or watching your favorite movie! Pets are also a great companion to help boost your mood."
                            + RESET);
                    System.out
                            .println(PURP + "friendBot: " + GREEN
                                    + " For more ways to overcome sadness, you can visit this link: "
                                    + YELLOW
                                    + "https://www.cdc.gov/howrightnow/resources/coping-with-sadness/index.html\n");

                    System.out.println(
                            PURP + "friendBot: " + GREEN + " Would you like to keep talking?" + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                    keepTalking();
                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    runNoResponse();
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }

        }

    }

    public static void runNoResponse() {
        System.out.println(
                PURP + "friendBot: " + GREEN + " Okay, is there anything else you want to talk about? " + RESET);
        System.out.println(CYAN + "1) Yes");
        System.out.println("2) No \n");
        System.out.print(BLUE + "Your Response : " + RESET);
        String yesOrNo = keyboard.nextLine().toLowerCase();

        if (yesOrNo.equals("yes") || yesOrNo.equals("1")) {
            continueTalking();
        } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
            System.out.println(
                    PURP + "friendBot: " + GREEN + " Okay, I hope you have a great rest of your day ! Goodbye! "
                            + RESET);
        } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
            System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
            System.exit(0); // System exit 0 = clean exit.
        }

        else {
            System.out.println(
                    PURP + "friendBot: " + GREEN
                            + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                            + RESET);
            System.out.print(BLUE + "Your Response : " + RESET);
            boolean on2 = true;
            while (on2) {
                String yesOrNo2 = keyboard.nextLine().toLowerCase();
                if (yesOrNo2.equals("yes") || yesOrNo2.equals("1")) {
                    continueTalking();
                } else if (yesOrNo.equals("no") || yesOrNo.equals("2")) {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "Okay, I hope you have a great rest of your day! Goodbye !");
                    System.exit(0);
                } else if (yesOrNo.equals("q") || yesOrNo.equals("quit")) {
                    System.out.println(PURP + "friendBot: " + GREEN + "Goodbye! Have a good day !" + RESET);
                    System.exit(0); // System exit 0 = clean exit.
                } else {
                    System.out.println(
                            PURP + "friendBot: " + GREEN
                                    + "I'm sorry, I didn't understand your response. Please respond with either yes or no."
                                    + RESET);
                    System.out.print(BLUE + "Your Response : " + RESET);
                }
            }
        }

    }
}