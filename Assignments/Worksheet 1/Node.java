class Node
{

    public static void main(String[] args) {
        Node node = new Node();
        node.setData(5);
        System.out.println(node.data);
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