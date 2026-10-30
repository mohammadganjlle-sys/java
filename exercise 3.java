
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("هزینه کل اشتراک (تومان): ");
            double cost = Double.parseDouble(input.nextLine());

            System.out.print("تعداد افراد: ");
            int people = Integer.parseInt(input.nextLine());

            if (cost < 0) {
                System.out.println("هزینه نمی‌تواند منفی باشد.");
            } else if (people < 0) {
                System.out.println("تعداد افراد نمی‌تواند منفی باشد.");
            } else if (people == 0) {
                System.out.println("تعداد افراد نمی‌تواند صفر باشد.");
            } else {
                double share = cost / people;

                System.out.printf("سهم هر نفر: %.2f تومان%n", share);
            }

        } catch (NumberFormatException e) {
            System.out.println("ورودی نامعتبر است.");
        }

        input.close();
    }
}
