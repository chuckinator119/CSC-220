class Node {
	private int data;
	private Node link;

	// constructor
	public Node() {
		this.data = 0;
		this.link = null;
	}

	// accessor and mutator for the data component
	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	// accessor and mutator for the link component
	public Node getLink() {
		return this.link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
}

// the List class
public class List {
	public static final int MAX_SIZE = 50;

	private Node head;
	private Node tail;
	private Node curr;
	private Node temp;
	private int num_items;

	// constructor
	// remember that an empty list has a "size" of -1 and its "position" is at -1
	public List() {
		head = null;
		tail = null;
		curr = null;
		num_items = 0;
	}

	// copy constructor
	// clones the list l and sets the last element as the current
	public List(List l) {
		Node n = l.head;
		head = tail = curr = null;
		while (n != null) {
			InsertAfter(n.getData());
			n = n.getLink();
		}
	}

	// navigates to the beginning of the list
	public void First() {
		curr = head;
	}

	// navigates to the end of the list
	// the end of the list is at the last valid item in the list
	public void Last() {
		curr = tail;
	}

	// navigates to the specified element (0-index)
	// this should not be possible for an empty list
	// this should not be possible for invalid positions
	public void SetPos(int pos) {
		if (!IsEmpty() && pos > 0 && pos < num_items) {
			curr = head;

			for (int i = 0; i < pos; i++)
				curr = curr.getLink();
		}
	}

	// navigates to the previous element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Prev() {
		if (!IsEmpty() && curr != head) {
			Node n = head;

			while (n.getLink() != curr)
				n = n.getLink();

			curr = n;
		}
	}

	// navigates to the next element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Next() {
		if (!IsEmpty() && curr != tail)
			curr = curr.getLink();
	}

	// returns the location of the current element (or -1)
	public int GetPos() {
		if (IsEmpty())
			return -1;

		Node n = head;
		int i = 0;

		while (n != curr) {
			n = n.getLink();
			i++;
		}

		return i;
	}

	// returns the value of the current element (or -1)
	public int GetValue() {
		if (IsEmpty())
			return -1;
		else
			return curr.getData();
	}

	// returns the size of the list
	// size does not imply capacity
	public int GetSize() {
		return num_items;
	}

	// inserts an item before the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertBefore(int data) {
		if (!IsFull()) {
			if (IsEmpty())
				InsertAfter(data);
			else {
				if (curr == head) {
					head = new Node();
					head.setData(data);
					head.setLink(curr);
					curr = head;
					num_items++;
				} else {
					Prev();
					InsertAfter(data);
				}
			}
		}
	}

	// inserts an item after the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertAfter(int data) {
		if (!IsFull()) {
			Node n = new Node();
			n.setData(data);

			if (IsEmpty())
				head = tail = curr = n;
			else {
				if (curr == tail) {
					curr.setLink(n);
					curr = tail = n;
				} else {
					n.setLink(curr.getLink());
					curr.setLink(n);
					curr = n;
				}
			}
			num_items++;
		}
	}

	// removes the current element (collapsing the list)
	// this should not be possible for an empty list
	public void Remove() {
		if (!IsEmpty()) {
			if (curr == head) {
				head = curr = curr.getLink();
			} else {
				Prev();
				curr.setLink(curr.getLink().getLink());

				if (curr.getLink() == null)
					tail = curr;
				Next();
			}
			num_items--;
		}
	}

	// replaces the value of the current element with the specified value
	// this should not be possible for an empty list
	public void Replace(int data) {
		if (!IsEmpty())
			curr.setData(data);
	}

	// returns if the list is empty
	public boolean IsEmpty() {
		return num_items == 0;
	}

	// returns if the list is full
	public boolean IsFull() {
		return num_items == MAX_SIZE;
	}

	// returns if two lists are equal (by value)
	public boolean Equals(List l) {
		if (num_items != l.num_items)
			return false;

		Node p = head;
		Node q = l.head;

		while (p != null) {
			if (p.getData() != q.getData())
				return false;
			p = p.getLink();
			q = q.getLink();
		}
		return true;
	}

	// returns the concatenation of two lists
	// l should not be modified
	// l should be concatenated to the end of *this
	// the returned list should not exceed MAX_SIZE elements
	// the last element of the new list is the current
	public List Add(List l) {
		List t = new List(this);
		Node n = l.head;

		while (n != null && !t.IsFull()) {
			t.InsertAfter(n.getData());
			n = n.getLink();
		}
		return t;
	}

	// returns a string representation of the entire list (e.g., 1 2 3 4 5)
	// the string "NULL" should be returned for an empty list
	public String toString() {
		if (head == null)
			return "NULL";
		else {
			String s = "";
			Node n = head;

			while (n != null) {
				s += n.getData() + " ";
				n = n.getLink();
			}
			return s;
		}
	}
}