package main.java.edu.cofc.workflow;

/**
 * Created by user on 1/19/17.
 *
 *
*/
public class Main{



    public static void main(String[] args) {

        //create store with 0 pets
        store store = new store();

        store.inventory();

        //buy pets
        store.buy("rats", 10);
        store.buy("ferret", 15);
        store.buy("fish", 11);
        store.inventory();


        //sell pets
        store.sell("rats", 1);
        store.sell("ferret", 5);
        store.sell("fish", 1);
        store.inventory();

        // create store with pets already there
        store store2 = new store(1,2,3);

    }
}

