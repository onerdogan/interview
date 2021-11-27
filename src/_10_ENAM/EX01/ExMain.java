package _10_ENAM.EX01;

public class ExMain {
    public static void main(String[] args) {
        //verilen ay nosuna gore ayin kac gun oldugunu yaziniz...
        //int ay=5;
        Aylar ay=Aylar.KASIM;
        System.out.println("ay :"+ay);
        System.out.println("ay.name() ="+ay.name());
        System.out.println("ay.sirasi ="+ay.ordinal());//enum yapisindaki index sirsi
        switch (ay){
            case OCAK:
                System.out.println("ocak");
                break;
            case SUBAT:
                System.out.println("subat");
                break;
            case MART:
                System.out.println("mart");
                break;
            case NISAN:
                System.out.println("nisan");
                break;
            case KASIM:
                System.out.println("iyiki dogdun oguz");
                break;
        }
    }
}
