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
		acceptableError = error;
		lastGuess = initialGuess;
		guess = initialGuess / 2;
				
				
		errorPercent = (Math.abs((num - (lastGuess*lastGuess))) / (2*lastGuess));
		
		//System.out.println(errorPercent);
		//System.out.println(acceptableError);
		
		if(errorPercent >= acceptableError)
		{

			double newGuess = .5 * (lastGuess + (num / lastGuess));
		
			return squareRoot(num, newGuess, error);
		}
		
		return lastGuess;
	}
	
	
	
	public static void main(String args[])
	{
		System.out.println(squareRoot(16, 6, .01));
	}
}
