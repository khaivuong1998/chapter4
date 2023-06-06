import java.util.Scanner;

public class IfAndElse6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tuổi người thứ 1");
        int a = scanner.nextInt();
        System.out.println("Nhập tuổi người thứ 2");
        int b = scanner.nextInt();
        System.out.println("Nhập tuổi người thứ 3");
        int c = scanner.nextInt();
        if (a > b && a > c && b < c) {
            System.out.println("Người thứ 1 lớn tuổi nhất, người thứ 2 nhỏ tuổi nhất");
        } else if (a > b && a > c && b > c) {
            System.out.println("Người thứ 1 lớn tuổi nhất, người thứ 3 nhỏ tuổi nhất");
        } else if (b > a && b > c && a > c) {
            System.out.println("Người thứ 2 lớn tuổi nhất, người thứ 3 nhỏ tuổi nhất");
        } else if (b > a && b > c && a < c) {
            System.out.println("Người thứ 2 lớn tuổi nhất, người thứ 1 nhỏ tuổi nhất");
        } else if (c > a && c > b && a > b) {
            System.out.println("Người thứ 3 lớn tuổi nhất, người thứ 2 nhỏ tuổi nhất");
        } else {
            System.out.println("Người thứ 3 lớn tuổi nhất, người thứ 1 nhỏ tuổi nhất");
        }
    }
}
