import java.util.Arrays;
public class Que2{
    public static void main(String[] args){
        int[] SalesPerMonth = { 125000 , 93000 , 80000 , 75000 , 84000 , 110000 , 105000 , 120000 , 90000 , 115000 , 123000 , 150000 };
        int[] QuaterlySales = new int[4];
        int SumOfFirstQuarter=0;
        int SumOfSecondQuarter=0;
        int SumOfThirdQuarter=0;
        int SumOfForthQuarter=0;

        
            System.out.println(" Monthly sales report : "+ Arrays.toString(SalesPerMonth));
        

        for (int i = 0 ; i < SalesPerMonth.length ; i++ ){
            if (  i < 3){
                SumOfFirstQuarter = SumOfFirstQuarter + SalesPerMonth[i];
            }
            else if ( i > 2 && i < 6){
                SumOfSecondQuarter = SumOfSecondQuarter + SalesPerMonth[i];
            }
            else if ( i > 5 && i < 9){
                SumOfThirdQuarter = SumOfThirdQuarter + SalesPerMonth[i];
            }
            else {
                SumOfForthQuarter = SumOfForthQuarter + SalesPerMonth[i];

            }
            
        }

        QuaterlySales[0]= SumOfFirstQuarter;
        QuaterlySales[1]= SumOfSecondQuarter;
        QuaterlySales[2]= SumOfThirdQuarter;
        QuaterlySales[3]= SumOfForthQuarter;

        System.out.println("Quartly report : "+ Arrays.toString(QuaterlySales));
        System.out.println();
        System.out.println(" Yearly sales report : "+ (SumOfFirstQuarter+SumOfSecondQuarter+SumOfThirdQuarter+SumOfForthQuarter));



    }
}
            
        
    

	
	


