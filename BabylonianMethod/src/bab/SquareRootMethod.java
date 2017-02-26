package bab;

public class SquareRootMethod {
	
	
	private static double errorPercent;
	private static double guess;
	private static double acceptableError;
	private static double lastGuess;
	
	public SquareRootMethod()
	{
		
	}
	
	public static double squareRoot(double num, double initialGuess, double error)
	{
		errorPercent = error;
		lastGuess = initialGuess;
		guess = initialGuess / 2;
				
				
		acceptableError = (((lastGuess - guess) / lastGuess) * 100);
		
		if(errorPercent <= acceptableError)
		{
			double newGuess = .5 * (lastGuess + (num / lastGuess));
			return squareRoot(num, newGuess, acceptableError);
		}
		
		return lastGuess;
	}
	
	
	
	public static void main(String args[])
	{
		System.out.println(squareRoot(16, 6, 20));
	}
}
