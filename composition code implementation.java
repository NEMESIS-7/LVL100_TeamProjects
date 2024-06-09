public class CompositionExample {

    // Engine Class
    public static class Engine {
        private String type;

        public Engine(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void start() {
            System.out.println("Engine of type " + type + " is starting...");
        }
    }

    // Car Class
    public static class Car {
        private Engine engine;
        private String model;

        public Car(String model, Engine engine) {
            this.model = model;
            this.engine = engine;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public void startCar() {
            System.out.println("Starting car: " + model);
            engine.start();
        }
    }

    // Main Method
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("Mustang", engine);

        car.startCar();
    }
}
