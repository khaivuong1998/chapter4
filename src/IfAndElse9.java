import java.util.Scanner;

public class IfAndElse9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số năm cần kiểm tra");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 400 != 0 && year % 100 == 0) {
            System.out.println(year + " không phải là năm nhuận");
        } else {
            System.out.println(year + " là năm nhuận");
        }
    }
}
