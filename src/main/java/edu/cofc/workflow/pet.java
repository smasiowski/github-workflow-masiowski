package main.java.edu.cofc.workflow;

/**
 * Created by user on 1/19/17.
 */
public class pet {

    public int quantity;

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public int buy(int num){
        quantity = quantity+num;
        setQuantity(quantity);
        return quantity;

    }

    public void sell(int num) {

            quantity = quantity - num;

            setQuantity(quantity);


        }


}
