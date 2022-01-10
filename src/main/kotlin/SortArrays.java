import java.util.Arrays;

public class SortArrays {
    public int solution(int [] a){
        //Sort the arrays in order
        Arrays.sort(a);
        int answer = 0;
        for(int i = 0; i <= a.length; i++){
           try {
               if (a[i] < 0) {
                   answer = 1;
                   break;
               } else if(a[i+1]-a[i] >1){
                   answer = a[i]+1;
                   break;
               } else {
                   answer = a[i] + a.length-1;
               }

           } catch (Exception e){
               System.err.println(e);
           }
        }
        return answer;
    }

    public static void main(String[] args){
        SortArrays sa = new SortArrays();
        int[] a = {1,2,3};
        System.out.println(sa.solution(a));
    }
}
