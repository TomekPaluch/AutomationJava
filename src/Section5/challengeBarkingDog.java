package Section5;

public class challengeBarkingDog {
    public static void main(String [] args){
    shouldWakeUp(false, 26);
    shouldWakeUp(true, 4);
    shouldWakeUp(true,8);
    shouldWakeUp(true, -1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay >= 0 && hourOfDay <= 23)) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
            else {
                return false;
            }
        } else {
            return false;
        }
    }
}
