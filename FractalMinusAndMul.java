
public class FractalMinusAndMul 
{
	public int numer,denom;
	
	public FractalMinusAndMul sub(FractalMinusAndMul f)
	{
		FractalMinusAndMul result = new FractalMinusAndMul();
		result.denom  = denom * f.denom;
		result.numer= numer * f.denom - f.numer * denom;
		return result;
	}
	
	
	public FractalMinusAndMul mul(FractalMinusAndMul f)
	{
		FractalMinusAndMul result = new FractalMinusAndMul();
		result.denom  = denom * f.denom;
		result.numer= numer * f.numer;
		return result;
	}
	

}
