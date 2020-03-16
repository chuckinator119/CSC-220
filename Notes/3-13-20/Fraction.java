// defines a fraction
class Fraction
{
	private int num;
	private int den;

	// by default, a fraction is 0/1
	public Fraction()
	{
		this.num = 0;
		this.den = 1;
	}

	// provide a way to create a user-defined fraction
	public Fraction(int num, int den)
	{
		this.num = num;
		// make sure not to set the denominator to 0 if specified
		if (den == 0)
			den = 1;
		this.den = den;

		this.reduce();
	}

	// getter for the numerator
	public int getNum()
	{
		return this.num;
	}

	// setter for the numerator
	public void setNum(int val)
	{
		this.num = val;
	}
	
	// getter for the denominator
	public int getDen()
	{
		return this.den;
	}

	// setter for the denominator
	public void setDen(int val)
	{
		// ignore if the specified denominator is 0
		if (val != 0)
			this.den = val;
	}

	// returns a fraction's numeric representation
	private double getReal()
	{
		return (double)this.num / this.den;
	}

	// calculates and returns the sum of two fractions
	public Fraction add(Fraction other)
	{
		int num = (this.num * other.den) + (other.num * this.den);
		int den = this.den * other.den;
		Fraction sum = new Fraction(num, den);

		sum.reduce();

		return sum;
	}

	// calculates and returns the difference of two fractions
	public Fraction sub(Fraction other)
	{
		Fraction neg_other = new Fraction(other.num * -1, other.den);
		Fraction diff = this.add(neg_other);

		return diff;
	}

	// calculates and returns the product of two fractions
	public Fraction mul(Fraction other)
	{
		int num = this.num * other.num;
		int den = this.den * other.den;
		Fraction prod = new Fraction(num, den);

		prod.reduce();

		return prod;
	}

	// calculates and returns the division of two fractions
	public Fraction div(Fraction other)
	{
		Fraction recip = new Fraction(other.den, other.num);
		Fraction div = this.mul(recip);

		return div;
	}

	// reduces a fraction
	private void reduce()
	{
		// we initially assume that the GCD is 1
		// from there, we iterate starting at 2 through the smaller of the numerator or denominator
		// each time, we try to find a value that evenly divides both the numerator and denominator
		// as we find such a value, we update the GCD
		// the final step is two divide the numerator and denominator by the GCD to reduce the fraction
		// as cleanup, if the numerator is 0 (i.e., the fraction is 0) then set the denominator to 1
		int gcd = 1;
		int min = this.num;	// assume the smaller is the numerator

		// check if the denominator is smaller
		if (this.den < this.num)
			min = this.den;

		// find common divisors
		for (int i=2; i<=min; i++)
		{
			if (this.num % i == 0 && this.den % i == 0)
				gcd = i;
		}

		// divide the numerator and denominator by the GCD
		this.num /= gcd;
		this.den /= gcd;

		// if the numerator is 0, set the denominator to 1
		if (this.num == 0)
			this.den = 1;
	}

	// returns a fraction's string representation
	public String toString()
	{
		return this.num + "/" + this.den + " (" + this.getReal() + ")";
	}

	// main program
	public static void main(String[] args)
	{
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(5, 8);
		Fraction f3 = new Fraction(3, 4);
		Fraction f4 = new Fraction(1, 0);

		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
		System.out.println("f3: " + f3);
		System.out.println("f4: " + f4);

		f3.setNum(5);
		f3.setDen(8);
		f1 = f2.add(f3);
		f4.setDen(88);
		f2 = f1.sub(f1);
		f3 = f1.mul(f1);
		f4 = f4.div(f3);

		System.out.println();
		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
		System.out.println("f3: " + f3);
		System.out.println("f4: " + f4);
	}
}
