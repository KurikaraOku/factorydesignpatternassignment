public class SmallCar extends Car {  
    protected String make;
    protected String model;

        /**
         * Creates the car
         */
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

