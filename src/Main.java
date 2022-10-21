import java.util.Scanner;

public class Main {

    static int isAsal(int a,int i){
        if (i==1){
            return 1;
        }else {
            if(a%i==0){
                return 0;
            }
            else return isAsal(a,i-1);
        }

           /* for (int i=2;i<a;i++){
                if (a%i!=0){

                }*/

    }
    public static void main(String[] args) {
        int a,asal;
        Scanner input =new Scanner(System.in);
        System.out.print("Pozitif bir sayı giriniz: ");
        a=input.nextInt();

        asal=isAsal(a,a/2);

        if (asal==1){
            System.out.println(a+ " sayısı asaldır.");
        }
        else {
            System.out.println(a+" sayısı asal değildir.");
        }
    }
}