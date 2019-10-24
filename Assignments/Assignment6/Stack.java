public class Stack<sT> {
    private List<sT> l;

    // constructors
    public Stack() {
        l = new List<sT>();
    }

    public Stack(Stack<sT> s) {
        l = new List<sT>(s.l);
        l.First();
    }

    public sT Push(sT data) {
        l.InsertBefore(data);
        return data;

    }

    public sT Pop() {
        l.Remove();
        return null;
    }

    public sT Peek() {
        return l.GetValue();
    }

    public int Size() {
        return l.GetSize();
    }

    public boolean IsEmpty() {
        return l.IsEmpty();
    }

    public boolean IsFull() {
        return l.IsFull();
    }

    // Equals()
    // {

    // }

    // Add()
    // {

    // }

    public String toString() {
        return l.toString();
    }

}