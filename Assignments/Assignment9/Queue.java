public class Queue<sT> {
    private List<sT> l;

    // constructors
    public Queue() {
        l = new List<sT>();
    }

    public Queue(Queue<sT> s) {
        l = new List<sT>(s.l);
        l.First();
    }

    public sT Enqueue(sT data) {
        l.Last();
        l.InsertAfter(data);
        return data;

    }

    public sT Dequeue() {
        l.First();
        l.Remove();
        return null;
    }

    public sT Peek() {
        l.First();
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

    public boolean Equals(Queue<sT> s) {
        if (l.Equals(s.l)) {
            return true;
        } else {
            return false;
        }
    }

    public Queue<sT> Add(Queue<sT> s) {
        Queue<sT> t = new Queue<sT>(this);
        t.l = l.Add(s.l);
        t.l.First();
        return t;

    }

    public String toString() {
        return l.toString();
    }

}