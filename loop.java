import java.util.Scanner;

/**
 * loop
 */
public class loop {
    public static void main(String[] args) {

        // while
        System.out.println("While");
        int i = 0;

        while (i < 20) {
            System.out.println("รอบที่ " + (i + 1));
            i++;
        }
        System.out.println("จำนวนรอบทั้งหมด " + i);
        System.out.println("====================");

        // Do...While
        System.out.println("\nDo...While");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("กรอกตัวเลข (กรอก 0 เพื่อหยุด): ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number; // บวกตัวเลขเข้ากับผลรวม
            }

        } while (number > 0);

        System.out.println("ผลรวมของตัวเลขที่กรอกคือ: " + sum);

        System.out.println("====================");

        // For
        for (int a = 2; a <= 12; a++) {
            System.out.println("99 x " + a + " = " + 99 * a);
        }

        scanner.close();
    }
}