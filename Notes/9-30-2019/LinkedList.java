class LinkedList
{
    public static void main(String[] args) 
    {
        
    
    Node head;
    Node curr;

    head = new Node();

    head.setData(17);

    curr = head;

    curr.setLink(new Node());
    curr = curr.getLink();
    curr.setData(10);

    curr.setLink(new Node());
    curr.getLink().setData(15);

    curr.getLink().setLink(new Node());
    curr.getLink().getLink().setData(32);


    curr = curr.getLink().getLink();
    
    Node newNode = new Node();
    newNode.setData(72);    

    newNode.setLink(curr.getLink());

    curr.setLink(newNode);
    curr.setLink(curr.getLink().getLink());
    curr = head;
    while (curr != null)
    {
        System.out.print(curr.getData() + " ");

        curr = curr.getLink();

    }
    System.out.println();
    }
}