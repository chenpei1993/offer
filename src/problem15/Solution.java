package problem15;

import java.awt.*;

public class Solution {

    public static void main(String[] args){
        Solution s = new Solution();
        s.test_1();
        s.test_2();
        s.test_3();
        s.test_4();
        s.test_5();
    }

    private Node getKToTail(List l, int k){

        if(null == l){
            return null;
        }

        Node n = l.head;
        for(int i = 1; i < k; ++i){
            n = n.next;
            if(null == n){
                throw new NullPointerException();
            }
        }

        Node node = l.head;
        while(null != n.next){
            n = n.next;
            node = node.next;
        }

        return node;
    }


    private void test_1(){
        List l = null;
        Node n = getKToTail(l,2);
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
        Node n = getKToTail(l, 2);
        System.out.println("test_2 ans is 4, res: " + n.value);
    }

    private void test_3(){
        List l = new List(new int[]{
                1, 2, 3, 4, 5
        });
        try{
            Node n = getKToTail(l, 6);
            System.out.println("test_3 is failed");
        }catch (NullPointerException e){
            System.out.println("test_3 is successful");
        }
    }

    private void test_4(){
        List l = new List(new int[]{
                1, 2, 3, 4, 5
        });
        Node n = getKToTail(l, -1);
        System.out.println("test_4 ans is 5, res: " + n.value);
    }

    private void test_5(){
        List l = new List(new int[]{
                1, 2, 3, 4, 5
        });
        Node n = getKToTail(l, 1);
        System.out.println("test_5 ans is 5, res: " + n.value);
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
