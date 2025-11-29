public class DrinkCoffee {

    void drinkCoffe(Coffee coffee) throws TemperatureException, ConcentrationCoffe {

        if(coffee.getTemp() > 65) {
            throw new TemperatureException(coffee.getTemp(), "Cafeaua e prea fierbinte, o aruncam");
        }
        if(coffee.getConc() > 55) {
            throw new ConcentrationCoffe(coffee.getConc(), "Concentratia cafeleie e prea mare, o aruncam!");
        }

    }

}
