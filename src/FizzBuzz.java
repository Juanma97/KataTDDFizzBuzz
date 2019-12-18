public class FizzBuzz {

    private int quantity;
    private FizzBuzzCalculator fizzBuzzCalculator;

    public FizzBuzz(int quantity) {
        this.quantity = quantity;
        fizzBuzzCalculator = new FizzBuzzCalculator();
    }

    public void generate() {
        for(int i = 1; i <= quantity; i++){
            System.out.println(fizzBuzzCalculator.calculate(i));
        }
    }
}
