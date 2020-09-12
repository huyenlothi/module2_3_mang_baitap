import java.util.Scanner;

public class timmintrongmang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");
        int size = input.nextInt();
        int[] array= new int[size];
        for(int i=0; i<size; i++){
            System.out.println("nhap phan tu thu " + (i+1) + " : ");
            array[i] = input.nextInt();
        }
        int min = array[0];
        for(int i=1; i< array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(" gia tri nho nhat trong mang la"+ min);
    }
}
