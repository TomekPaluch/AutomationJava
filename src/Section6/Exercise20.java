package Section6;

public class Exercise20 {
    public static void main(String [] args){
        System.out.println(hasSameLastDigit(468, 21, 71));
        System.out.println(isValid(468));
    }
    public static boolean isValid(int a) {
        return ((a >= 10) && (a <= 1000));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((isValid(x) && (isValid(y)) && (isValid(z)))) {
            int lastx = x % 10;
            int lasty = y % 10;
            int lastz = z % 10;
            return ((lastx == lasty) || (lasty == lastz) || (lastx == lastz));
        }
        return false;
    }
}

