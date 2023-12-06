package Main;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Nhập vào họ và tên bạn");
        String fullName=sc.nextLine();

        name(fullName);
    }

    public static void name(String fullName){
        String[] words=fullName.toLowerCase().split("");
        System.out.println("Họ và tên theo cách viết tiêu chuẩn là: ");
        System.out.print(words[0].toUpperCase());
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].equals(" ")) {
                System.out.print(words[i].toUpperCase());
            } else {
                System.out.print(words[i]);
            }
        }
    }
}