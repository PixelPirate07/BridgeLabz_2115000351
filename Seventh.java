public class Seventh{
    public static void main(String[] args) {
        double rk=6378;
        double rm=rk*0.621371;
        double vk=(4.0/3)*Math.PI*Math.pow(rk,3);
        double vm=(4.0/3)*Math.PI*Math.pow(rm,3);
        System.out.println("The volume of earth in cubic kilometers is "+vk+" and cubic miles is "+vm);
    }
}
