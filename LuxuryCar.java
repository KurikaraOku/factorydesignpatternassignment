public class LuxuryCar extends Car {
  
    protected String make;
    protected String model;
     /**
     * Creates the car
     */
    public LuxuryCar() {}
        
    public void createCar() {
        addFrame();
        addAccessories();
        addEngine();
    }  
    protected void addFrame() {
    System.out.println("Adding " + this.name + " frame.");
    }
    protected void addAccessories() {
    System.out.println("Adding " + this.name + " frame.");
    }
    protected void addEngine() {
    System.out.println("Adding the luxury engine.");
    }
}
