package Ass5;

public class Q6 {

	static int count=0;

	public static void main(String[] args) {
		int brr[] = {1,2,0,3,4,5,6,0,-1,1,-2,-3,-4,-5,0};
        for(int i=0; i<brr.length; i++){/*NOTE: Cannot use i<=brr.length when i=0
because then i ranges from 0 to 15(0 1 2 3 4 5 6 7 8 9 10 11 12  13 14 15) for a total of 
16 indexes because brr.length=15, which becomes out of bounds in nthe continue statement. Hence either
i=0; i<brr.length OR i=1; i<=brr.length. The point here is that length of i should be equal to the length 
of brr[]. Hence is mistrake repeated will return "java.lang.ArrayIndexOutOfBoundsException" Error*/
        	if(brr[i]>=0)
        		count++;//Notice this statement here. understand the significance
        	else if(brr[i]==-1)
        		break; //According to question
        	
        	//Count No. of positive elements in array within negative elements
        	/*else if(brr[i]<0)
        		continue;*/
            }//for loop close
        	System.out.println("total no. of elements until -1 encountered is " + count);
        
        	//System.out.println("No. of positive elements in array within negative elements " + count);
        	
        	
        	
        	int pos_count=0;
        	int zero_count=0;
            int neg_count=0;  
           
            //int brr[] = {1,2,0,3,4,5,6,0,-1,1,-2,-3,-4,-5,0};  
            
    for(int i=0; i<brr.length; i++){
   
    if(brr[i]/1>0)
    	pos_count++;
    else if(brr[i]/1==0)  //Note zero(0) is neither a positive integer nor a negative integer.
    	zero_count++;
    else if(brr[i]/1<0)//
        neg_count++;
    //Here we cannot use "else" statement at the end of "if else" ladder
     //Since there is no embedded condition(brr[i]==0). NOTE: Else statement works 
     //only for comment statements and NO embedded condition statements. In case of
     //embedded condition statements, close the ladder with "else if" conditional operator.
    	 
    
            }//for loop close
            System.out.println("Positive Integers= " + pos_count + " Negative Integers= " + neg_count + " Zero(0) Integers= " + zero_count);
        }//main close
}
