class Node
{
    private int data;
    private Node link;

    public Node(){
        this.data = 0;
        this.link = null;

    }
    //?accesors and mutators 
    public int getData()
    {
        return this.data;
    }

    public void setData()
    {
        this.data = value;
        
    }

    public void setLink(Node n)
    {
        this.link = n;

    }

    public Node getLink()
    {   
        return this.link;

    }

}


