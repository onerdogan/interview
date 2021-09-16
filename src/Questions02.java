import java.util.Scanner;

public class Questions02 {

    //fibonacci

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Numara  giriniz");
        int num=scan.nextInt();
        printFibonacci( num);

    }
    public static void printFibonacci(int num){
        int f1=1;
        int f2=1;
        int newf2=0;
        System.out.print(f1+" "+f2+" ");
        for(int i=1;i<+num-1;i++) {
        newf2=f1+f2;
        f1=f2;
        f2=newf2;
            System.out.print(newf2+" ");
        }
    }
}
