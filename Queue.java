
		public class Queue {
		    Node head;
		    Node tail;
		    Queue()
		    {
		        head = null;
		        tail = null;
		    }
		    void enqueue(Node newNode)
		    {
		        if(head == null && tail == null)
		        {
		            head = tail = newNode;
		            return ;
		        }
		        tail.link = newNode;
		        tail = newNode;
		    }
		    Node dequeue()
		    {
		        Node headNode = head;
		        head = head.link;
		        return headNode;
		    }
	
		
		    public static void main(String[] args)
		    {
		       int[] numbers = {111,222,333,444,555,666,777};
		       Queue q = new Queue();
		       for(int n:numbers)
		       {
		           Node newNode = new Node(n);
		           q.enqueue(newNode);
		       }
		       for(;q.head!=null;)System.out.println(q.dequeue().value);
		    }   

}
