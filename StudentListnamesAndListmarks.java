   
	import java.util.*;

    public class StudentListnamesAndListmarks {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Number of Students : ");
			int row=sc.nextInt();
			System.out.println("Enter the Number of Subjects : ");
			int column=sc.nextInt();
					
			int marks[][]=new int[row][column];//declaration  
			
			String names[] = new String[row];
			
			String marknames[] = new String[column];
			
			System.out.println("Enter the name of each Student :\n");
			
		    for (int i = 0; i < row; i++)
			{
			        	names[i] = sc.next();
			}
		    
		    System.out.println("Enter the Name of each Subject :\n");
	        
		    for(int j = 0; j < column; j++)
		    {
		    	marknames[j] = sc.next();
		    }
		    
		    for (int i = 0; i < row; i++)
			{
		        
			    for(int j = 0; j < column; j++)
			    {
			    	System.out.println("Enter the mark of "+names[i]+" for "+marknames[j]+" :\n");
		           	marks[i][j] = sc.nextInt();
		           
			    }
			}   
		        // Create and print the matrix
		    
		        System.out.print("Subject \t");
		        for(int j = 0; j < column; j++)
			    {
		        System.out.print(marknames[j]+"\t\t");
			    }
		        
		    for (int i = 0; i < row; i++)
			{
		        	System.out.print("\n"+names[i]);
		        	
			    for(int j = 0; j < column; j++)
			    {
			    	System.out.print("\t\t"+marks[i][j]);
		 	    }
			  
			}  
		    // Print the list of the passing students
		    
		    System.out.println(); 
		    sortRowWise(marks);
		    
		    System.out.println(); 
		    for (int i = 0; i < row; i++)
		    {
		    	if ( marks[i][0] > 4 )
		    	{
		    		System.out.println("The passing students are: "+names[i]+"  ");
		    	}
		    }
		    
		    // Print the list of the students with the highest average
		    
		    System.out.println(); 
		    System.out.println(Arrays.toString(averageRow(marks)));
		    
		 
		    double[] averageList = averageRow(marks);           //obtain the array  
		    
		    System.out.println(); 
		    
		    for (int i = 0; i < averageList.length; i++) //for loop to print the array  
		    {
		    	System.out.print( "The average of the Student "+names[i]+" is "+averageList[i]+ "\n");     
		    	}  
		    
		    double maxValue = averageList[0]; 
		    System.out.println(); 
		    System.out.println("The students with the best average are: ");
		    for(int i=0;i < averageList.length;i++){ 
		      if(averageList[i] >= maxValue){ 
		         maxValue = averageList[i]; 
		         System.out.println((i+1)+". "+names[i]+" with the average "+maxValue);
		      } 
		    } 
		     
		    System.out.println(); 
		    System.out.println("The students with the average higher than 7 are: ");
		    for(int i=0;i < averageList.length;i++){ 
		      if(averageList[i] > 7){ 
		         System.out.println((i+1)+". "+names[i]+" with the average "+averageList[i]);
		      } 
		    } 
		    sc.close();
		  }
		  
		  //Method for getting the average of each row
		public static double[] averageRow(int[][] marks) {

		    double average[] = new double[marks.length];
		    for (int row = 0; row < marks.length; row++) {
		        int rowTotal = 0;
		        for (int column = 0; column < marks[row].length; column++) {
		            rowTotal += marks[row][column];
		        }

		        average[row] = rowTotal / marks[row].length;
		    }
		    
		    return average;

		}
		
		//Method for sorting the elements of each row in a 2D array
		 static int sortRowWise(int marks[][]) 
	     { 
	         // loop for rows of matrix 
	         for (int i = 0; i < marks.length; i++) { 
	   
	             // loop for column of matrix 
	             for (int j = 0; j < marks[i].length; j++) { 
	   
	                 // loop for comparison and swapping 
	                 for (int k = 0; k < marks[i].length - j - 1; k++) { 
	                     if (marks[i][k] > marks[i][k + 1]) { 
	   
	                         // swapping of elements 
	                         int t = marks[i][k]; 
	                         marks[i][k] = marks[i][k + 1]; 
	                         marks[i][k + 1] = t; 
	                     } 
	                 } 
	             } 
	         } 
	   
	         return 0; 
	     } 
		}