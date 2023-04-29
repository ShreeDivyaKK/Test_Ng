package parameterization;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr 
{
	@DataProvider(name="AcceptData")
	public String[][] getData()
		{
			String[][]arr= {{"Divya","Gowda"},{"Swapna","Gowda"}};
			return arr;
		}
@Test(dataProvider = "AcceptData")
public void script(String un, String pwd)
	{
	System.out.println(un+" "+pwd);
	}
}
