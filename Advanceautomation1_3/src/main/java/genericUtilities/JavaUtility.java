package genericUtilities;

import java.util.Random;

public class JavaUtility {
	/**
	 * it is used to generate random number
	 * @param range
	 * @return
	 */
	public int getRandomNumber(int range) {
		Random r=new Random();
		
		return (r.nextInt(range));
	}

}
