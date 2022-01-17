package DemoA.HybridFrameworkFacebook;

import org.testng.annotations.Test;

public class ExecutionScript {
	@Test(dataProvider = "dP", dataProviderClass = DataProviderClass.class)
	public void Fb(String firstname, String password) throws Exception {
		// Declaring the path of the Excel file with the name of the Excel file
		String excelPath = "C:\\Users\\kalpe\\eclipse-workspace\\KeywordDrivenFB\\Facebook.xlsx";

		// Here we are passing the Excel path and SheetName as arguments to connect with
		// Excel file
		ReadExcelData.setExcelFile(excelPath, "KeySheet");

		// We will be looping over Row and 4th Column
		for (int iRow = 0; iRow <= 6; iRow++) {

			String sActions = ReadExcelData.getCellData(iRow, 4);

			// Comparing the value of Excel cell with all the keywords in the "Actions"
			// class
			if (sActions.equals("openBrowser")) {
				ActionMethods.openBrowser();
			}

			else if (sActions.equals("navigateToURL")) {
				ActionMethods.navigate();
			}

			else if (sActions.equals("enterEmail")) {
				ActionMethods.input_Username(firstname);
			}

			else if (sActions.equals("enterPassword")) {
				ActionMethods.input_Password(password);
			}

			else if (sActions.equals("login")) {
				ActionMethods.click_Login();
			}

			else if (sActions.equals("closeBrowser")) {
				ActionMethods.closeBrowser();
			}
		}
	}

}
