package EncryptionAndDecryption;

import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int num = scanner.nextInt();

        int decryptedNum = decrypt(num);
        System.out.println("Decrypted Integer: " + decryptedNum);
    }
    public static int decrypt(int encryptedNum) {
        int firstDigit = encryptedNum / 1000;
        int secondDigit = (encryptedNum / 100) % 10;
        int thirdDigit = (encryptedNum / 10) % 10;
        int fourthDigit = encryptedNum % 10;

        int temp = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = temp;

        temp = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = temp;

        firstDigit = (firstDigit + 3) % 10;
        secondDigit = (secondDigit + 3) % 10;
        thirdDigit = (thirdDigit + 3) % 10;
        fourthDigit = (fourthDigit + 3) % 10;

        int originalNum = firstDigit * 1000 + secondDigit * 100 + thirdDigit * 10 + fourthDigit;
        return originalNum;
    }
}