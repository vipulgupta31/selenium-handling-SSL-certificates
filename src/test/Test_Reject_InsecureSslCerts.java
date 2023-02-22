package test;

import org.testng.annotations.Test;

public class Test_Reject_InsecureSslCerts extends BaseClass{

	@Test
	public void testSslCertificatesHandlingChrome() 
	{
		setup("chrome", false);
		navigateToUrls();
	}
	
	
	@Test
	public void testSslCertificatesHandlingFirefox() 
	{
		setup("firefox", false);
		navigateToUrls();
	}
	
	@Test
	public void testSslCertificatesHandlingEdge() 
	{
		setup("edge", false);
		navigateToUrls();
	}
	
	@Test
	public void testSslCertificatesHandlingSafari() 
	{
		setup("safari", false);
		navigateToUrls();
	}
}
