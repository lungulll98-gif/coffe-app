public class CoffeeTest {
    public static void main(String[] args) {

        CoffeeMaker mk = new CoffeeMaker();
        DrinkCoffee d  = new DrinkCoffee();

        for (int i = 0; i < 5; i++) {
            Coffee coffee = mk.makeCoffee();

            try {
                d.drinkCoffe(coffee);
            } catch (TemperatureException e) {
                System.out.println("Exceptie T: " + e.getMessage() + "\ntemperatura: "
                + e.getT());
            } catch (ConcentrationCoffe e) {
                System.out.println("Exceptie T: " + e.getMessage() + "\nconcentratia: "
                        + e.getC());
            }
            finally {
                System.out.println("Aparatul de cafea s-a oprit");
            }
        }

    }
}
