
public class FractalAdd 
{

	public int numerator; //เศษ
	public int denominator; //ส่วน
	

	public FractalAdd add(FractalAdd f)
	{
		FractalAdd result = new FractalAdd();
		result.denominator = denominator * f.denominator;
		result.numerator = numerator * f.denominator + f.numerator * denominator;
		int gcd = GCD(result.denominator,result.numerator);
		result.denominator /= gcd;
		result.numerator /= gcd;
		return result;
	}
	
	public static int GCD(int a, int b)
	{
		if(a>b)
		{
			
		}
		
		else
		{
			int t=a;
			a=b;
			b=t;
		}
		
		while(b>0)
		{
			a=a%b;
			int t=a;
			a=b;
			b=t;
		}
		
		return a;
		
	}
	
	
	
}
