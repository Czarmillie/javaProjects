import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int numStudents = scanner.nextInt();

        System.out.print("How many subjects do they offer? ");
        int numSubjects = scanner.nextInt();

        int[][] scores = new int[numStudents][numSubjects];
        for (int count = 0; count < numStudents; count++) {
            System.out.println("Entering scores for Student " + (count + 1));
            for (int num = 0; num < numSubjects; num++) {
                System.out.print("Enter score for subject " + (num + 1) + ": ");
                scores[count][num] = scanner.nextInt();
            }
        }

        displayClassSummary(scores);
        displaySubjectSummary(scores);
        displayHardestAndEasiestSubjects(scores);
        displayOverallScores(scores);
    }

    public static void displayClassSummary(int[][] scores) {
        System.out.println("==========================================");
        System.out.println("STUDENT\t\tSUB1\tSUB2\tSUB3\tTOT\t\tAVE\t\tPOS");
        System.out.println("==========================================");

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int score : scores[i]) {
                total += score;
            }
            double average = (double) total / scores[i].length;

            System.out.printf("Student %d", (i + 1));
            for (int score : scores[i]) {
                System.out.print("\t\t" + score);
            }
            System.out.printf("\t\t%d\t\t%.2f\t\t%d\n", total, average, (i + 1));
        }
        System.out.println("==========================================");
    }

    public static void displaySubjectSummary(int[][] scores) {
        System.out.println("SUBJECT SUMMARY");

        for (int j = 0; j < scores[0].length; j++) {
            int highest = -1;
            int lowest = 101;
            int total = 0;
            int passes = 0;
            int failures = 0;

            for (int i = 0; i < scores.length; i++) {
                int score = scores[i][j];
                total += score;

                if (score >= 50) {
                    passes++;
                } else {
                    failures++;
                }

                if (score > highest) {
                    highest = score;
                }

                if (score < lowest) {
                    lowest = score;
                }
            }

            double average = (double) total / scores.length;

            System.out.println("Subject " + (j + 1));
            System.out.println("Highest scoring student is: Student " + (highest + 1) + " scoring " + highest);
            System.out.println("Lowest scoring student is: Student " + (lowest + 1) + " scoring " + lowest);
            System.out.println("Total score is: " + total);
            System.out.printf("Average score is: %.2f\n", average);
            System.out.println("Number of passes: " + passes);
            System.out.println("Number of failures: " + failures);
            System.out.println();
        }
    }

    public static void displayHardestAndEasiestSubjects(int[][] scores) {
        int hardestSubject = -1;
        int easiestSubject = -1;
        int minFailures = scores.length + 1;
        int maxPasses = -1;

        for (int j = 0; j < scores[0].length; j++) {
            int failures = 0;
            int passes = 0;

            for (int i = 0; i < scores.length; i++) {
                int score = scores[i][j];

                if (score < 50) {
                    failures++;
                } else {
                    passes++;
                }
            }

            if (failures < minFailures) {
                hardestSubject = j;
                minFailures = failures;
            }

            if (passes > maxPasses) {
                easiestSubject = j;
                maxPasses = passes;
            }
        }

        System.out.println("The hardest subject is Subject " + (hardestSubject + 1) + " with " + minFailures + " failures");
        System.out.println("The easiest subject is Subject " + (easiestSubject + 1) + " with " + maxPasses + " passes");

    }

    public static void displayOverallScores(int[][] scores) {
        int bestStudent = -1;
        int worstStudent = -1;
        int maxTotal = -1;
        int minTotal = scores[0].length * 101;
        int totalScores = 0;

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int score : scores[i]) {
                total += score;
                totalScores += score;
            }

            if (total > maxTotal) {
                bestStudent = i;
                maxTotal = total;
            }

            if (total < minTotal) {
                worstStudent = i;
                minTotal = total;
            }
        }

        System.out.println("CLASS SUMMARY");
        System.out.println("==========================================");
        System.out.println("Best Graduating Student is: Student " + (bestStudent + 1) + " scoring " + maxTotal);
        System.out.println("==========================================");

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Worst Graduating Student is: Student " + (worstStudent + 1) + " scoring " + minTotal);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        double classAverage = (double) totalScores / (scores.length * scores[0].length);
        System.out.println("==========================================");
        System.out.println("Class total score is: " + totalScores);
        System.out.printf("Class average score is: %.2f\n", classAverage);
        System.out.println("==========================================");
    }
}
