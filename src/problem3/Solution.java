package problem3;

public class Solution {
    public static void main(String[] args) {
        Solution o = new Solution();
        o.test_1();
        o.test_2();
        o.test_3();
        o.test_4();
        o.test_5();
        o.test_6();
    }

    private boolean numInArr(int [][] arr,int col, int row,int n){
        if(arr == null){
            return false;
        }

        int i = 0;
        int j = col - 1;

        while(i < row && j >= 0){
            if(arr[i][j] == n){
                return true;
            }else if(arr[i][j] < n){
                ++i;
            }else{
                --j;
            }
        }


        return false;
    }

    private boolean numInArr_1(int [][] arr,int col, int row,int n){
        //首先考虑边界问题
        if(arr == null){
            return false;
        }
        int i,j;
        for(i = 0; i < row; i++){
            for(j = 0; j < col; j++){
                if(arr[i][j] == n){
                    return  true;
                }
            }
        }

        return false;
    }



    private void test_1(){
        int[][] arr = null;
        boolean res = numInArr(arr,0,0,1);
        //res  应该是false， arr 为null;
        if(!res){
            System.out.println("test_1 is successful");
        }else{
            System.out.println("test_1 is failed");
        }
    }

    private void test_2(){
        int[][] arr = {
                {1, 2, 4, 7, 8},
                {2, 4, 8, 10, 12},
                {3, 5, 10, 13, 18},
        };
        boolean res = numInArr(arr,5,3,20);
        //res  应该是false， n 超过上边界;

        if(!res){
            System.out.println("test_2 is successful");
        }else{
            System.out.println("test_2 is failed");
        }
    }

    private void test_3(){
        int[][] arr = {
                {1, 2, 4, 7, 8},
                {2, 4, 8, 10, 12},
                {3, 5, 10, 13, 18},
        };
        boolean res = numInArr(arr,5,3,-1);
        //res  应该是false,n 超过下边界;

        if(!res){
            System.out.println("test_3 is successful");
        }else{
            System.out.println("test_3 is failed");
        }
    }

    private void test_4(){
        int[][] arr = {
                {1, 2, 4, 7, 8},
                {2, 4, 8, 10, 12},
                {3, 5, 10, 13, 18},
        };
        boolean res = numInArr(arr,5,3,10);
        //res 为 true， n是中间值
        if(res){
            System.out.println("test_4 is successful");
        }else{
            System.out.println("test_4 is failed");
        }
    }

    private void test_5(){
        int[][] arr = {
                {1, 2, 4, 7, 8},
                {2, 4, 8, 10, 12},
                {3, 5, 10, 13, 18},
        };
        boolean res = numInArr(arr,5,3,1);
        //res 为 true， n是最小值
        if(res){
            System.out.println("test_5 is successful");
        }else{
            System.out.println("test_5 is failed");
        }
    }

    private void test_6(){
        int[][] arr = {
                {1, 2, 4, 7, 8},
                {2, 4, 8, 10, 12},
                {3, 5, 10, 13, 18},
        };
        boolean res = numInArr(arr,5,3,18);
        //res 为 true， n是最大值
        if(res){
            System.out.println("test_6 is successful");
        }else{
            System.out.println("test_6 is failed");
        }
    }

}

