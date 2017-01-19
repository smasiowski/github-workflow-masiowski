package main.java.edu.cofc.workflow;

/**
 * Created by user on 1/19/17.
 */
public class rat extends pet {

    int numRats = quantity;



    public int buyRats(int num){

        buy(num);

        // setQuantity(num);
        numRats = quantity;
        System.out.println("The store bought " + num + " rats.");
        System.out.println("It now has a total of " + numRats + " rats.");
        return numRats;

    }

    public int sellRats(int num){

        if (num > numRats){
            System.out.println("Sorry, we do not have that many rats in stock.");
            System.out.println("Right now we have " + numRats + " rats.");
        }
        else {
            sell(num);
            numRats = quantity;
            System.out.println("The store sold " + num + " rats.");
            System.out.println("It now has a total of " + numRats + " rats.");
        }

        return numRats;

    }




}
