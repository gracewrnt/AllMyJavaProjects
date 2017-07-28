
public class FractalMinusAndMulTest 
{
	public static void main(String[] args) {
	FractalMinusAndMul a,b,c;
	a = new FractalMinusAndMul();
	b = new FractalMinusAndMul();
	
	a.numer = 1;
	a.denom = 2;
	
	b.numer = 1;
	b.denom = 2;
	c = a.sub(b);
	
	System.out.println(c.numer);
	System.out.println(c.denom);
	}
}
