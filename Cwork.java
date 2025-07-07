import java.util.*;
class Cwork{
	
	
	public static String StudentId[] =  new String[0];
	public static String StudentName[] =  new String[0];
	//public static int StudentMarks[] =  new int[0];
	public static int Std_Progaramming_Marks[] =  new int[0];
	public static int Std_DadaBase_Marks[] =  new int[0];
	
	public static boolean checkId(String Sid,String StudentId[]){
		
		for (int i = 0; i < StudentId.length; i++)
		{
			if (StudentId[i].equals(Sid))
			{
				return true;
			}
		}return false;
		
		
	}
	
	public static boolean addOrNo(char ch){
		
			if (ch == 'n' || ch == 'N')
			{
				return false;
			}
			return true;
		
		}
	
	
	public static void main (String args[]){
		
		
			
		Scanner input = new Scanner(System.in);
		
		boolean con = true;
	
		
		L1:while(con){
		
			
			
			System.out.println("=============================================");	
			System.out.println("WELCOME TO GDSE MARKS MANAGEMENT SYSTEM");	
			System.out.println("=============================================");
		
			System.out.println("[1] Add New Student					[2] Add New Student With Marks");
			System.out.println("[3] Add Marks						[4] Update Student Details");
			System.out.println("[5] Update Marks					[6] Delete Student");
			System.out.println("[7] Print Student Details				[8] Print Student Ranks");
			System.out.println("[9] Best in Progamming Fundamentals			[10] Best in Database Management System");
			System.out.println("[11] Exit");
			
			System.out.print("Enter an option to continue >");
			int option = input.nextInt();
		
		
			switch(option){
			
				case 1:
					boolean stdaddcon = true;
					
					L2:while(stdaddcon){		
							
							System.out.println("hellow1");
							System.out.println("Add New Student");
							System.out.print("Enter Student Id ->");
							String Sid = input.next();
				
							if (checkId(Sid,StudentId)){
								System.out.println("Already Existd");
							}else
							
							{	
								String tempStdId[] =  new String[StudentId.length+1];
								for (int i = 0; i < StudentId.length; i++)
								{
									tempStdId[i] = StudentId[i];
								}
								tempStdId[tempStdId.length-1] = Sid;
								StudentId = tempStdId;
								
								System.out.print("Enter Student Name :");
								String Sname = input.next();
								
								
								String tempStdName[] =  new String[StudentName.length+1];
								for (int i = 0; i < StudentName.length; i++)
								{
									tempStdId[i] = StudentId[i];
								}
								tempStdName[tempStdName.length-1] = Sname;
								StudentName = tempStdName;
								
								
								System.out.println("Successfully input (Do you want to add another Student (Y/N))");
								char chYN = input.next().charAt(0);
								
								if (chYN == 'n' || chYN == 'N')
								{
									continue L1;
								}else if (chYN == 'y' || chYN == 'Y')
								{
									continue L2;
								}
								
								//System.out.println(Arrays.toString(StudentId));
								
							}
							
					}
					
				
				case 2:
					
					boolean conC2 = true;
					
					L3:while (true)
					{
						System.out.println("===== ADD STUDENT WITH MARKS =====");
						
						System.out.print("Enter Student ID :");
						String Sid = input.next();
						
						if (checkId(Sid,StudentId)){
								System.out.println("Already Existd");
							}else
							
							{	
								String tempStdId[] =  new String[StudentId.length+1];
								for (int i = 0; i < StudentId.length; i++)
								{
									tempStdId[i] = StudentId[i];
								}
								tempStdId[tempStdId.length-1] = Sid;
								StudentId = tempStdId;
								
								System.out.print("Enter Student Name :");
								String Sname = input.next();
								
								
								String tempStdName[] =  new String[StudentName.length+1];
								for (int i = 0; i < StudentName.length; i++)
								{
									tempStdId[i] = StudentId[i];
								}
								tempStdName[tempStdName.length-1] = Sname;
								StudentName = tempStdName;
								
								L4:while (true)
								{
									System.out.print("Enter Student Programming Fundemental Marks :");
									int FundementalMarks = input.nextInt();
								
								if (FundementalMarks < 0 || FundementalMarks > 100)
								{
									System.out.println("Invalid Marks please Enter the correct marks");
									continue L4;
								}else
								{
									
								
								int tempFundementalMarks[] =  new int[Std_Progaramming_Marks.length+1];
								for (int i = 0; i < Std_Progaramming_Marks.length; i++)
								{
									tempFundementalMarks[i] = Std_Progaramming_Marks[i];
								}
								tempFundementalMarks[tempFundementalMarks.length-1] = FundementalMarks;
								Std_Progaramming_Marks = tempFundementalMarks;
								
								L5:while (true)
								{
									System.out.print("Enter Student DataBase Management Marks :");
									int DatBaseMarks = input.nextInt();
								
									if (DatBaseMarks < 0 || DatBaseMarks > 100)
									{
										System.out.println("Invalid Marks please Enter the correct marks");
										continue L5;
									}else
									{
									
								
									int tempDataBaseMarks[] =  new int[Std_DadaBase_Marks.length+1];
									for (int i = 0; i < Std_DadaBase_Marks.length; i++)
									{
										tempDataBaseMarks[i] = Std_DadaBase_Marks[i];
									}
									tempDataBaseMarks[tempDataBaseMarks.length-1] = DatBaseMarks;
									Std_DadaBase_Marks = tempDataBaseMarks;
									
									System.out.println("Student has been added Successfully (Do you want to add another Student (Y/N))");
									char chYN = input.next().charAt(0);
								
									if (chYN == 'n' || chYN == 'N')
									{
										continue L1;
									}else if (chYN == 'y' || chYN == 'Y')
									{
										continue L3;
									}
								
	
								
									}
								}	
								
								}
								
								}

								
							}						
						
					}
				case 3:
					
					System.out.println("====== ADD MARKS ======");
					
					L6:while (true)
					{
						int index = 0;
						
						System.out.print("Enter Student Id ->");
						String searchSid = input.next();
						
						for (int i = 0; i < StudentId.length; i++)
						{
							if (StudentId[i].equals(searchSid))
							{
								
								
								/*for (int k = 0; k < StudentName.length; k++)
								{
									if (index == k)
									{
										System.out.println("Student Name :"+StudentName[k]);
									}
								}*/
								
									System.out.println("Student Name :"+StudentName[i]);
									L4:while (true)
									{
										System.out.print("Enter Student Programming Fundemental Marks :");
										int FundementalMarks = input.nextInt();
								
									if (FundementalMarks < 0 || FundementalMarks > 100)
									{
										System.out.println("Invalid Marks please Enter the correct marks");
										continue L4;
									}else
									{
									
								
									int tempFundementalMarks[] =  new int[Std_Progaramming_Marks.length+1];
									for (int K = 0; K < Std_Progaramming_Marks.length; K++)
									{
										tempFundementalMarks[K] = Std_Progaramming_Marks[K];
									}
										tempFundementalMarks[tempFundementalMarks.length-1] = FundementalMarks;
										Std_Progaramming_Marks = tempFundementalMarks;
										
										
									L5:while (true)
								{
									System.out.print("Enter Student DataBase Management Marks :");
									int DatBaseMarks = input.nextInt();
								
									if (DatBaseMarks < 0 || DatBaseMarks > 100)
									{
										System.out.println("Invalid Marks please Enter the correct marks");
										continue L5;
									}else
									{
									
								
									int tempDataBaseMarks[] =  new int[Std_DadaBase_Marks.length+1];
									for (int L = 0; L < Std_DadaBase_Marks.length; L++)
									{
										tempDataBaseMarks[L] = Std_DadaBase_Marks[L];
									}
									tempDataBaseMarks[tempDataBaseMarks.length-1] = DatBaseMarks;
									Std_DadaBase_Marks = tempDataBaseMarks;
									
									System.out.println("Do you want to add another marks for another Student (Y/N)");
									char chYN = input.next().charAt(0);
 								
									if (chYN == 'n' || chYN == 'N')
									{
										continue L1;
									}else if (chYN == 'y' || chYN == 'Y')
									{
										continue L6;
									}
									
								}
								}
								}
							}
								
								
							}else
							{
								System.out.println("Invalid Student Id, Do ypu want to Search Again(Y/N) :");
								char chYN = input.next().charAt(0);
 								
								if (chYN == 'n' || chYN == 'N')
								{
									continue L1;
								}else if (chYN == 'y' || chYN == 'Y')
								{
									continue L6;
								} 
							}
						}
						
						
						
					}
					
					
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
					con = false;
					
			
			
		}
			
			
			
		}
		
		//String addStdArr[][] = new String [2][0];

		
		}
	
	}
