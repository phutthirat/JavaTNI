import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {

        String studentId = "2513510012";


        int lastDigit = Character.getNumericValue(studentId.charAt(studentId.length() - 1)); // ตัวสุดท้าย
        int secondLastDigit = Character.getNumericValue(studentId.charAt(studentId.length() - 2)); // รองสุดท้าย
        int thirdLastDigit = Character.getNumericValue(studentId.charAt(studentId.length() - 3)); // ก่อนรองสุดท้าย


        int[] initialNumbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        for (int num : initialNumbers) {
            numbers.add(num);
        }
        System.out.println("Initial ArrayList: " + numbers);


        System.out.print("Enter number to append: ");
        int appendNum = scanner.nextInt();
        numbers.add(appendNum);
        System.out.println("After append: " + numbers);


        System.out.print("Enter number to insert at index " + lastDigit + ": ");
        int insertNum = scanner.nextInt();
        if (lastDigit <= numbers.size()) {
            numbers.add(lastDigit, insertNum);
        } else {
            numbers.add(insertNum);
        }
        System.out.println("After insertion: " + numbers);


        if (secondLastDigit < numbers.size()) {
            numbers.remove(secondLastDigit);
            System.out.println("After deleting index " + secondLastDigit + ": " + numbers);
        } else {
            System.out.println("Cannot delete index " + secondLastDigit + " (Out of bounds)");
        }


        int studyDate = 16;
        if (thirdLastDigit < numbers.size()) {
            numbers.set(thirdLastDigit, studyDate);
            System.out.println("After updating index " + thirdLastDigit + " to date (" + studyDate + "): " + numbers);
        } else {
            System.out.println("Cannot update index " + thirdLastDigit + " (Out of bounds)");
        }


        System.out.println("\nFinal Result of student's ArrayList: " + numbers);
        scanner.close();
    }
}
