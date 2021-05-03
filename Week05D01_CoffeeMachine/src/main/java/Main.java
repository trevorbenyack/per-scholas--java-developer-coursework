import java.util.Scanner;

public class Main {
    final static int WATER_PER_CUP = 200;
    final static int MILK_PER_CUP = 50;
    final static int COFFEE_PER_CUP = 15;

    public static void main(String[] args){

        //makeCoffee();
        verifySupplies();

    }

    /**
     * This method will display the process of making coffee
     */
    public static void makeCoffee(){
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }

    public static int[] calculateReqIngredients(int numOfCups) {

        int[] ingredients = new int[3];
        ingredients[0] = WATER_PER_CUP * numOfCups;
        ingredients[1] = MILK_PER_CUP * numOfCups;
        ingredients[2] = COFFEE_PER_CUP * numOfCups;

        System.out.println("For " + numOfCups + " cups of coffee you will need:\n");
        System.out.println(ingredients[0] + " ml of water\n");
        System.out.println(ingredients[1] + " ml of milk\n");
        System.out.println(ingredients[2] + " g of coffee beans");
        return ingredients;
    }

    public static void verifySupplies() {

        Scanner input = new Scanner(System.in);
        System.out.println("How many ml of water the coffee machine has : ");
        int waterAvail = input.nextInt();
        System.out.println("How many ml of milk the coffee machine has : ");
        int milkAvail = input.nextInt();
        System.out.println("How many grams of coffee beans the coffee machine has : ");
        int coffeeBeansAvail = input.nextInt();
        System.out.println("How many cups of coffee you will need : ");
        int numOfCups = input.nextInt();
        int[] reqIngredients = calculateReqIngredients(numOfCups);

        int w = waterAvail / WATER_PER_CUP;
        int m = milkAvail / MILK_PER_CUP;
        int cb = coffeeBeansAvail / COFFEE_PER_CUP;
        int maxNumOfCups = Math.min(w, Math.min(m, cb));

        if (maxNumOfCups == numOfCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (maxNumOfCups > numOfCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxNumOfCups - numOfCups) + " more than that)");
        } else {
            System.out.println("No, I can make only " + maxNumOfCups + " cup(s) of coffee");
        }

    }
}