// class
class Node
{
//main
    public static void main(String[] args)
    {
        Node head;
        Node curr;
        head = new Node();
        head.setData(17); 
        curr = head;   
        
        // curr.setLink(new Node());
        // curr = curr.getLink();
        // curr.setData(10);
        
        // curr.setLink(new Node());
        // curr.getLink().setData(15);

        // curr.getLink().setLink(new Node());
        // curr.getLink().getLink().setData(32);
        // curr = curr.getLink().getLink();

        // Node newNode = new Node();
        // newNode.setData(72);
        // newNode.setLink(curr.getLink());
        // curr.setLink(newNode);







        curr = head;
        while (curr!= null)
        {
            System.out.print(curr.getData() + " ");

            curr = curr.getLink();
        }
        System.out.println();
    }
//declare variables
    private int data;
    private Node link;
//all the functions
    public Node()
    {
        this.data = 0;
        this.link = null;
    }

    public int getData()
    {
        return this.data;
    }

    public void setData(int data)
    {
        this.data = data;

    }

    public Node getLink()
    {
        return this.link;
    }

    public void setLink(Node link)
    {
        this.link = link;

    }

    // public void Traverse(data link)
    // {
    //     curr = head;
    //     while (curr != null)
    //     {
    //         System.out.print(curr.getData()+"  ");
    //                                         //manipulate the nodes here
    //                                         //with each node
    //         curr = curr.getLink();

    //     }
    //     System.out.println();

    
}

