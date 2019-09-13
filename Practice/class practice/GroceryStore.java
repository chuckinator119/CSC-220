public class GroceryStore{
    public static void main (String[] args){
        storeItem milk = new storeItem("Milk",2.30,2,600);
        storeItem bread = new storeItem("Milk",1,1,1);
        storeItem peanutbutter = new storeItem("Milk",1,1,1);
        
        System.out.println("item one info: " + milk.id+", " + milk.amount +", "+milk.cost+", "+milk.weight);
        System.out.println("item two info: " + bread.id+", " + bread.amount +", "+bread.cost+", "+bread.weight);
        System.out.println("item three info: " + peanutbutter.id+", " + peanutbutter.amount +", "+peanutbutter.cost+", "+peanutbutter.weight);
        System.out.println("The total cost of __ in the store is: "+ milk.totalCost());
    }
}
class storeItem{
    String id;
    double cost;
    double weight;
    double amount;
//making a constructor for the "store item class"
    storeItem(String i, double c,double w,double a){
        id = i;
        cost = c; 
        weight = w; 
        amount = a;
    }
    double totalCost(){
        double totalCostofItems;
        totalCostofItems = amount * cost;
        return totalCostofItems;
    }

}
