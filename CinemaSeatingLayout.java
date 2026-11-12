public class CinemaSeatingLayout {
    public static void main(String[] args) {
       
    	//Create a 2D array
    	char[][] seats = new char[4][5];
    	
    	//Fill the array with O
    	for (int i = 0; i < seats.length; i++) {
    		for (int j = 0; j < seats[i].length; j++) {
    			seats[i][j] = 'O';
    		}
    	}
    	
    	//Change parts of the array 
    	seats [0][2] = 'X';
    	seats [1][4] = 'X';
    	seats [3][1] = 'X';
    	
