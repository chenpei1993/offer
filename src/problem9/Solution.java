package problem9;

public class Solution {

    public static void main(String[] args){
        Solution s = new Solution();
        s.test_1();
        s.test_2();
        s.test_3();
        s.test_4();
        s.test_5();
    }

    private int Fibonacci_1(int n){
        if(n < 0){
            return -1;
        }

        if(n == 0){
            return 0;
        }

        int temp[] = new int[n];
        temp[0] = 1;
        temp[1] = 1;
        int res = 0;
        for(int i = 2; i < n; ++i){
            res = temp[i - 1] + temp[i - 2];
            temp[i] = res;
        }

        return res;
    }

    private int Fibonacci(int n){

        if(n < 0){
            return -1;
        }

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    private void test_1(){
        int n = -1;
        int res = Fibonacci(n);
        System.out.println("test_1 : " + res);
    }

    private void test_2(){
        int n = 3;
        int res = Fibonacci(n);
        System.out.println("test_2 :" + res);
    }

    private void test_3(){
        int n = 10;
        int res = Fibonacci(n);
        System.out.println("test_3 :" + res);
    }

    private void test_4(){
        int n = 12;
        int res = Fibonacci(n);
        System.out.println("test_4 :" + res);
    }

    private void test_5(){
        int n = 0;
        int res = Fibonacci(n);
        System.out.println("test_5 :" + res);
    }
}
