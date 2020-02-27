package problem4;

public class Solution {

    public static void main(String[] args){
        Solution s = new Solution();
        s.test_1();
        s.test_2();
        s.test_3();
    }

    private String replaceSpace(String s){
        //空字符串处理
        if(s == null){
            return "";
        }
        int l = s.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        char c;
        while(i < l){
            c = s.charAt(i);
            if(' ' == c){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }



    private void test_1(){
        String s = "We are happy.";
        String ans = replaceSpace(s);
        System.out.println("test_1 : " + ans);
    }

    private void test_2(){
        String s = "";
        String ans = replaceSpace(s);
        System.out.println("test_2 : " + ans);
    }

    private void test_3(){
        String s = null;
        String ans = replaceSpace(s);
        System.out.println("test_3 : " + ans);
    }

    private void test_4(){
        String s = "a    b";
        String ans = replaceSpace(s);
        System.out.println("test_3 : " + ans);
    }
}
