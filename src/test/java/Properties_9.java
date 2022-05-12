import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Properties_9 {
	public static int power(int A,int B)
	{
		if(B==(A*A))		
			return 1;
		else
			return 0;
	}
	public static void main(String s[])
	{
		try
		{
		FileInputStream in = new FileInputStream("C:\\Users\\momonisha\\eclipse-workspace\\Assignment__3\\src\\test\\java\\update.properties");
		Properties props = new Properties();
		props.load(in);
		in.close();

		
		FileOutputStream out = new FileOutputStream("C:\\Users\\momonisha\\eclipse-workspace\\Assignment__3\\src\\test\\java\\update.properties");
		String ans;
		int x=Integer.parseInt(props.getProperty("2"));
		if(power(2,x)==0)
		{
			ans="4";
			props.setProperty("2",ans);
		}
		x=Integer.parseInt(props.getProperty("3"));
		if(power(3,x)==0)
		{
			ans="9";
			props.setProperty("3",ans);
		}
		x=Integer.parseInt(props.getProperty("5"));
		if(power(5,x)==0)
		{
			ans="25";
			props.setProperty("5",ans);
		}
		x=Integer.parseInt(props.getProperty("6"));
		if(power(6,x)==0)
		{
			ans="36";
			props.setProperty("6",ans);
		}
		x=Integer.parseInt(props.getProperty("7"));
		if(power(7,x)==0)
		{
			ans="49";
			props.setProperty("7",ans);
		}		

		props.store(out, null);
		out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.print("Completed");
	}

}
