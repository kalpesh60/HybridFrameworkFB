package DemoA.HybridFrameworkFacebook;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "dP")
	public static Object[][] getDataFromDataprovider() {
		return new Object[][] { { "kalpesh", "12345" }, { "Krishna", "45678" }, { "Bhupesh", "5678888" } };
	}
}
