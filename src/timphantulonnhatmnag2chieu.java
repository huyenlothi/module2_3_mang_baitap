import java.util.Scanner;

public class timphantulonnhatmnag2chieu {
    public static void main(String[] args) {
        int[][] array;
        int sizei;
        int sizej;

        Scanner input = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        sizei= input.nextInt();
        System.out.println("nhap so phan tu cua phan tu");
        sizej = input.nextInt();
        array = new int[sizei][sizej];
        for(int i=0; i<sizei; i++){
            for(int j=0; j<sizej;j++){
                System.out.println("nhap phan tu thu:" + i +"," +j);
                array[i][j]= input.nextInt();
            }
        }
        int max = array[0][0];
        int indexi=0;
        int indexj=0;
        for(int i=0; i<sizei;i++) {
            for(int j=1;j<sizej;j++){
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexi=i;
                    indexj=j;
                }
            }
        }
        System.out.println(" phan tu lon nhat la: " + max + " o toa do: " +indexi + ","  + indexj);
    }
}
