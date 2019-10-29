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

    public boolean Equals(Stack<sT> s) {
        if (l.Equals(s.l)) {
            return true;
        } else {
            return false;
        }
    }

    public Stack<sT> Add(Stack<sT> s) {
        Stack<sT> t = new Stack<sT>(this);
        t.l = l.Add(s.l);
        t.l.First();
        return t;

    }

    public String toString() {
        return l.toString();
    }

}