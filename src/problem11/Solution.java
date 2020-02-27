package problem11;

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

    private double power_1(double base, int exponent){
        int minus = 0;
        if(0 > exponent){
            exponent = Math.abs(exponent);
            minus = 1;
        }else if(0 == base){
            //或者爆出异常
            return 0;
        }

        int res = 1;
        for(int i = 0; i < exponent; ++i){
            res *= base;
        }

        if(1 == minus){
            return 1 / res;
        }

        return res;

    }

    private double power(double base, int exponent){
        if(1 == exponent){
            return base;
        }

        if(0 == exponent){
            return 0;
        }

        int n = exponent;
        if(0 > exponent){
            n = -exponent;
        }

        double result = power(base, n >> 1);
        result *= result;
        if((exponent & 1) == 1){
            result *= base;
        }
        return exponent < 0 ? 1 /result : result;

    }

    private void test_1(){
        double base = 1;
        int exponent = 0;
        double res = power(base, exponent);
        System.out.println("test_1 ans: 1, and res: " + res);
    }

    private void test_2(){
        double base = 0;
        int exponent = 0;
        double res = power(base, exponent);
        System.out.println("test_2 ans: 0, and res: " + res);
    }

    private void test_3(){
        double base = -1;
        int exponent = 0;
        double res = power(base, exponent);
        System.out.println("test_3 ans: -1, and res: " + res);
    }

    private void test_4(){
        double base = -1;
        int exponent = 5;
        double res = power(base, exponent);
        System.out.println("test_4 ans: -1, and res: " + res);
    }

    private void test_5(){
        double base = 1;
        int exponent = 5;
        double res = power(base, exponent);
        System.out.println("test_5 ans: 1, and res: " + res);
    }

    private void test_6(){
        double base = 2;
        int exponent = 5;
        double res = power(base, exponent);
        System.out.println("test_6 ans: 32, and res: " + res);
    }

    private void test_7(){
        double base = -2;
        int exponent = 5;
        double res = power(base, exponent);
        System.out.println("test_7 ans: 32, and res: " + res);
    }

    private void test_8(){
        double base = 2;
        int exponent = -5;
        double res = power(base, exponent);
        System.out.println("test_7 ans: 0.03125, and res: " + res);
    }


}
