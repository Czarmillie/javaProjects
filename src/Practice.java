//public class Practice {
//    public static void main(String[] args) {
//        int number = 0;
//        do {
//            System.out.println(number);
//            number++;
//        }while(number<11);
//
//        System.out.println("=".repeat(80));
//
//        for(int counter = 1; counter<11; counter++){
//            System.out.println(counter);
//        }
//        System.out.println("=".repeat(80));
//        number = 1;
//            while(number<11);
//                System.out.println(number);
//                    number++;
//    }
//}


//public class Practice {
////    public static void main(String[] args) {
////        int x = 1;
////        System.out.println("Before the Loop");
////        while (x < 4) {
////            System.out.println("In the loop");
////            System.out.println("Value of x is " + x);
////            x = x + 1;
////        }
////        System.out.println("This is after the loop");
////    }
////}



//public class Practice {
//    public static void main(String[] args) {
//        int x = 1;
//        while (x < 3) {
//            System.out.print("Doo");
//            System.out.print("Bee");
//            x = x + 1;
//        }
//        if (x == 3) {
//            System.out.print("Do");
//        }
//    }
//}


//class practice {
//    public static void main (String[] args) {
//        int x = 2;
//        if (x == 3) {
//            System.out.println("x must be 3");
//        } else {
//            System.out.println("x is NOT 3");
//        }
//        System.out.println("This runs no matter what");
//    }
//}




//public class Practice {
//    public static void main(String[] args) {
//        int counter = 1;
//        while (counter <= 10) {
//            System.out.printf("%d ", counter);
//            counter++;
//        }
//        System.out.println();
//    }
//}


//public class Practice {
//    public static void main(String[] args) {
//        int[] num = new int[5];
//        for (int numbers = 0; numbers < num.length; numbers++) {
//            num[numbers] = 2 + numbers+ numbers;
//            System.out.println(num[numbers] + " ");
//        }
//    }
//}

//public class Practice {
//    public static void main(String[] args) {
//        int[] num = new int[10];
//        for (int numbers = 0; numbers < num.length; numbers++){
//            System.out.print(num[numbers] + " ");
//        }
//    }
//}


//public class Practice {
//    public static void main(String[] args) {
//        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
//        int total = 0;
//        for (int counter = 0; counter < num.length; counter++) {
//            total += num[counter];
//        }
//        System.out.printf("Total: %d%n", total);
//    }
//}



//public class Practice {
//    public static void main(String[] args) {
//        int[] czar = new int[10];
//        for (int i = 0; i < czar.length; i++){
//            czar[i]  = i*10;
//        }
//        for (int i = 0; i < czar.length; i++){
//            System.out.println("Element " + i + " value is " + czar[i]);
//        }
//    }
//}


//import java.util.Arrays;
//
//public class ArrayMinMaxPositions {
//    public static void main(String[] args) {
//        int[] inputArray = {40, 12, 89, 35, 10, 90};
//        int[] outputArray = findMinMaxPositions(inputArray);
//
//        System.out.println("Sample Input: " + Arrays.toString(inputArray));
//        System.out.println("Sample Output: " + Arrays.toString(outputArray));
//    }
//
//    public static int[] findMinMaxPositions(int[] arr) {
//        int minIndex = 0;
//        int maxIndex = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > arr[maxIndex]) {
//                maxIndex = i;
//            }
//
//            if (arr[i] < arr[minIndex]) {
//                minIndex = i;
//            }
//        }
//
//        int[] positions = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (i == minIndex) {
//                positions[i] = maxIndex;
//            } else if (i == maxIndex) {
//                positions[i] = minIndex;
//            } else {
//                positions[i] = i;
//            }
//        }
//
//        return positions;
//    }
//}

//function findIndexes(array, num1, num2):
//        highestIndex = 0
//        lowestIndex = 0
//
//        for i = 1 to length(array):
//        if array[i] > array[highestIndex]:
//        highestIndex = i
//        if array[i] < array[lowestIndex]:
//        lowestIndex = i
//
//        result = new Array(length(array))
//
//        for i = 0 to length(array) - 1:
//        if array[i] == num1:
//        result[i] = highestIndex
//        else if array[i] == num2:
//        result[i] = lowestIndex
//        else:
//        result[i] = i
//
//        return result
//
// Sample input
//        array = [40, 12, 89, 35, 10, 90]
//        num1 = 90
//        num2 = 10
//
//        indexes = findIndexes(array, num1, num2)
//
//        print(indexes)