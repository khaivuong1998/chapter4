import java.util.Scanner;

public class IfAndElseInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Kiểm tra hinh vuông
//        System.out.println("Nhập chiều dài");
//        int a = scanner.nextInt();
//        System.out.println("Nhập chiều rộng");
//        int b = scanner.nextInt();
//        if (a == b && a != 0 && b != 0) {
//            System.out.println(a + " là cạnh của hình vuông");
//        } else if (a != b && a != 0 && b != 0) {
//            System.out.println(a + " và " + b + " là 2 cạnh của hình chữ nhật");
//        } else {
//            System.out.println(a + " và " + b + " không phải 2 cạnh của hình chữ nhật");
//        }
//        Tìm giá trị lớn nhất
//        System.out.println("Nhập giá trị 1");
//        int a = scanner.nextInt();
//        System.out.println("Nhâp giá trị 2");
//        int b = scanner.nextInt();
//        if (a > b) {
//            System.out.println(a + " là số lớn nhất");
//        } else if (b > a) {
//            System.out.println(b + " là số lớn nhất");
//        } else {
//            System.out.println(a + " là số lớn nhất");
//        }
//        Kiểm tra năm nhuận
        System.out.println("Mời nhập số năm cần kiểm tra");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 400 != 0 && year % 100 == 0) {
            System.out.println(year + " không phải là năm nhuận");
        } else {
            System.out.println(year + " là năm nhuận");
        }
    }
}
