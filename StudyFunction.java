
public class StudyFunction
{

	public static int max(int [] k)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<k.length;i++)
		{
			if(max<k[i])
			{
				max=k[i];
			}
		}
		return max;
	}
	
}
