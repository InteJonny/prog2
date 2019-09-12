import java.util.ArrayList;
import java.util.Scanner;
public class uppgift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					ArrayList<Integer> minaTal = new ArrayList<Integer>();
					minaTal.add(2);
					minaTal.add(1);
					minaTal.add(2);
					minaTal.add(2);
					minaTal.add(2);
					minaTal.add(2);
					
					System.out.println(getSumOfArray(minaTal));
				}
	
	private static Integer getSumOfArray(ArrayList<Integer> tal)
	{
		Integer sum = 0;
		
		for(Integer i : tal)
			sum += i;
		
		return sum;
	}
}

