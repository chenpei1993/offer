package problem13;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        s.test_1();
        s.test_2();
        s.test_3();
        s.test_4();
        s.test_5();
        s.test_6();
    }

    private Node deleteNode(List l, int n){

        if(null == l){
            return null;
        }

        Node node = l.head;
        Node ans = null;
        if(node.value == n){
            l.head = l.head.next;
            return node;
        }

        while(null != node.next){
            if(node.next.value == n){
                ans = node.next;
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }

        return ans;
    }

    private void test_1(){
        List l = null;
        Node n = deleteNode(l,2);
        if(null == n){
            System.out.println("test_1 is successful");
        }else{
            System.out.println("test_1 is failed");
        }
    }

    private void test_2(){
        List l = new List(new int[]{
                1, 2, 3, 4, 5
        });
        Node n = deleteNode(l, 2);
        System.out.println("test_2 ans is 2, res: " + n.value);
    }

    private void test_3(){
        List l = new List(new int[]{
                1, 2, 3, 4, 5
        });
        Node n = deleteNode(l, 6);
        if(null == n){
            System.out.println("test_3 is successful");
        }else{
            System.out.println("test_3 is failed");
        }
    }

    private void test_4(){
        List l = new List(new int[]{
                1, 2, 3, 4, 5
        });
        Node n = deleteNode(l, -1);
        if(null == n){
            System.out.println("test_4 is successful");
        }else{
            System.out.println("test_4 is failed");
        }
    }

    private void test_5(){
        List l = new List(new int[]{
                1, 2, 3, 4, 5
        });
        Node n = deleteNode(l, 1);
        System.out.println("test_5 ans is 1, res: " + n.value);
    }

    private void test_6(){
        List l = new List(new int[]{
                1, 2, 3, 4, 5
        });
        Node n = deleteNode(l, 5);
        System.out.println("test_6 ans is 5, res: " + n.value);
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
