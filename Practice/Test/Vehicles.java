public class Vehicles {
    float cost;
    int weight;
    int capacity; 

    public Vehicles(){
        this.cost = cost;
        this.weight = weight;
        this.capacity = capacity;

    }
    public static void main(String[] args){


        Boat schooner = new Boat();

        schooner.cost = 362000;
        schooner.turnrate = 10; //degress per minute
        schooner.displacement = 10000;
        System.out.println("The cost of a schooner is" + schooner.cost );
        System.out.println("displacement is "+ schooner.displacement);
        System.out.println("turnrate is "+ schooner.turnrate);
    }
}


class Boat extends Vehicles{
    float turnrate;
    int displacement;
    String rigging;

    public Boat(){
        this.turnrate = turnrate;
        this.displacement = displacement;
        this.rigging = rigging;
    }

}

class Airplane extends Vehicles{

}

class Car extends Vehicles{

}

<<<<<<< HEAD
=======
// COOOOOOOOOOMMMMMMMMMMMMMTEEENNNNNNTINGGGGGGGGGGGGGG
// TESTING MORE FEAUTIRES
>>>>>>> parent of 2ad3b03... the thing is done
