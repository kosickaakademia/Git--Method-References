package sk.it.first_type;

public class Example {
    public static void main(String[] args) {
        Example example = new Example();
        MyInterface myInterface = example::calculateMax;

        // changed
        myInterface.execute(100, 850);
    }

    public void calculateMax(int reps, int weight) {
        switch (reps) {
            case 10:
                System.out.println("Your   max is: " + weight * (1 / 3f + 1));
                break;
            case 9:
                System.out.println("Your   max is: " + weight * (1 / 4f + 1));
                break;
            case 8:
                System.out.println("Your   max is: " + weight * (1 / 5f + 1));
                break;
        }
    }
}
