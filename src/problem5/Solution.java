package problem5;

import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.test_1();
        s.test_2();
        s.test_3();

    }

    private class Node{
        public int value;
        public Node next;
    }

    private class List{
        private Node head;
        private Node tail;
        private int count = 0;

        public List(){
            head = null;
            tail = null;
            count = 0;
        }

        public List(int v){
            add(v);

        }

        public List(Node n){
            add(n);
        }

        private void addTail(Node n){
            if(head == null){
                head = n;
                tail = n;
            }else{
                tail.next = n;
                tail = tail.next;
            }
            count++;
        }

        private void add(int v){
            Node node = new Node();
            node.value = v;
            node.next = null;
            addTail(node);
        }

        private void add(Node n){
            addTail(n);
        }

        private Node tail(){
            return tail;
        }

        private boolean empty(){
            return count == 0 ? true : false;
        }
    }

    //递归
    //recursive_printReverseList
    private void printReverseList(List l){

    }

    //栈
    private void printReverseList_1(List l){

        if( l == null || l.empty()){
            return;
        }

        LinkedList<Integer> stack = new LinkedList<Integer>();
        Node n = l.head;
        while(n != null){
            stack.add(n.value);
            n = n.next;
        }

        while(stack.peekLast() != null){
            System.out.print(stack.removeLast());
        }
        System.out.println();
    }

    private void test_1() {
        List l = new List();
        System.out.println("test_1: ");
        printReverseList(l);
    }

    private void test_2(){
        List l = null;
        System.out.println("test_2: ");
        printReverseList(l);
    }

    private void test_3(){
        List l = new List();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("test_3: ");
        printReverseList(l);
    }

}
