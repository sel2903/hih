/**
 * This is a class for Caterpillar<p>
 * 1)moves made<p>
 * 2)Cabbages eaten
 * @author salina_223
 *@version 1.0
 */
public class Caterpillar_223 {
	int moves, cabbages;
	/**
	 * the constructor method to initialize the<br>
	 * the number of moves mad and number of cabbages eaten
	 *  
	 * @param moves-number of moves made
	 * @param cabbages- number of cabbages eaten
	 */
	Caterpillar_223(int moves, int cabbages)
	{
		this.moves=moves;
		this.cabbages=cabbages;
	}
	/**
	 * this is a method to get the number of moves made by the caterpillar
	 * 
	 * @return- returns the number of moves made
	 */
	int get_moves()
	{
		return moves;
	}
	/**
	 * method to show the moves made by the caterpillar,<P>
	 * increments the current of moves made value  by 1
	 */
	void moves()
	{
		moves++;
	}
	/**
	 * method to show the more cabbages eaten<p.
	 * increments the current value of cabbages eaten by 1
	 */
    void eat()
    {
    	cabbages++;
    	
    }
    /**
     * displays the caterpillars information
     * 1)displays the total number of cabbages eaten 
     * 2)displays the total number of moves made by the caterpillar
     */
    void display_info()
    {
    	System.out.println("Cabbages eaten is: "+cabbages);
    	System.out.println("Moves made is: "+moves);
    }
    /**
     * Doesnt contain any argument
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
