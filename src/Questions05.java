public class Questions05 {

    //String mukerrer karakterler
    public static void main(String[] args) {
        String str="eyedipadanadapide";
        System.out.println(mukerreriYaz(str));
    }
    public static String mukerreriYaz(String str){
      String s="";
        for (int i=0; i<str.length();i++){

            String s1=str.substring(i, i+1);

            if(str.indexOf(s1)!=str.lastIndexOf(s1)){

                if(!s.contains(s1)){
                    s=s+s1;
                }
            }

        }return s;


    }

}
