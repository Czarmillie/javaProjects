import java.util.Scanner;

public class LagbajaGradesApp {
    private static double highestScore;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Students do you have? ");
        int numOfStudents = scanner.nextInt();

        System.out.print("How many Subjects do they offer? ");
        int numOfSubjects = scanner.nextInt();

        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        String[] studentNames = new String[numOfStudents];
        double[][] studentScores = new double[numOfStudents][numOfSubjects];

        for (int index = 0; index < numOfStudents; index++) {
            System.out.print("Enter the name of student " + (index + 1) + ": ");
            scanner.nextLine();
            studentNames[index] = scanner.nextLine();

            for (int num = 0; num < numOfSubjects; num++) {
                do {
                    System.out.print("Enter the score for subject " + (num + 1) + " for student " + studentNames[index] + ": ");
                    studentScores[index][num] = scanner.nextDouble();
                } while (studentScores[index][num] < 0 || studentScores[index][num] > 100);
            }
            System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saved successfully");
        }

        System.out.println("==================================================================");
        System.out.print("STUDENT\t\t ");
        for (int num = 0; num < numOfSubjects; num++) {
            System.out.print("SUB"+(num+1)+"\t\t  ");
        }
        System.out.print("TOT\t\t  ");
        System.out.print("AVE\t\t");
        System.out.print("POS");
        System.out.println();
        System.out.println("==================================================================");
        System.out.println("==================================================================");

        for (int index = 0; index < numOfStudents; index++) {
            System.out.print(studentNames[index] + "\t\t");
            double total = 0;
            for (int num = 0; num < numOfSubjects; num++) {
                total += studentScores[index][num];
                System.out.print(studentScores[index][num] + "\t\t");
            }
            double average = total / numOfSubjects;
            int position = index + 1;
            System.out.print(total + "\t\t");
            System.out.printf("%.2f", average);
            System.out.print("\t\t" + position);
            System.out.println();
        }
        System.out.println("==================================================================");

        for (int subjectNum = 0; subjectNum < numOfSubjects; subjectNum++) {
            System.out.println("\nSubject " + (subjectNum + 1));

            double highestScore = studentScores[0][subjectNum];
            double lowestScore = studentScores[0][subjectNum];
            for (int index = 1; index < numOfStudents; index++) {
                double currentScore = studentScores[index][subjectNum];
                if (currentScore > highestScore) {
                    highestScore = currentScore;
                }
                if (currentScore < lowestScore) {
                    lowestScore = currentScore;
                }
            }
            System.out.println("Highest scoring student is: " + studentNames[findIndex(studentScores, highestScore, subjectNum)] + " scoring " + highestScore);
            System.out.println("Lowest scoring student is: " + studentNames[findIndex(studentScores, lowestScore, subjectNum)] + " scoring " + lowestScore);

            double totalScore = 0;
            for (int index = 0; index < numOfStudents; index++) {
                totalScore += studentScores[index][subjectNum];
            }
            double averageScore = totalScore / numOfStudents;
            System.out.println("Total score is: " + totalScore);
            System.out.printf("Average score is: %.2f\n", averageScore);

            int passes = 0;
            int fails = 0;
            for (int index = 0; index < numOfStudents; index++) {
                if (studentScores[index][subjectNum] >= 50) {
                    passes++;
                } else {
                    fails++;
                }
            }
            System.out.println("Number of passes: " + passes);
            System.out.println("Number of fails: " + fails);
        }

        for (int num = 0; num < numOfSubjects; num++) {
            double highestScore = Double.MIN_VALUE;
            double lowestScore = Double.MAX_VALUE;
            double subjectTotal = 0;
            int passes = 0;
            int fails = 0;

            for (int index = 0; index < numOfStudents; index++) {
                double score = studentScores[index][num];
                subjectTotal += score;
                if (score > highestScore) {
                    highestScore = score;
                }
                if (score < lowestScore) {
                    lowestScore = score;
                }
                if (score >= 40) {
                    passes++;
                } else {
                    fails++;
                }
            }

            double subjectAverage = subjectTotal / numOfStudents;
            System.out.println("\nSubject " + (num + 1));
            System.out.println("Highest scoring student is: " + studentNames[findStudentIndex(studentScores, num, highestScore)] + " scoring " + highestScore);
            System.out.println("Lowest scoring student is: " + studentNames[findStudentIndex(studentScores, num, lowestScore)] + " scoring " + lowestScore);
            System.out.println("Total score is: " + subjectTotal);
            System.out.printf("Average score is: %.2f%n", subjectAverage);
            System.out.println("Number of passes: " + passes);
            System.out.println("Number of fails: " + fails);
        }

        System.out.println("\nClass Summary");
        double overallHighestScore = Double.MIN_VALUE;
        double overallLowestScore = Double.MAX_VALUE;
        double classTotal = 0;

        for (int index = 0; index < numOfStudents; index++) {
            double studentTotal = 0;
            for (int num = 0; num < numOfSubjects; num++) {
                studentTotal += studentScores[index][num];
            }
            classTotal += studentTotal;

            if (studentTotal > overallHighestScore) {
                overallHighestScore = studentTotal;
            }
            if (studentTotal < overallLowestScore) {
                overallLowestScore = studentTotal;
            }
        }

        double classAverage = classTotal / (numOfStudents * numOfSubjects);
        System.out.println("===========================================");
        System.out.println("Best Graduating Student is: " + studentNames[findStudentIndex(studentScores, overallHighestScore, highestScore)] + " scoring " + overallHighestScore);
        System.out.println("===========================================");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Worst Graduating Student is: " + studentNames[findStudentIndex(studentScores, overallLowestScore, highestScore)] + " scoring " + overallLowestScore);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("===========================================");
        System.out.println("Class Total score is: " + classTotal);
        System.out.printf("Class Average score is: %.2f%n", classAverage);
    }
    private static int findIndex(double[][] array, double target, int col) {
        for (int index = 0; index < array.length; index++) {
            if (array[index][col] == target) {
                return index;
            }
        }
        return -1;
    }

    private static int findStudentIndex(double[][] studentScores, double score, double highestScore) {
        for (int index1 = 0; index1 < studentScores.length; index1++) {
            double totalScore = 0;
            for (int j = 0; j < studentScores[index1].length; j++) {
                totalScore += studentScores[index1][j];
            }
            if (totalScore == score) {
                return index1;
            }
        }
        return -1;
    }
}