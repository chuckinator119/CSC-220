class Node {
    public static void main(String[] args) {
        Node head;
        Node tail;
        Node curr;

        head = new Node();
        tail = head;
        curr = head;
        head.setData(0);
        // 5
        head.setLink(new Node());
        tail = head.getLink();
        tail.setData(5);
        // 10
        tail.setLink(new Node());
        tail = tail.getLink();
        tail.setData(10);
        // 15
        tail.setLink(new Node());
        tail = tail.getLink();
        tail.setData(15);
        // 20
        tail.setLink(new Node());
        tail = tail.getLink();
        tail.setData(20);
        // removing 15

        // System.out.print(head.getData());

        // curr = head;
        // curr = curr.getLink().getLink();
        // curr.setLink(curr.getLink().getLink());
        // System.out.print(curr.getData());
        curr = head;
        Node test = new Node();
        test.setData(12);
        curr = curr.getLink().getLink();
        test.setLink(curr.getLink());
        curr.setLink(test);
        System.out.println();
        System.out.println();
        System.out.println();

        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.getLink();
        }

    }

    private int data;
    private Node link;

    public Node() {
        this.data = 0;
        this.link = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return this.link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

}
