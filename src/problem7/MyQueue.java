package problem7;

public class MyQueue<T> {

    private class Node{
        T value;
        Node next;

        Node(T v){
            value = v;
            next = null;
        }

        public T getValue(){
            return value;
        }
    }

    private class MyStack {

        private Node head;
        private int count;

        MyStack(){
            count = 0;
        }

        public Node pop(){
            Node t = null;
            if(head != null) {
                t = head;
                head = head.next;
            }
            count--;
            return t;
        }

        public Node push(T v){
            Node n = new Node(v);
            if(head == null){
                head = n;
            }else{
                n.next = head;
                head = n;
            }
            count++;
            return n;
        }

        public Node push(Node n){
            if(head == null){
                head = n;
            }else{
                n.next = head;
                head = n;
            }
            count++;
            return n;
        }

        public boolean empty(){
            return count == 0;
        }

    }

    private MyStack stack1 = new MyStack();
    private MyStack stack2 = new MyStack();
    private Integer count = 0;

    public void addQueue(T v){
        stack1.push(v);
        count++;
    }

    public T dequeue(){
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        count--;
        return stack2.pop().getValue();
    }


    public boolean empty(){
        return count == 0;
    }
}
