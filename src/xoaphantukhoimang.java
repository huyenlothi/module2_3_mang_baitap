import java.util.Scanner;

public class xoaphantukhoimang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");
        size = input.nextInt();
        int i=0;
        array = new int[size];
        while (i < array.length ) {
            System.out.print("nhap phan tu thu " + (i+1) + " : "+ "\t");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println();
        System.out.println("nhap so can xoa: " );
        int num = input.nextInt();
        int index=0;
        boolean check =false;
        for(int j=0; j< array.length; j++) {
            if(array[j] == num) {
                index =j;
                check= true;
            }
        }
        if(!check){
            System.out.println(num + "phan tu khong thuoc mang");
        }else {
            for (int j = index; j < array.length - 1; j++) {
                array[j] = array[j + 1];
                if ((j + 1) == (array.length - 1)) {
                    array[array.length - 1] = 0;
                }

            }
            System.out.print("mang sau khi xoa: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }
    }
}
