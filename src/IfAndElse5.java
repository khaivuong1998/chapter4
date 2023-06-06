import java.util.Scanner;

public class IfAndElse5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm học sinh");
        int a = scanner.nextInt();
        if (a < 25) {
            System.out.println("F");
        } else if (a <= 45) {
            System.out.println("E");
        } else if (a <= 50) {
            System.out.println("D");
        } else if (a <= 60) {
            System.out.println("C");
        } else if (a <= 80) {
            System.out.println("B");
        }else {
            System.out.println("A");
        }
    }
}
