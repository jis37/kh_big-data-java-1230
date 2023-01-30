package 연습;

public class Ex4 {
    public static void main(String[] args) {
        int n1 = 5;
        int[] n2 = {3,4,1,5,2,6,5,8,1,7};
        for(int i = 0; i< n2.length; i++){
            if(n2[i] < n1) System.out.print(i + " ");
        }
    }
}
