public class StudentMarksManagementSystem {
	public static void main(String[] args) {
		//This is a project on Multidimensional Arrays and Nested Loops
//Create a Java program that stores and displays the marks of students across different subjects using a two-dimensional array.
//The program should represent students as rows and subjects as columns.

		String[][] studentData = {
				{"Student Name", "Programming", "Mathematics", "Computing"},
				{"Kate", "85", "90", "78"},
				{"Charlotte", "72", "88", "91"},
				{"Carlos", "95", "82", "89"},
				{"George", "68", "75", "80"}
		};
		
		System.out.println("======= STUDENT MARKS =======");
		
		for (int i = 0; i < studentData.length; i++) {
			for (int j = 0; j < studentData[i].length; j++) {
				System.out.printf("%-15s", studentData[i][j]);   //This lines it up
			}
			
			//printf() → prints formatted text.
			//%s → means a String.
			//15 → reserves 15 character spaces for that value.
			//- → aligns the text to the left.
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("======= STUDENT RESULTS =======");
		
		// Start from row 1 because row 0 contains the headings
		for (int i = 1; i < studentData.length; i++) {
		
		    int total = 0; // Start a new total for each student
		    
		// Start from row 1 because row 0 contains the headings
			for (int j = 1; j < studentData[i].length; j++) {
				
				//Add the marks together in the inner loop
				total += Integer.parseInt(studentData[i][j]); //This converts the mark from a String into an int, then adds it to total.
			}
			
			//Calculate the average per student 
			double average = total / 3.0;
			
			
			//Display student name and average
			System.out.printf("%s - Average: %.2f%n", studentData[i][0], average);
			//  %s = student name.
			//  %.2f = average to 2 decimal places.
			//  %n = move to the next line.
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("======= HIGHEST MARK =======");

		int highest = 0; // Stores the highest mark found

		for (int i = 1; i < studentData.length; i++) {

		    for (int j = 1; j < studentData[i].length; j++) {

		        int mark = Integer.parseInt(studentData[i][j]);

		        if (mark > highest) {
		            highest = mark;
		        }
		    }
		}

		System.out.println("Highest Mark: " + highest);

		
