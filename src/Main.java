import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double fee, kdv=0.18, kdvfee, wkdvfee;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the fee amount. ");
        fee=input.nextDouble();

        kdvfee = fee * kdv;
        wkdvfee = fee + kdvfee;

        System.out.println("fee amount:"+fee);
        System.out.println("KDV:"+kdv);
        System.out.println("KDVfee:"+kdvfee);
        System.out.println("wKDVfee:"+wkdvfee);

    }
}
