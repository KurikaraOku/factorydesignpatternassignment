
public class Car {
   
    protected String make;
    protected String model;

    /**
     * Creates the car
     */
    public void createCar() {
        assemble();
        addFrame();
        addWheels();
        addFrame();
        addEngine();
        addWindows();
        addAccessories();
        getPrice();
        displayAccessories();
    }


    protected void addFrame() {
        System.out.println("Adding " + this.name + " frame.");
    }


    private void addWheels() {
        System.out.println("Adding " + this.numWheels + " wheel(s).");
    }
    
    protected void addAccessories() {
        System.out.println("Adding " + this.name + " frame.");
        }

    private void displayAccessories() {

    }
    
    protected void addEngine() {
    System.out.println("Adding the luxury engine.");
    }
    protected void addWindows() {
        System.out.println("Adding the windows.");
        }
    }
  
