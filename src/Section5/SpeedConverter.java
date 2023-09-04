package Section5;

public class SpeedConverter {
    public static void main(String[] args){
        long milesConv = toMilesPerHour(150);
        System.out.println(milesConv);
        printConversion(1.5);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else{
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour >= 0){
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h " );
        }else {
         System.out.println("Invalid value");
        }
    }
}
