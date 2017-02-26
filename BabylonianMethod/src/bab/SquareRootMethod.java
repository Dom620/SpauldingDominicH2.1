package bab;

public class SquareRootMethod {
	
	private static double numThatIsSquared;
	private static double errorPercent;
	private static double guess;
	private static double acceptableError = (((numThatIsSquared - guess) / numThatIsSquared)*100);
	
	public SquareRootMethod()
	{
		
	}
	
	public static double squareRoot(double num, double error)
	{
		numThatIsSquared = num;
		errorPercent = error;
		guess = numThatIsSquared / 2;
	
		acceptableError = (((num - guess) / num)*100);
	
		
		if(errorPercent >= acceptableError)
		{
			return numThatIsSquared;
		}
		double newGuess = .5 * (guess + (num / guess));
		return squareRoot(newGuess, errorPercent);
		
	}
	
	public static double getNumSquared()
	{
		return numThatIsSquared;
	}
	
	
	public static void main(String args[])
	{
		System.out.println(squareRoot(16, 1));
	}
}
