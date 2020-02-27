package problem10;

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

    public int countOne_1(int n){
        int flag = 1;
        int res = 0;
        while(flag > 0){
            int r = n & flag;
            if((n & flag) > 0){
                res++;
            }
            flag = flag << 1;
        }
        return res;
    }

    public int countOne(int n){
        int res = 0;
        while(n != 0){
            res++;
            n = (n - 1) & n;
        }
        return res;
    }

    private void  test_1(){
        //补码
        int n = -1;
        int res = countOne(n);
        System.out.println("test_1: 1, res: " + res);
    }

    private void test_2(){
        int n = 9;
        int res = countOne(n);
        System.out.println("test_2: 2, res: " + res);
    }

    private void test_3(){
        int n = 0;
        int res = countOne(n);
        System.out.println("test_3: 0, res: " + res);
    }

    private void test_4(){
        int n = 0x80000000;
        int res = countOne(n);
        System.out.println("test_4: 1, res: " + res);
    }

    private void test_5(){
        int n = 0x7FFFFFFF;
        int res = countOne(n);
        System.out.println("test_5: 31, res: " + res);
    }

    private void test_6(){
        int n = 0xFFFFFFFF;
        int res = countOne(n);
        System.out.println("test_6: 32, res: " + res);
    }
}
