import java.util.Scanner;

public class tinhsosinhvienthido {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int size;
        int count=0;
        do {
            System.out.println("nhap so hoc sinh:");
            size= input.nextInt();
            if (size > 30) {
                System.out.println("nhap lai so hoc sinh <= 30");
            }
        }while (size>30);
        double[] array= new double[size];
        for (int i=0; i<size; i++){
            System.out.println("nhap diem hoc sinh thu " + i + ": ");
                array[i]= input.nextDouble();
                if (array[i] <0 || array[i]>10) {
                    System.out.println("nhap lai diem tu 0 den 10");
                    System.out.println("nhap diem hoc sinh thu " + i + ": ");
                    array[i]= input.nextDouble();
                }
        }
        System.out.print("danh sach diem cua hoc sinh la: ");
        for(int i=0; i< array.length;i++){
            if(array[i]>=5){
                count++;
            }
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.println("so hoc sin h co diem do la: "+ count);

    }
}
