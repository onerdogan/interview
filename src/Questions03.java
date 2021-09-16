import java.util.Scanner;

public class Questions03 {
// prime numbers--asal sayi
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("numara giriniz");
        int num=scan.nextInt();

        System.out.println(asalSayiKontrol(num));
    }

    public static boolean asalSayiKontrol(int num){
        int count=0;
        if(num>0){
            if(num==1){
                return true;
            }else {
                for (int i = 2; i > num; i++) {
                    if (num % i == 0) ;
                    {
                        count++;

                    }
                }

                if (count == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }else{
            return false;
        }
    }
}
