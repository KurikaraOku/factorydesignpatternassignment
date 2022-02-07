public class SedanCar extends Car {
    protected String make;
    protected String model;
        /**
         * Creates the car
         */
        public SedanCar() {}
        
            public void createCar() {
                addFrame();
                addAccessories();
            }  
            protected void addFrame() {
            System.out.println("Adding " + this.name + " frame.");
        }
            protected void addAccessories() {
            System.out.println("Adding " + this.name + " frame.");
        }
    }
