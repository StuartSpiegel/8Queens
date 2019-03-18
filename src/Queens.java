
public class Queens {

	public static boolean checker(int[] array, int b) {
        for (int n = 0; n < b; n++) {
            if (array[n] == array[b]){
            	return false;   
            }
            if ((array[n] - array[b]) == (b - n)){
            	return false;   
            }
            if ((array[b] - array[n]) == (b - n)){
            	return false;   
            }
        }
        return true;
    }
	//checks board (columns, horizontal, and diagonals)
	//returns true if queen at array[n] passes tests
	//aka no other queens at array[n-1] or array[0]
	
	
	
	
	public static void printQueens(int[] array) {
        int size = array.length;
        for (int k = 0; k < size; k++) {
            for (int m = 0; m < size; m++) {
                if (array[k] == m){
                	
                	System.out.print("Q");
                }
                
                else  System.out.print("-");
            }
            System.out.println();
        }  
        System.out.println();
    }
//moves through array of integer named array and print "Q" where a Queen checks out, otherwise prints "*" for blank square on board
	
	
	public static void backtrack (int size){
		int[] b = new int[size];
		backtrack(size);	
	}
	
	
	
	public static void backtrack(int[] k, int numQueens){
		
		
		int N = k.length;
		if (numQueens==N){
			
			printQueens(k);
			
			
		}
		else{
			
			for (int m = 0;  m < N ; m++){
				k[numQueens] = m;
				if (checker(k, numQueens)){
					backtrack(k, numQueens +1);
					
					
				}
				
			}	
		}
		}	
	
	
	
	 public static void main(String[] args) {
		
		 int[] k = new int[8];
		 backtrack(k, 1);
			
	    }
	
	
	
	
}




