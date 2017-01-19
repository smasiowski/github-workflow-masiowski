package main.java.edu.cofc.workflow;

/**
 * Created by user on 1/19/17.
 */
public class store {

    fish FISH = new fish();
    ferret FERRETS = new ferret();
    rat RATS = new rat();

    public store(){
        FISH.setQuantity(0);
        FERRETS.setQuantity(0);
        RATS.setQuantity(0);

        System.out.println("");
        System.out.println("==============================================");
        System.out.println("-----------------PET STORE--------------------");
        System.out.println("==============================================");
        System.out.println("");
        inventory();

    }

    public store(int fish, int ferrets, int rats){
        FISH.setQuantity(fish);
        FERRETS.setQuantity(ferrets);
        RATS.setQuantity(rats);

        System.out.println("");
        System.out.println("==============================================");
        System.out.println("-----------------PET STORE--------------------");
        System.out.println("==============================================");
        System.out.println("");
        inventory();  

    }

    public void buy(String species, int quantity){
        if (species=="rat" || species=="rats"){
            RATS.buyRats(quantity);
        }
        else if (species=="ferret" || species=="ferrets"){
            FERRETS.buyFerrets(quantity);
        }
        else if (species=="fish"){
            FISH.buyFish(quantity);
        }

    }

    public void sell(String species, int quantity){
        if (species=="rat" || species=="rats"){
            RATS.sellRats(quantity);
        }
        else if (species=="ferret" || species=="ferrets"){
            FERRETS.sellFerrets(quantity);
        }
        else if (species=="fish"){
            FISH.sellFish(quantity);
        }

    }


    public void inventory(){

        System.out.println("----------------PET INVENTORY----------------");
        System.out.println("FISH: " + FISH.numFish);
        System.out.println("FERRETS: " + FERRETS.numFerrets);
        System.out.println("RATS: " + RATS.numRats);
       System.out.println("----------------------------------------------");
        System.out.println("");

    }




    public static void main(String[] args) {






    }


}
