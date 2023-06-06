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
//        System.out.println("Mời nhập số năm cần kiểm tra");
//        int year = scanner.nextInt();
//        if (year % 4 == 0 && year % 400 != 0 && year % 100 == 0) {
//            System.out.println(year + " không phải là năm nhuận");
//        } else {
//            System.out.println(year + " là năm nhuận");
//        }
//        In điểm học sinh
//        System.out.println("Nhập điểm học sinh");
//        int a = scanner.nextInt();
//        if (a < 25) {
//            System.out.println("F");
//        } else if (a <= 45) {
//            System.out.println("E");
//        } else if (a <= 50) {
//            System.out.println("D");
//        } else if (a <= 60) {
//            System.out.println("C");
//        } else if (a <= 80) {
//            System.out.println("B");
//        }else {
//            System.out.println("A");
//        }
//        Tìm tuổi lớn nhất
//        System.out.println("Nhập tuổi người thứ 1");
//        int a = scanner.nextInt();
//        System.out.println("Nhập tuổi người thứ 2");
//        int b = scanner.nextInt();
//        System.out.println("Nhập tuổi người thứ 3");
//        int c = scanner.nextInt();
//        if (a > b && a > c && b < c) {
//            System.out.println("Người thứ 1 lớn tuổi nhất, người thứ 2 nhỏ tuổi nhất");
//        } else if (a > b && a > c && b > c) {
//            System.out.println("Người thứ 1 lớn tuổi nhất, người thứ 3 nhỏ tuổi nhất");
//        } else if (b > a && b > c && a > c) {
//            System.out.println("Người thứ 2 lớn tuổi nhất, người thứ 3 nhỏ tuổi nhất");
//        } else if (b > a && b > c && a < c) {
//            System.out.println("Người thứ 2 lớn tuổi nhất, người thứ 1 nhỏ tuổi nhất");
//        } else if (c > a && c > b && a > b) {
//            System.out.println("Người thứ 3 lớn tuổi nhất, người thứ 2 nhỏ tuổi nhất");
//        } else {
//            System.out.println("Người thứ 3 lớn tuổi nhất, người thứ 1 nhỏ tuổi nhất");
//        }
//        Câu 8
        int x = 2;
        int y = 5;
        int z = 0;
//        Giá trị tuyệt đối của 1 số
        System.out.println("Nhập số bất kỳ");
        int a = scanner.nextInt();
        System.out.println(Math.abs(a));
    }
}
