
public class FractalAddTest
{

	public static void main(String[] args) 
	{
		FractalAdd a = new FractalAdd();
		a.numerator = 1;
		a.denominator = 2;

		FractalAdd b = new FractalAdd();
		b.numerator = 1;
		b.denominator = 2;
		
		FractalAdd c = a.add(b);
		System.out.println(c.numerator + "/" + c.denominator);
	
		System.out.println(FractalAdd.GCD(16, 24));
	
	}

}
