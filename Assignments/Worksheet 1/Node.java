class Node
{ 
    public static void main(String[] args) {
        Node head = new Node();
        Node curr = new Node();

        head.setData(0);
        
        curr = head;
        System.out.print(head.getData());

        // int x;
        // for(x =15; x < 45; x += 5)
        // {

        //     head.setData(x);
        //     head.setLink(curr.getLink());
        //     System.out.print(head.getData() + "  ");          
            
        // }
        
        
        
        // Node newNode = new Node();
        // newNode.setData(5);
        // newNode.setLink(curr.getLink());
        // curr.setLink(curr.getLink());
        // System.out.print(newNode.getData());
        

    }
    private int data;
    private Node link;

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
}

// class LinkedList
// {
    
// }