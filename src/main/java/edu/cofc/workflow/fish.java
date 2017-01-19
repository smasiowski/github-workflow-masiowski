package main.java.edu.cofc.workflow;

/**
 * Created by user on 1/19/17.
 */
public class fish extends pet {

    int numFish = quantity;



    public int buyFish(int num){

        buy(num);

       // setQuantity(num);
        numFish = quantity;
        System.out.println("The store bought " + num + " fish.");
        System.out.println("It now has a total of " + numFish + " fish.");
        return numFish;

    }

    public int sellFish(int num){

        if (num > numFish){
            System.out.println("Sorry, we do not have that many fish in stock.");
            System.out.println("Right now we have " + numFish + " fish.");
        }
        else {
            sell(num);
            numFish = quantity;
            System.out.println("The store sold " + num + " fish.");
            System.out.println("It now has a total of " + numFish + " fish.");
        }

        return numFish;

    }



}
