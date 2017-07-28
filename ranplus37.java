
public class ranplus37 
{

	public static void main(String[] args) {
		  int[] num = new int[50];
		  int count=0,swap;
		  for (int i = 0; i < num.length; i++) {
		   num[i] = 0 + (int) (Math.random() * 50);
		   if(num[i]%2==0)
		    count++;
		  }
		  System.out.println("both of which a+b = 37(number 0 to 49)");
		  for (int i = 0; i < num.length; i++)
		   for (int j = i + 1; j < num.length; j++) {
		    if (num[i] + num[j] == 37) {
		     System.out.println("number "+i + ". " + num[i] + "   And    number " + j + ". " + num[j]);
		    }
		    if(num[i]>num[j]){
		     swap=num[i];
		     num[i]=num[j];
		     num[j]=swap;
		    }
		   }
		  for (int i = num.length-1; i>-1; i--) {
		   if(num[i]%2==0){
		   System.out.println("maximum of even is : "+num[i]);
		   System.out.println("total even is : "+count);
		   break;
		   }
		  }
		 }
}
