package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing
{
	@Parameters({"username","password"})
	@Test
	public void script(String ur, String pwd)
	{
		System.out.println(ur+" "+pwd);
	}
}
