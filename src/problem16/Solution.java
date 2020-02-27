package problem16;

public class Solution {

    public static void main(String[] args){
        Solution s = new Solution();
        s.test_1();
        s.test_2();
        s.test_3();
    }

    private Node reverseList(Node head){

        if(null == head){
            return null;
        }

        Node temp = null;
        Node nextNode;
        Node n = head;
        while(null != n){
            nextNode = n.next;
            n.next = temp;
            temp = n;
            n = nextNode;
        }

        return temp;
    }

    private void test_1(){
        Node head = null;
        Node res = reverseList(head);
        if(res == null){
            System.out.println("test_1 is successful");
        }else{
            System.out.println("test_1 is failed");
        }
    }

    private void test_2(){
        List l = new List(new int []{
                1, 2, 3, 4, 5
        });
        Node res = reverseList(l.head);
        System.out.println("test_2: ");
        printList(res);
    }

    private void test_3(){
        List l = new List(new int[]{
                1
        });
        Node res = reverseList(l.head);
        System.out.println("test_3: ");
        printList(res);

    }


    private void printList(Node n){
        while(null != n){
            System.out.print(n.value);
            n = n.next;
        }
        System.out.println();
    }

    class Node{
        int value;
        Node next;

        Node(int v){
            value = v;
            next = null;
        }
    }

    class List{
        Node head;

        List(int[] arr){
            head = new Node(arr[0]);
            Node n = head;
            for(int i = 1; i < arr.length; ++i){
                n.next = new Node(arr[i]);
                n = n.next;
            }
        }
    }
}
