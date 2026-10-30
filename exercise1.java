import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("حجم بسته اینترنت (گیگابایت): ");

        try {
            double volume = Double.parseDouble(input.nextLine());

            System.out.print("موجودی کیف پول (تومان): ");
            double balance = Double.parseDouble(input.nextLine());

            if (volume <= 0 || balance < 0) {
                System.out.println("حجم بسته یا موجودی واردشده نامعتبر است.");
            } else {
                double price = volume * 5000;

                if (volume > 10) {
                    price *= 0.85;
                }

                if (balance >= price) {
                    System.out.println("خرید با موفقیت انجام شد.");
                    System.out.println("موجودی باقی‌مانده: "
                            + (balance - price) + " تومان");
                } else {
                    System.out.println("موجودی کاربر کافی نیست.");
                    System.out.println("مبلغ کسری: "
                            + (price - balance) + " تومان");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("حجم بسته یا موجودی واردشده نامعتبر است.");
        }

        input.close();
    }
}
