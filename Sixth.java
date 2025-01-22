public class Sixth{
    public static void main(String[] args) {
        int f=125000;
        int dp=10;
        int d=(f*dp)/100;
        int df=f-d;
        System.out.println("The discounted amount is "+d+" and the discounted price is "+df);
    }
}
