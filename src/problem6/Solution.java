package problem6;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        s.test_1();
        s.test_2();
        s.test_3();
        s.test_4();
        s.test_5();
        s.test_6();
        s.test_7();
        s.test_8();
    }

    private class Node{
        int value;
        private Node left;
        private Node right;

        Node(int v){
            value = v;
            left = null;
            right = null;
        }
    }

    //打印前序遍历
    public void printPreOrder(Node n){
        if(n != null){
            System.out.print(n.value +" ");
            printPreOrder(n.left);
            printPreOrder(n.right);
        }

    }

    //打印中序遍历
    public void printInOrder(Node n){
        if(n != null){
            printInOrder(n.left);
            System.out.print(n.value +" ");
            printInOrder(n.right);
        }
    }

    private Node rebuildTree(int [] preOrder,int [] inOrder){

        if(preOrder == null || inOrder == null){
            return null;
        }

        Node root = _rebuild(preOrder,inOrder);
        System.out.println("preOrder: ");
        printPreOrder(root);
        System.out.println();
        System.out.println("inOrder: ");
        printInOrder(root);
        System.out.println();

        return null;
    }

    private Node _rebuild(int [] preOrder,int [] inOrder){

        if(preOrder.length == 0 || inOrder.length == 0){
            return null;
        }

        int rootValue =  preOrder[0];

        Integer leftNum = null,rightNum = null;
        int i;
        for(i = 0; i < inOrder.length; i++){
            if(inOrder[i] == rootValue){
                leftNum = i;
                rightNum = inOrder.length - i;
                break;
            }
        }

        //不匹配
        if(leftNum == null || rightNum == null){
            return null;
        }

        if(leftNum == 0 && rightNum == 0){
            return null;
        }


        Node node = new Node(rootValue);
        node.left = _rebuild(
                Arrays.copyOfRange(preOrder,1,preOrder.length),
                Arrays.copyOfRange(inOrder,0,i));
        node.right = _rebuild(
                Arrays.copyOfRange(preOrder,1 + leftNum,preOrder.length),
                Arrays.copyOfRange(inOrder,i + 1,inOrder.length));

        return node;
    }

    private void test_1(){
        int [] preOrder = {1, 2, 4, 7, 10, 3, 6, 8};
        int [] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        System.out.println("test_1:" );
        Node res = rebuildTree(preOrder,inOrder);
    }

    //测试null
    private void test_2(){
        int [] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int [] inOrder = null;
        System.out.println("test_2:" );
        Node res = rebuildTree(preOrder,inOrder);
        if(res == null){
            System.out.println("test_2 was successed");
        }else{
            System.out.println("test_2 was failed");
        }
    }

    //测试null
    private void test_3(){
        int [] preOrder = null;
        int [] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        System.out.println("test_3:" );
        Node res = rebuildTree(preOrder,inOrder);
        if(res == null){
            System.out.println("test_2 was successed");
        }else{
            System.out.println("test_2 was failed");
        }
    }

    //测试单节点
    private void test_4(){
        int [] preOrder = {1};
        int [] inOrder = {1};
        System.out.println("test_4:" );
        Node res = rebuildTree(preOrder,inOrder);

    }

    //测试只有左子树
    private void test_5(){
        int [] preOrder = {1, 2, 3, 4, 5, 6};
        int [] inOrder = {6, 5, 4, 3, 2, 1};
        System.out.println("test_5:" );
        Node res = rebuildTree(preOrder,inOrder);
    }

    //测试只有右子树
    private void test_6(){
        int [] preOrder = {1, 2, 3, 4, 5, 6};
        int [] inOrder = {1, 2, 3, 4, 5, 6};
        System.out.println("test_6:" );
        Node res = rebuildTree(preOrder,inOrder);
    }


    //完全二叉树
    private void test_7(){
        int [] preOrder = {10, 6, 4, 8, 14, 12, 16};
        int [] inOrder = {4, 6, 8, 10, 12, 14, 16};
        System.out.println("test_7:" );
        Node res = rebuildTree(preOrder,inOrder);
    }

    //不完全二叉树
    private void test_8(){
        int [] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int [] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        System.out.println("test_1:" );
        Node res = rebuildTree(preOrder,inOrder);


    }
}
