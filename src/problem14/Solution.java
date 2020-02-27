package problem14;

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
    }


    private int[] reorderOddEven(int[] arr){

        if(null == arr){
            return null;
        }

        int start = 0;
        int end = arr.length -1;
        int temp;
        while(start < end){

            while(start <= end && (arr[start] & 1) == 1){
               start++;
            }

            while(start <= end && (arr[end] & 1) == 0){
                end--;
            }

            if(start <= end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

        }

        return arr;
    }

    private void test_1(){
        int[] arr = {1, 2, 3, 4, 5};
        int[] res = reorderOddEven(arr);
        printArr(res,1);
    }

    private void test_2(){
        int [] arr = null;
        int[] res = reorderOddEven(arr);
        if(null == res){
            System.out.println("test_2 is successful");
        }else{
            System.out.println("test_2 is failed");
        }
    }

    private void test_3(){
        int [] arr = {};
        int[] res = reorderOddEven(arr);
        printArr(res,3);

    }

    private void test_4(){
        int [] arr = {1, 1, 1, 1, 1};
        int[] res = reorderOddEven(arr);
        printArr(res,4);
    }

    private void test_5(){
        int [] arr = {1};
        int[] res = reorderOddEven(arr);
        printArr(res,5);
    }

    private void test_6(){
        int [] arr = {1, 3, 5, 2, 4, 6};
        int[] res = reorderOddEven(arr);
        printArr(res,6);
    }

    private void test_7(){
        int [] arr = {2, 4, 6, 1, 3, 5};
        int[] res = reorderOddEven(arr);
        printArr(res,7);
    }


    private void printArr(int[] arr,int i){
        if(null == arr){
            System.out.println("test_" + i + " is failed");
        }

        System.out.print("test_:"+ i + " ");
        for(int k = 0; k < arr.length; ++k){
            System.out.print(arr[k]);
        }
        System.out.println();
    }




}
