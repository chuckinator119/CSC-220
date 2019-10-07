class generics 
{
    public static <mytype> void printArr[] (mytype[] arr)
    {
        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
            System.out.println();       
    }
    public static void main(String[] args) {
        Integer[] x = {1,3,4,5,6};
        printArr(x);

        Double[] y = {1,2,3,4,5,6,7,5.6};
        printArr(y);
    }
}

class NodeTest
{
    public static void main(String[] args) {
        Node<Integer> a = new Node<Integer>();
        Node<Double> b = new Node<Double>();
        
        a.setdata(4)
        
        b.setData(5)

        a.setlink(b);
        
        S
    }   
}