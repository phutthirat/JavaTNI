import java.util.Scanner;

public class Lab604 {
    public static void display_array(int[] numbers) {
        System.out.print("List of numbers in array: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
    }

    // 2. Method สำหรับตรวจสอบว่า index อยู่ในขอบเขตหรือไม่
    public static boolean check_index(int[] numbers, int index) {
        return (index >= 0 && index < numbers.length);
    }

    // 3. Method สำหรับรับค่า index ที่ถูกต้อง (มีการวนลูป)
    public static int input_index(int[] numbers) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int idx = sc.nextInt();

        while (!check_index(numbers, idx)) { // เรียกใช้ check_index มาช่วยตรวจสอบ
            System.out.print("Invalid index!! Enter index, again: ");
            idx = sc.nextInt();
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] numbers = {47, 13, 82, 17, 61, 29, 94, 36};

        display_array(numbers);
        int index = input_index(numbers);

        System.out.println("\nThe number at index " + index + " is " + numbers[index]);

        // ตรวจสอบค่าก่อนหน้า (before)
        if (check_index(numbers, index - 1)) {
            System.out.println("The number before index " + index + " is " + numbers[index - 1]);
        } else {
            System.out.println("The number before index " + index + " is Out of range!!");
        }

        // ตรวจสอบค่าถัดไป (after)
        if (check_index(numbers, index + 1)) {
            System.out.println("The number after  index " + index + " is " + numbers[index + 1]);
        } else {
            System.out.println("The number after  index " + index + " is Out of range!!");
        }
    }
}
