package bab;

public class SquareRootMethod {
	
	
	private static double errorPercent;
	private static double guess;
	private static double acceptableError = (((numThatIsSquared - guess) / numThatIsSquared)*100);
	private static double lastGuess = guess;
	
	public SquareRootMethod()
	{
		
	}
	
	public static double squareRoot(double num, double error)
	{
		lastGuess = num;
		errorPercent = error;
		guess = numThatIsSquared / 2;
		
		acceptableError = (((lastGuess - guess) / lastGuess)*100);
	
		
		if(errorPercent >= acceptableError)
		{
			return lastGuess;
		}
		double newGuess = .5 * (guess + (num / guess));
		lastGuess = guess;
		return squareRoot(newGuess, errorPercent);
		
	}
	
	
	
	public static void main(String args[])
	{
		System.out.println(squareRoot(16, 1));
	}
}
