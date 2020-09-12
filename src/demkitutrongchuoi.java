import java.util.Scanner;

public class demkitutrongchuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "toi yeu viet nam, toi yeu ha noi";
        System.out.println("nhap ki tu de ktra:");
        char a = input.next(".").charAt(0);
        int count=0;
        for(int i=0; i< str.length(); i++){
            if (str.charAt(i) == a){
                count++;
            }
        }
        System.out.println("co " + count+ " ki tu "+ a + " trong chuoi: "+ str);
    }
}
