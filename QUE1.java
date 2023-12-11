import java.util.Scanner;



public class QUE1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
      //  int position = 0;

        for (int position = 1; position <= profits.length; position++) {
            if (profits[position-1] > profits[position]){
                System.out.println(position+2001);
                break;

            }
        }  
            
        
    }
}
