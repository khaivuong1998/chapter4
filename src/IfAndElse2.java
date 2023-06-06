import java.util.Scanner;

public class IfAndElse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị 1");
        int a = scanner.nextInt();
        System.out.println("Nhâp giá trị 2");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " là số lớn nhất");
        } else if (b > a) {
            System.out.println(b + " là số lớn nhất");
        } else {
            System.out.println(a + " là số lớn nhất");
        }
    }
}
