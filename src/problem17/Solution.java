package problem17;

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

    private Node reorderList(List l1, List l2){
        if(null == l1){
            return l2.head;
        }

        if(null == l2){
            return l1.head;
        }

        Node node1 = l1.head;
        Node node2 = l2.head;
        while(node1 != null && node2 != null){
            if(node1 != null){

            }

            if(node2 != null){

            }
        }
        return null;
    }

    private void test_1(){
        List l1 = null;
        List l2 = null;
        Node res = reorderList(l1, l2);
        if(null == res){
            System.out.println("test_1 is successful");
        }else{
            System.out.println("test_1 is failed");
        }
    }

    private void test_2(){
        List l1 = new List(new int[]{
                1, 2, 3, 4, 5
        });
        List l2 = new List(new int[]{
                3, 5, 6
        });
        Node res = reorderList(l1, l2);
        System.out.println("test_2: ");
        printList(res);
    }

    private void test_3(){
        List l1 = new List(new int[]{
                1, 3, 5
        });
        List l2 = new List(new int[]{
                2, 4, 6, 7, 8
        });
        Node res = reorderList(l1, l2);
        System.out.println("test_3: ");
        printList(res);
    }

    private void test_4(){
        List l1 = null;
        List l2 = new List(new int[]{
                2, 4, 6, 7, 8
        });
        Node res = reorderList(l1, l2);
        System.out.println("test_4: ");
        printList(res);
    }

    private void test_5(){
        List l1 = new List(new int[]{
                1, 3, 5
        });
        List l2 = null;
        Node res = reorderList(l1, l2);
        System.out.println("test_5: ");
        printList(res);
    }

    private void test_6(){
        List l1 = new List(new int[]{
                1
        });
        List l2 = new List(new int[]{
                2
        });
        Node res = reorderList(l1, l2);
        System.out.println("test_6: ");
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
