public abstract class MotorMachine extends Machine {
    public MotorMachine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void servise() {
        super.servise();
        checkEngine();
    }
}
