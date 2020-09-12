import java.util.Scanner;

public class tinhtongphantuow1cot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so hang ");
        int sizei = input.nextInt();
        System.out.println("nhap so cot ");
        int sizej = input.nextInt();
        int[][] array = new int[sizei][sizej];
        for(int i=0; i<sizei;i++){
            for(int j=0;j<sizej; j++){
                System.out.println(" nhap phan tu thu "+ i + ":"+ j);
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("nhap so cot can tinh tong phan tu:");
        int j= input.nextInt();
        int sum=0;
        for(int i=0; i<sizei;i++){
            sum += array[i][j];
        }
        System.out.println("tong cacs phan tu cua cot "+ j + " la: " + sum);
    }
}
