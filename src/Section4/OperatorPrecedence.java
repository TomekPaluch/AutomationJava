package Section4;

public class OperatorPrecedence {
    public static void main(String[] args ){

        double var1 = 20.00d;
        double var2 = 80.00d;
        double multiply = 100.00d;
        double var3 = (var1 + var2) * multiply;
        System.out.println("var 3 value = " + var3);
        double reminder = var3 % 40.00d;
        System.out.println("Reminder value = " + reminder);
        boolean noReminder = (reminder == 0) ? true : false;
        if (!noReminder) {
            System.out.println("Reminder :");
        }
    }
}
