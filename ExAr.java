import java.util.*;
class ExAr{
	
	public static boolean duplicate(int num,int [] array){
			
		for (int i = 0; i <array.length; i++)
		{
			if (num==array[i])
				{
					return true;
				}
			}return false;
		}
	
	
	public static void main (String args []){
			
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[0];
		
		boolean con = true;
		int number=0;
		
		System.out.print("Enetr number (-1 enter terminate the progaramme)");
		number = input.nextInt();
		
		while (number != -1)
		{
			if (duplicate(number,array))
			{
				System.out.println("duplicate number");
			}else
			{
				int[] tempArr = new int[array.length+1];
				for (int i = 0; i < array.length; i++)
				{
					tempArr[i]=array[i];
				}
				tempArr[tempArr.length-1]=number;
				array=tempArr;
				
				
			}
				System.out.print("Enetr number (-1 enter terminate the progaramme)");
				number = input.nextInt();
			
		}
		System.out.print(Arrays.toString(array));
		
		
	}
}
