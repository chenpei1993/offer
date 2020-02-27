package problem7;


public class Solution {

    public static void main(String[] args){
        Solution s = new Solution();
        s.test_1();
        s.test_2();
        s.test_3();

    }


    public void test_1(){
        MyQueue<Integer> queue = new MyQueue<Integer>();
        System.out.println("test_1: ");
        queue.addQueue(1);
        queue.addQueue(2);
        queue.addQueue(3);
        while (!queue.empty()){
            System.out.print(queue.dequeue());
        }
        System.out.println();
    }

    public void test_2(){
        MyQueue<Integer> queue = new MyQueue<Integer>();
        System.out.println("test_2: ");
        queue.addQueue(1);
        System.out.print(queue.dequeue());
        queue.addQueue(2);
        queue.addQueue(3);
        System.out.print(queue.dequeue());
        System.out.print(queue.dequeue());
        System.out.println();
    }

    public void test_3(){
        MyQueue<Character> queue = new MyQueue<Character>();
        System.out.println("test_3: ");
        queue.addQueue('a');
        System.out.print(queue.dequeue());
        queue.addQueue('b');
        System.out.print(queue.dequeue());
        queue.addQueue('c');
        queue.addQueue('d');
        System.out.print(queue.dequeue());
        System.out.println();
    }


}
