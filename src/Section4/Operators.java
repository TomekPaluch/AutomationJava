package Section4;

public class Operators {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 99;
        if (topScore != 100) { // ! is used as negation
            System.out.println("High score");
        }
        int greater = 200;
        if (greater >= 199) {
            System.out.println("This is greater that 199");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater then second and less than 100");
        }
        if ((topScore) > 90 || (secondTopScore <= 90)) {
            System.out.println("Either or both is true");
        }
        int newValue = 50;
        if (newValue == 50) { //double == instead of =
            System.out.println("This is an error");
        }
        boolean isCar = false;
        if (!isCar) { // "isCar" states that boolean is true "!isCar" states that boolean is false
            System.out.println("This shouldn't work");
        }

        // TERNANRY OPERATORS
        //Conditional Operator
        // Structure
        // operand1 ? operand2 : operand3
        // boolean value ? other 2 don't have to be booleans

        String makeofCar = "Volksvagen";
        boolean isDomestic = (makeofCar == "Volksvagen") ? false : true;

        if (isDomestic) {
            System.out.println("This is volksvagen");
            }

        String s = (isDomestic) ? "This is domestic" : "This car is not domestic" ;
        System.out.println(s);
        }
    }

