public class Truck extends MotorMachine {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void servise() {
        super.servise();
        checkTrailer();
    }
}
