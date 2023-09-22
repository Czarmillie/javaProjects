package EncryptionAndDecryption;

import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int num = scanner.nextInt();

        int encryptedNum = encrypt(num);
        System.out.println("Encrypted Integer: " + encryptedNum);
    }


    public static int encrypt(int num) {
        int firstDigit = num / 1000;
        int secondDigit = (num / 100) % 10;
        int thirdDigit = (num / 10) % 10;
        int fourthDigit = num % 10;

        firstDigit = (firstDigit + 7) % 10;
        secondDigit = (secondDigit + 7) % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        fourthDigit = (fourthDigit + 7) % 10;

        int temp = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = temp;

        temp = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = temp;

        int encryptedNum = firstDigit * 1000 + secondDigit * 100 + thirdDigit * 10 + fourthDigit;
        return encryptedNum;
    }
}