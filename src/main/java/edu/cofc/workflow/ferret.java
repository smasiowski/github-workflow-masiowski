package main.java.edu.cofc.workflow;

/**
 * Created by user on 1/19/17.
 */
public class ferret extends pet {


    int numFerrets = quantity;



    public int buyFerrets(int num){

        buy(num);
        numFerrets = quantity;
        System.out.println("The store bought " + num + " ferrets.");
        System.out.println("It now has a total of " + numFerrets + " ferrets.");
        return numFerrets;

    }

    public int sellFerrets(int num){

        if (num > numFerrets){
            System.out.println("Sorry, we do not have that many ferrets in stock.");
            System.out.println("Right now we have " + numFerrets + " ferrets.");
        }
        else {
            sell(num);
            numFerrets = quantity;
            System.out.println("The store sold " + num + " ferrets.");
            System.out.println("It now has a total of " + numFerrets + " ferrets.");
        }

        return numFerrets;

    }



}
