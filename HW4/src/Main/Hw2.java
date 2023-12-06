package Main;
import java.util.Scanner;
import java.util.Arrays;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhập số phẩn thử của mảng: ");
        int n=sc.nextInt();

        int[] num=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Phần tử thứ "+i+" của mảng là: ");
            num[i]=sc.nextInt();
        }
        System.out.println("Mảng vừa nhập ban đầu:");
        for (int i=0;i<n;i++) {
            System.out.print(num[i]+"\t");
        }
        System.out.println("\nMảng sau khi tăng số chẵn:");
        for( int i=0;i<n;i++){
            if (num[i]%2==0){
                num[i]++;
                System.out.print(num[i]+"\t");
            }
            else System.out.print(num[i]+"\t");

        }
    }
}