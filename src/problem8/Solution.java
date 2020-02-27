package problem8;

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


    private int getMinFromArr(int[] arr){
        if(arr == null){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid = start;
        while(arr[start] >= arr[end]){
            mid = (end + start) >> 1;
            if(end - start == 1){
                mid = end;
                break;
            }

            //当start，mid， end三个相等的时候则无法确认结果
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                return midInOrder(arr, start, end);
            }

            if(arr[start] <= arr[mid]){
                start = mid;
            }else{
                end = mid;
            }
        }

        return arr[mid];
    }

    private int midInOrder(int[] arr, int start, int end){
        int result = arr[start];
        for(int i = start + 1; i <= end; ++i){
            if(result > arr[i]){
                result = arr[i];
            }
        }
        return result;
    }

    private void test_1(){
        int[] arr = {3, 4, 5, 1, 2};
        int res = getMinFromArr(arr);
        System.out.println("test_1: " + res);
    }

    private void test_2(){
        int[] arr = null;
        int res = getMinFromArr(arr);
        System.out.println("test_2: " + res);
    }

    private void test_3(){
        int[] arr = {1, 1, 1, 1, 1, 1};
        int res = getMinFromArr(arr);
        System.out.println("test_3: " + res);
    }

    private void test_4(){
        int[] arr = {1, 2, 3, 4, 5};
        int res = getMinFromArr(arr);
        System.out.println("test_4: " + res);
    }

    private void test_5(){
        int[] arr = {1, 1, 1, 0, 1};
        int res = getMinFromArr(arr);
        System.out.println("test_5: " + res);
    }

    private void test_6(){
        int[] arr = {1, 0, 1, 1, 1};
        int res = getMinFromArr(arr);
        System.out.println("test_6: " + res);
    }
}
