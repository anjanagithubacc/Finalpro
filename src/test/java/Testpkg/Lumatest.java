package Testpkg;


import java.time.Duration;

import org.testng.annotations.Test;


import Basepkg.Base;
import Cmmon.Common;
import Pagepkg.Lumapag;



public class Lumatest extends Base {
	
@Test
public void mainfn()
{
	
	Lumapag lpage=new Lumapag(d);	
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	lpage.sign();
	lpage.passvalues("anjanaanu.1997@gmail.com", "Anjana@1234");
	lpage.login();
//	String x="D:\\Lumaexcelproject.xlsx";
//	String y="Sheet1";
//	int rc=Common.getRowCount(x, y);
//	for (int i=0;i<=rc;i++)
//
//    {
//		String un=Common.getCellValue(x, y, i, 0);
//		String pwd=Common.getCellValue(x, y, i, 1);
//		lpage.passvalues(un, pwd);
//		lpage.login();
//		lpage.clearvalues();
//    }

	
	lpage.purchase();
	lpage. scrollpage();
	lpage.myordr();
	lpage.scrolluppage();
	lpage.cartbutton();
	lpage.scrollpage();
	lpage.del();
	lpage.scrolluppage();
	lpage.logout();
	
}
}
