package bab;

public class SquareRootMethod {
	
	private double numThatIsSquared;
	private double errorPercent;
	private double guess = numThatIsSquared / 2;
	private double lastGuess = guess;
	
	
	
	public SquareRootMethod(double num, double error)
	{
		numThatIsSquared = num;
		errorPercent = error;
		
	}
	public double squareRoot()
	{
		errorPercent = ((lastGuess - guess) / lastGuess);
		
	}
	
	public double getNumSquared()
	{
		return numThatIsSquared;
	}
	
	public double getErrorPct()
	{
		return errorPercent;
	}
	
	
	
	public static void main(String args[])
	{
		
	}
}
