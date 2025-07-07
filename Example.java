import java.util.*;
class Example{
	public static boolean search(int key, int[] ar){
		for (int i = 0; i < ar.length; i++){
			if(ar[i]==key){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer (press -1 to terminate the program) : ");
		int num=input.nextInt();
		int[] numArray=new int[0];
		while(num!=-1){
			if(search(num,numArray)){
				System.out.println(num+" is duplicate...");
			}else{
				int[] tempArray=new int[numArray.length+1];
				for (int i = 0; i < numArray.length; i++)	{
					tempArray[i]=numArray[i];
				}
				numArray=tempArray;
				numArray[numArray.length-1]=num;
			}
			System.out.print("Input an integer (press -1 to terminate the program) : ");
			num=input.nextInt();
		}
		System.out.println(Arrays.toString(numArray));
	}
}
