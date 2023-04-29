package parameterization;

import org.testng.annotations.Test;

public class Dataclass2 
{
	@Test(dataProvider="AcceptData", dataProviderClass=DataProvider2.class)
	public void script(String un, String pwd)
	{
		System.out.println(un+" "+pwd);
	}
}
