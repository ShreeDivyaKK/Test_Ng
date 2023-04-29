package parameterization;

import org.testng.annotations.DataProvider;

public class DataProvider2 
{
	@DataProvider(name="AcceptData")
	public String[][] getData()
	{
		String[][]arr= {{"Divya","Gowda"},{"Swapna","Gowda"}};
		return arr;
	}
}
