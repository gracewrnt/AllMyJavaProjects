class Node {
    int value;
    Node link;
    Node(int x)
    {
        value = x;
        link = null;
    }
}

	public class Stack {
    Node top;
    Stack()
    {
        top = null;
    }
    void push(Node newNode)
    {
        newNode.link = top;
        top = newNode;
    }
    Node pop()
    {
        Node lastNode = top;
        top = top.link;
        return lastNode;
    }

    public static void main(String[] args)
    {
       int[] numbers = {111,222,333,444,555,666,777};
       Stack s = new Stack();
       for(int n:numbers)
       {
           Node newNode = new Node(n);
           s.push(newNode);
       }
       for(;s.top!=null;)
       {
           System.out.println(s.pop().value);
       }
    }
}