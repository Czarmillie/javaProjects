import java.util.Scanner;
public class MyersBriggs {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userInput = input.next();
        String options;
        int extrovertCount = 0;
        int introvertCount = 0;
        int sensitiveCount = 0;
        int intuitiveCount = 0;
        int thinkerCount = 0;
        int feelerCount = 0;
        int judgingCount = 0;
        int perspectiveCount = 0;
        for (int num = 1; num <= 20; num++) {
            switch (num) {
                case 1 -> {
                    System.out.println("""
                            1).
                            A. expend energy, enjoy groups
                            B. conserve energy, enjoy one-on-one
                            """);
                    options = input.next();
                    if (options.equals("A")) extrovertCount++;
                    else if (options.equals("B")) introvertCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 2 -> {
                    System.out.println("""
                            2).
                            A. interpret literally
                            B. look for meaning and possibilities
                            """);
                    options = input.next();
                    if (options.equals("A")) sensitiveCount++;
                    else if (options.equals("B")) intuitiveCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 3 -> {
                    System.out.println("""
                            3).
                            A. logically, thinking, questioning
                            B. empathetic, feeling, accommodating
                            """);
                    options = input.next();
                    if (options.equals("A")) thinkerCount++;
                    else if (options.equals("B")) feelerCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 4 -> {
                    System.out.println("""
                            4).
                            A. organized, orderly
                            B. flexible, adaptable
                            """);
                    options = input.next();
                    if (options.equals("A")) judgingCount++;
                    else if (options.equals("B")) perspectiveCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 5 -> {
                    System.out.println("""
                            5).
                            A. more outgoing, think out loud
                            B. more reserved, think to yourself
                            """);
                    options = input.next();
                    if (options.equals("A")) extrovertCount++;
                    else if (options.equals("B")) introvertCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 6 -> {
                    System.out.println("""
                            6).
                            A. practical, realistic, experiential
                            B. imaginative, innovative, theoretical
                            """);
                    options = input.next();
                    if (options.equals("A")) sensitiveCount++;
                    else if (options.equals("B")) intuitiveCount++;
                    else {
                        System.out.println("Wrong Answer");
                    }
                }
                case 7 -> {
                    System.out.println("""
                            7).
                            A. candid, straight forward, frank
                            B. tactful, kind, encourage
                            """);
                    options = input.next();
                    if (options.equals("A")) thinkerCount++;
                    else if (options.equals("B")) feelerCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 8 -> {
                    System.out.println("""
                            8).
                            A. plan, schedule
                            B. unplanned, spontaneous
                            """);
                    options = input.next();
                    if (options.equals("A")) judgingCount++;
                    else if (options.equals("B")) perspectiveCount++;
                    else {
                        System.out.println("Wrong Answer");
                    }
                }
                case 9 -> {
                    System.out.println("""
                            9).
                            A. seek many tasks, public activities, interaction with others
                            B. seek private, solitary activities with quiet to concentrate
                            """);
                    options = input.next();
                    if (options.equals("A")) extrovertCount++;
                    else if (options.equals("B")) introvertCount++;
                    else {
                        System.out.println("Wrong Answer");
                    }
                }
                case 10 -> {
                    System.out.println("""
                            10).
                            A. standard, usual, conventional
                            B. different, novel, unique
                            """);
                    options = input.next();
                    if (options.equals("A")) sensitiveCount++;
                    else if (options.equals("B")) intuitiveCount++;
                    else {
                        System.out.println("Wrong Answer");
                    }
                }
                case 11 -> {
                    System.out.println("""
                            11).
                            A. firm, tend to criticize, hold the line
                            B. gentle, tend to appreciate, concise
                            """);
                    options = input.next();
                    if (options.equals("A")) thinkerCount++;
                    else if (options.equals("B")) feelerCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 12 -> {
                    System.out.println("""
                            12).
                            A. regulated, structured
                            B. easygoing, "live" and "let live"
                            """);
                    options = input.next();
                    if (options.equals("A")) judgingCount++;
                    else if (options.equals("B")) perspectiveCount++;
                    else {
                        System.out.println("Wrong Answer");
                    }
                }
                case 13 -> {
                    System.out.println("""
                            13).
                            A. external, communicative, express yourself
                            B. internal, reticent, keep to yourself
                            """);
                    options = input.next();
                    if (options.equals("A")) extrovertCount++;
                    else if (options.equals("B")) introvertCount++;
                    else {
                        System.out.println("Wrong Answer");
                    }
                }
                case 14 -> {
                    System.out.println("""
                            14).
                            A. focus on here-and-now
                            B. look to the future, global perspective, "big picture"
                            """);
                    options = input.next();
                    if (options.equals("A")) sensitiveCount++;
                    else if (options.equals("B")) intuitiveCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 15 -> {
                    System.out.println("""
                            15).
                            A. tough-minded, just
                            B. tender-hearted, merciful
                            """);
                    options = input.next();
                    if (options.equals("A")) thinkerCount++;
                    else if (options.equals("B")) feelerCount++;
                    else {
                        System.out.println("Wrong Answer");
                    }
                }
                case 16 -> {
                    System.out.println("""
                            16).
                            A. preparation, plan ahead
                            B. go with the flow, adapt as you go
                            """);
                    options = input.next();
                    if (options.equals("A")) judgingCount++;
                    else if (options.equals("B")) perspectiveCount++;
                    else {
                        System.out.println("Wrong Answer");
                    }
                }
                case 17 -> {
                    System.out.println("""
                            17).
                            A. active, initiate
                            B. reflective, deliberate
                            """);
                    options = input.next();
                    if (options.equals("A")) extrovertCount++;
                    else if (options.equals("B")) introvertCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 18 -> {
                    System.out.println("""
                            18).
                            A. facts, things, "what is"
                            B. ideas, dreams, "what could be", philosophical
                            """);
                    options = input.next();
                    if (options.equals("A")) sensitiveCount++;
                    else if (options.equals("B")) intuitiveCount++;
                    else {
                        System.out.println("Wrong Answer");
                    }
                }
                case 19 -> {
                    System.out.println("""
                            19).
                            A. matter of fact, issue-oriented
                            B. sensitive, people-oriented, compassionate
                            """);
                    options = input.next();
                    if (options.equals("A")) thinkerCount++;
                    else if (options.equals("B")) feelerCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
                case 20 -> {
                    System.out.println("""
                            20).
                            A. control, govern
                            B. latitude, freedom
                            """);
                    options = input.next();
                    if (options.equals("A")) judgingCount++;
                    else if (options.equals("B")) perspectiveCount++;
                    else {
                        System.out.println("Wrong Answer ");
                    }
                }
            }
        }
        System.out.println("extrovert is = " + extrovertCount);
        System.out.println("introvert is = " + introvertCount);
        System.out.println("intuitive is = " + intuitiveCount);
        System.out.println("feeler is = " + feelerCount);
        System.out.println("thinker is = " + thinkerCount);
        System.out.println("judge is = " + judgingCount);
        System.out.println("perspective is = " + perspectiveCount);
        System.out.println("sensitive is = " + sensitiveCount);
        System.out.println();


        extrovertOrIntrovert(extrovertCount, introvertCount);
        sensitiveOrIntuitive(sensitiveCount, intuitiveCount);
        thinkerOrFeeler(thinkerCount, feelerCount);
        judgingOrPerspective(judgingCount, perspectiveCount);
    }

    private static void judgingOrPerspective(int judgingCount, int perspectiveCount) {
        if(judgingCount < perspectiveCount){
            System.out.print("J");
        } else System.out.print("P");
    }

    private static void thinkerOrFeeler(int thinkerCount, int feelerCount) {
        if(thinkerCount < feelerCount){
            System.out.print("F");
        } else System.out.print("T");
    }

    private static void sensitiveOrIntuitive(int sensitiveCount, int intuitiveCount) {
        if(sensitiveCount < intuitiveCount){
            System.out.print("I");
        } else System.out.print("S");
    }

    private static void extrovertOrIntrovert(int extrovertCount, int introvertCount) {
        if(extrovertCount < introvertCount){
            System.out.print("I");
        } else System.out.print("E");
    }
}