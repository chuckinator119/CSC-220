class Fraction
{
	private int numerator;
	private int denominator;

	public Fraction()
	{
		numerator = 0;
		denominator = 1;

	}
	public Fraction (int n, int d)
	{
		numerator = n;
		if (d!= 0)
			denominator = d;
		else
			denominator = 1;

	}

	public int getNumerator()
	{
		return numerator;
	}

	public void setNumerator (int val)
	{
		numerator = val;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public void setDenominator(int val)
	{
		if (val !=0)
			denominator = val;
	}
	
	public Fraction add(Fraction f)
	{
		Fraction sum = new Fraction();

		sum.numerator = (numerator * f.denominator) + (denominator * f.numerator);
		sum.denominator = denominator * f.denominator;
		return sum;
	}
	
	private double getReal()
	{
		return(double) numerator / denominator;
	}


	public String toString()
	{
		return numerator + "/" + denominator +"("+ getReal()+")";
	}
}