package Section7;

public class IntroductiontoClasses {
    public static void main(String[] args){
        Car car = new Car();

        System.out.println("make =" + car.getMake());
        System.out.println("model " +car.getModel());
        car.describeCar();
    }

}

