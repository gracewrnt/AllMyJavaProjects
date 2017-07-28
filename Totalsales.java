import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Totalsales
{

	public static void main(String[] args)
	{
		
		int days;
		double sales;
		double totalSales;
		String input;
		DecimalFormat money=new DecimalFormat("#,##0.00");
		input=JOptionPane.showInputDialog("For how many days "+"do you have sales figure?");
		days=Integer.parseInt(input);
		totalSales=0.0;
		for(int count=1;count<=days;count++)
		{
			input=JOptionPane.showInputDialog("Enter the sales "+"for day "+count+": ");
			sales=Double.parseDouble(input);
			totalSales+=sales;
		}
		JOptionPane.showMessageDialog(null,"The total sales are "+money.format(totalSales));
		System.exit(0);

	}

}
