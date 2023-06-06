import java.util.Scanner;

public class IfAndElse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        int a = scanner.nextInt();
        System.out.println("Nhập chiều rộng");
        int b = scanner.nextInt();
        if (a == b && a != 0 && b != 0) {
            System.out.println(a + " là cạnh của hình vuông");
        } else if (a != b && a != 0 && b != 0) {
            System.out.println(a + " và " + b + " là 2 cạnh của hình chữ nhật");
        } else {
            System.out.println(a + " và " + b + " không phải 2 cạnh của hình chữ nhật");
        }
    }
}
