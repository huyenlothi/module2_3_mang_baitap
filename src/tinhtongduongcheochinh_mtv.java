import java.util.Scanner;

public class tinhtongduongcheochinh_mtv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap kich thuoc cua ma tran vuong:");
        int size = input.nextInt();
        double[][] array = new double[size][size];
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.println(" nhap phan tu thu " + i + ":" +j);
                array[i][j] = input.nextDouble();
            }
        }
        double sum=0.0;
        for(int i=0; i<size;i++){
            sum += array[i][i];
        }
        System.out.println(" tong duong cheo chinh la:" + sum);
    }
}
