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
    	
