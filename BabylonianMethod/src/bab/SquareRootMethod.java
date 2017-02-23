package bab;

public class SquareRootMethod {
	
	private static double numThatIsSquared;
	private static double errorPercent;
	private static double guess = numThatIsSquared / 2;
	private static double lastGuess = guess;
	
	
	
	public SquareRootMethod()
	{
		
	}
	
	public static double squareRoot(double num, double error)
	{
		numThatIsSquared = num;
		errorPercent = error;
		
		double acceptableError = (((lastGuess - guess) / lastGuess)*100);
		
		if(errorPercent <= acceptableError)
		{
			return guess;
		}
		
		
	}
	
	public static double getNumSquared()
	{
		return numThatIsSquared;
	}
	
	
	public static void main(String args[])
	{
		squareRoot(4, 0);
	}
}
