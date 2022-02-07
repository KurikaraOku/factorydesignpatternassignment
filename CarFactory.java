    public class CarFactory {
        private Car createCar(String type) {
            Car car;
    
            if (type == "small car") {
                car = new smallCar();
            } else if (type == "sedan car") {
                car = new sedanCar();
            } else if (type == "luxury car") {
                car = new LuxuryCar();
            } else {
                car = null;
            }
    
            return car;
        }
    
     }
    
