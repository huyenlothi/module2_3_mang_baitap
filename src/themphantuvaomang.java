import java.util.Scanner;

public class themphantuvaomang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang:");
        size = input.nextInt();
        array = new int[size];
        int i=0;
        while (i< array.length) {
            System.out.println("nhap phan tu thu "+ (i+1)+ " : ");
            array[i]= input.nextInt();
            i++;
        }
        System.out.println("nhap phan tu can chen");
        int num = input.nextInt();
        System.out.println("nhap vi tri can chen: ");
        int index = input.nextInt();
        int[] array1 = new int[array.length+1];
        if(index <=1 || index >= array.length-1) {
            System.out.println("k chen duoc phan tu vao mang");
        }else {
            for (int j=0; j< array1.length; j++) {
                if(j<index){
                    array1[j] = array[j];
                }else
                if(j== index){
                    array1[j]=num;
                }else {
                    array1[j]= array[j-1];
                }
            }
            System.out.print("mang sau khi chen la: ");
            for(int j=0; j< array1.length; j++){
                System.out.print(array1[j] + "\t");
        }

        }
    }
}
