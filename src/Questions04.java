import java.util.Scanner;
//kullanicidan alinan sayinin toplamini bulmak icin verilem arrafdeki sayilari kullanmak
public class Questions04 {


    public static void main(String[] args) {
        int a[]={4,3,6,8,2,10,12,9};
        Scanner scan=new Scanner(System.in);
        System.out.println("numara giriniz");
        int num=scan.nextInt();

        ikiSayiToplam( a, num);
    }

    public static void ikiSayiToplam(int[] a, int num){

        for(int i=0; i< a.length;i++){
            for(int k=(i+1);k< a.length;k++){
                if(a[i]+a[k]==num){
                    System.out.println(a[i]+"+"+a[k]+"="+num);
                }
            }

        }



    }
}
