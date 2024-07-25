//This is a chatbot! It will chat with you. Ask you questions, and tell you stories.
//need to 'scan' for inputs
import java.util.Locale;
import java.util.Scanner;

public class ChatBot {
    //class scoped variables


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(greeting());
        String deaf = in.nextLine();
        System.out.println(repeatName());
        String name = in.nextLine();
        System.out.println(hello(name));
        int userAge = age();

        if (userAge == 0) {
            System.out.println("Okay, no more games!");
        }
        count();
        quiz();
    }


    //Greeting the user
    public static String greeting() {
        return "Hello friend! What is your name?";
    }
    //ask to repeat name
    public static String repeatName() {
        return "Come again?";
    }
    //address user by name
    public static String hello(String name) {
        return "Oh! " + name + ". Hello " + name + ". Nice to meet you.";
    }
    //Guess user's age via questions
    public static int age() {
        Scanner in = new Scanner(System.in);
        System.out.println("I have some questions for you. But first -");
        System.out.println("You must be 18 years or older to play. Are you over 18 years old? (Answer 'y' for yes or 'n' for no)");
        String a18 = in.nextLine().toLowerCase();
        if (a18.equals("n")) {
            return 0;
        } else if (a18.equals("y")) {
            System.out.println("Okay, great! Now, my next question. If you are 72 years old or older -");
            System.out.println("I want you to go out and enjoy your retirement! Not play games with me.");
            System.out.println("So, are you 72 years old or older?");
            //store wether they are 72 or older
            String a72 = in.nextLine().toLowerCase();
            if (a72.equals("y")) {
                return 0;
            } else if (a72.equals("n")) {
                //here they are between 18 and 72.
                System.out.println("Ah, so you are working age along with me. We will get there my friend, but no rush.");
                System.out.println("Now let me ask you, are you over the hill yet? People tell me, when you hit 40, you're over the hill!");
                //are they over or under 40
                String a40 = in.nextLine().toLowerCase();
                if (a40.equals("y")) {
                    //they are between 40 and 72.
                    System.out.println("Well, it's easier to walk down hill then up!");
                    System.out.println("Were you born between 1966 and 1953?");//58 to 71
                    String a58to71 = in.nextLine().toLowerCase();
                    if (a58to71.equals("y")) {
                        //58 to 71
                        System.out.println("Okay, good. How about during or before 1959?");
                        //58 to 64 or 65 to 71
                        String a65to72 = in.nextLine().toLowerCase();
                        if (a65to72.equals("y")) {
                            //65 to 71
                            System.out.println("Oh... I won't say you're old.");
                            System.out.println("Well, tell me this, were you born before 1956?");
                            String a69to71 = in.nextLine().toLowerCase();
                            if (a69to71.equals("y")) { //69 to 71
                                //have they reached the year of their age yet.
                                System.out.println("Have you had your birthday, yet, this year?");
                                String b69to71 = in.nextLine().toLowerCase();
                                if (b69to71.equals("y")) {
                                    System.out.println("How about this, which year were you born in, 1953, 1954, or 1955?");
                                    int year69to71 = in.nextInt();
                                    if (year69to71 == 1953) {
                                        System.out.println("Wow, you are 71 years old!");
                                        return 71;
                                    } else if (year69to71 == 1954) {
                                         System.out.println("Wow, you are 70 years old!");
                                         return 70;
                                    } else {
                                        System.out.println("Wow, you are 69 years old!");
                                        return 69;
                                    }
                                } else if (b69to71.equals("n")) {
                                    System.out.println("How about this, which year were you born in, 1953, 1954, or 1955?");
                                    int year69to71 = in.nextInt();
                                    if (year69to71 == 1953) {
                                        System.out.println("Wow, you are 70 years old!");
                                        return 70;
                                    } else if (year69to71 == 1954) {
                                        System.out.println("Wow, you are 69 years old!");
                                        return 69;
                                    } else {
                                        System.out.println("Wow, you are 68 years old!");
                                        return 68;
                                    }
                                }

                            } else if (a69to71.equals("n")) {
                                System.out.println("Have you had your birthday, yet, this year?");
                                String b69to71 = in.nextLine().toLowerCase();
                                if (b69to71.equals("y")) {
                                    System.out.println("How about this, which year were you born in, 1956, 1957, 1958, or 1959?");
                                    int year65to68 = in.nextInt();
                                    if (year65to68 == 1956) {
                                        System.out.println("Wow, you are 68 years old!");
                                        return 68;
                                    } else if (year65to68 == 1957) {
                                        System.out.println("Wow, you are 67 years old!");
                                        return 67;
                                    } else if (year65to68 == 1958) {
                                        System.out.println("Wow, you are 66 years old!");
                                        return 66;
                                    } else {
                                        System.out.println("Wow, you are 65 years old!");
                                        return 65;
                                    }
                                } else if (b69to71.equals("n")) {
                                    System.out.println("How about this, which year were you born in, 1956, 1957, 1958, or 1959?");
                                    int year65to68 = in.nextInt();
                                    if (year65to68 == 1956) {
                                        System.out.println("Wow, you are 67 years old!");
                                        return 67;
                                    } else if (year65to68 == 1957) {
                                        System.out.println("Wow, you are 66 years old!");
                                        return 66;
                                    } else if (year65to68 == 1958) {
                                        System.out.println("Wow, you are 65 years old!");
                                        return 65;
                                    } else {
                                        System.out.println("Wow, you are 64 years old!");
                                        return 64;
                                    }
                                }
                            }
                        } else if (a65to72.equals("n")) {
                            System.out.println("Have you had your birthday, yet, this year?");
                            String b58to64 = in.nextLine().toLowerCase();
                            if (b58to64.equals("y")) {
                                System.out.println("Which year were you born?");
                                int year = in.nextInt();
                                System.out.println("You are " + calcAge(year) + "years old.");
                                return calcAge(year);
                            } else if (b58to64.equals("n")) {
                                System.out.println("Which year were you born?");
                                int year = in.nextInt();
                                System.out.println("You are " + (calcAge(year) - 1) + "years old.");
                                return calcAge(year) - 1;
                            }
                        }

                    } else if (a58to71.equals("n")) {
                        System.out.println("Have you had your birthday, yet, this year?");
                        String a40to58 = in.nextLine().toLowerCase();
                        if (a40to58.equals("y")) {
                            System.out.println("Which year were you born?");
                            int year = in.nextInt();
                            System.out.println("You are " + calcAge(year) + "years old.");
                            return calcAge(year);
                        } else if (a40to58.equals("n")) {
                            System.out.println("Which year were you born?");
                            int year = in.nextInt();
                            System.out.println("You are " + (calcAge(year) - 1) + "years old.");
                            return calcAge(year) - 1;
                        }
                    }
                } else if (a40.equals("n")) {
                    //under 40 questions
                    System.out.println("Ah, so you are still walking uphill!");
                    System.out.println("Have you had your birthday, yet, this year?");
                    String a18to40 = in.nextLine().toLowerCase();
                    if (a18to40.equals("y")) {
                        System.out.println("Which year were you born?");
                        int year = in.nextInt();
                        System.out.println("You are " + calcAge(year) + "years old.");
                        return calcAge(year);
                    } else if (a18to40.equals("n")) {
                        System.out.println("Which year were you born?");
                        int year = in.nextInt();
                        System.out.println("You are " + (calcAge(year) - 1) + "years old.");
                        return calcAge(year) - 1;
                    }
                }
            }
        }
        return 0;
    }
    private static int calcAge(int year) {
            int curYear = 2024;
            return curYear - year;

    }
    //Count to a user input number
    public static void count() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 5 and 20:");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
    //multiple choice programming question. User can keep guessing until they get it right.
    public static void quiz() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Which of the following statements is true about Java?");
            System.out.println(" ");
            System.out.println("a) Java is a procedural programming language.");
            System.out.println("b) Java does not support object-oriented programming.");
            System.out.println("c) Java programs are platform-independent due to the Java Virtual Machine (JVM).");
            System.out.println("d) Java does not support multi-threading.");
            String answer = in.nextLine().toLowerCase();
            if (answer.equals("c")) {
                System.out.println("Correct!");
                break;
            }
            System.out.println("Sorry, wrong answer. Try again.");
            System.out.println("--------------------------------");
        }
    }
    //tell a story from user inputs
    //switch statement to tell a phrase about each day of the week - choose 1 at a time (i.e. user inputs a # 1-7)
}
