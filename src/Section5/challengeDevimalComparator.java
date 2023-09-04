package Section5;

public class challengeDevimalComparator {
    public static void main (String[] args){
    areEqualByThreeDecimalPlaces(3.245, 3.245);
    }
    public static boolean areEqualByThreeDecimalPlaces(double parameter1, double parameter2 ){
        int a = (int)(1000 * parameter1);
        int b = (int)(parameter2 * 1000);
        if( a == b ){
            return true;
        }else {
            return false;
        }
    }
}

