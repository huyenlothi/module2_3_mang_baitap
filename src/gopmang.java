import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1;
        int[] array2;
        int[] array3;
        System.out.println("nhap kich thuoc mang 1");
        int size1 = input.nextInt();
        array1 = new int[size1];
        for (int i=0; i< array1.length; i++) {
            System.out.println("nhap phan tu thu " + (i+1) + " : ");
            array1[i] = input.nextInt();
        }
        System.out.print(" mang thu nhat la: ");
        for (int i=0; i< array1.length; i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        System.out.println("nhap kich thuoc mang 2");
        int size2 = input.nextInt();
        array2 = new int[size2];
        for (int i=0; i< array2.length; i++) {
            System.out.println("nhap phan tu thu " + (i+1) + " : ");
            array2[i] = input.nextInt();
        }
        System.out.print(" mang thu hai la: ");
        for (int i=0; i< array2.length; i++){
            System.out.print(array2[i] + "\t");
        }
        int size3 = size1+size2;
        array3= new int[size3];
        for(int i=0; i< array1.length; i++){
                array3[i] = array1[i];
            }
        for(int i=0;i< array2.length;i++){
            array3[i+ array1.length] = array2[i];
        }
        System.out.println();
        System.out.print("mang moi sau khi gop la: ");
        for(int i=0; i< array3.length; i++){
            System.out.print(array3[i] + "\t");
        }
    }
}
