import java.util.Arrays;
public class Sorted{

public static void main(String[] args){

int[] numbers = {12,13,45,17,89};
System.out.println(Arrays.toString(sorted(numbers)));
}



public static int[] sorted(int[] numbers){

for(int count = 0; count < numbers.length; count++){

	for(int count1 = 0; count1 < numbers.length; count1++ ){
	
		if(numbers[count] < numbers[count1]){
			
			int temp = numbers[count];
			numbers[count] = numbers[count1];
			numbers[count1] = temp;
			
		}
		
		
    }	
   

}
 return numbers;

}

}
