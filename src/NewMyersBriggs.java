import java.util.Scanner;

public class NewMyersBriggs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your Name? ");
        String[] questions = {
                "expend energy, enjoy groups", "interpret literally",
                "logically, thinking, questioning", "organized, orderly",
                "more outgoing, think out loud", "practical, realistic, experiential",
                "candid, straight forward, frank", "plan, schedule",
                "seek many tasks, public activities, interaction with others", "standard, usual, conventional",
                "firm, tend to criticize, hold the line", "regulated, structured",
                "external, communicative, express yourself", "focus on here-and-now",
                "tough-minded, just", "preparation, plan ahead",
                "active, initiate", "facts, things, \"what is\"",
                "matter of fact, issue-oriented", "control, govern"
        };
        char[] extrovertOrIntrovertOptions = {'A', 'B'};
        char[] sensitiveOrIntuitiveOptions = {'A', 'B'};
        char[] thinkerOrFeelerOptions = {'A', 'B'};
        char[] judgingOrPerspectiveOptions = {'A', 'B'};

        int[] counts = new int[8];

        for (int num = 0; num < questions.length; num++) {
            System.out.println((num + 1) + ".\nA. " + questions[num * 2] + "\nB. " + questions[num * 2 + 1]);
            System.out.println("Enter A or B");
            char option = input.next().charAt(0);

            if (num < 10) {
                if (option == extrovertOrIntrovertOptions[0]) counts[0]++;
                else if (option == extrovertOrIntrovertOptions[1]) counts[1]++;
                else System.out.println("Wrong Answer");
            } else if (num < 14) {
                if (option == sensitiveOrIntuitiveOptions[0]) counts[2]++;
                else if (option == sensitiveOrIntuitiveOptions[1]) counts[3]++;
                else System.out.println("Wrong Answer");
            } else if (num < 18) {
                if (option == thinkerOrFeelerOptions[0]) counts[4]++;
                else if (option == thinkerOrFeelerOptions[1]) counts[5]++;
                else System.out.println("Wrong Answer");
            } else {
                if (option == judgingOrPerspectiveOptions[0]) counts[6]++;
                else if (option == judgingOrPerspectiveOptions[1]) counts[7]++;
                else System.out.println("Wrong Answer");
            }
        }

        System.out.println("extrovert is = " + counts[0]);
        System.out.println("introvert is = " + counts[1]);
        System.out.println("intuitive is = " + counts[2]);
        System.out.println("feeler is = " + counts[3]);
        System.out.println("thinker is = " + counts[4]);
        System.out.println("judge is = " + counts[5]);
        System.out.println("perspective is = " + counts[6]);
        System.out.println("sensitive is = " + counts[7]);
        System.out.println();

        extrovertOrIntrovert(counts[0], counts[1]);
        sensitiveOrIntuitive(counts[2], counts[3]);
        thinkerOrFeeler(counts[4], counts[5]);
        judgingOrPerspective(counts[6], counts[7]);
    }

    private static void judgingOrPerspective(int judgingCount, int perspectiveCount) {
        if (judgingCount < perspectiveCount) {
            System.out.print("J");
        } else {
            System.out.print("P");
        }
    }

    private static void thinkerOrFeeler(int thinkerCount, int feelerCount) {
        if (thinkerCount < feelerCount) {
            System.out.print("F");
        } else {
            System.out.print("T");
        }
    }

    private static void sensitiveOrIntuitive(int sensitiveCount, int intuitiveCount) {
        if (sensitiveCount < intuitiveCount) {
            System.out.print("I");
        } else {
            System.out.print("S");
        }
    }

    private static void extrovertOrIntrovert(int extrovertCount, int introvertCount) {
        if (extrovertCount < introvertCount) {
            System.out.print("I");
        } else {
            System.out.print("E");
        }
    }
}
