package Section6;

public class SwitchStatement {
    public static void main(String[] args){
        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3,4,5");
                System.out.println("Its a " + switchValue);
                break;
            default:
                System.out.println("WWas not the number beetween 1 and 5");
                break;
        }
    }
}
