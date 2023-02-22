package test;

import org.testng.annotations.Test;

public class Test_Accept_InsecureSslCerts extends BaseClass{

	@Test
	public void testSslCertificatesHandlingChrome() 
	{
		setup("chrome", true);
		navigateToUrls();
	}
	
	
	@Test
	public void testSslCertificatesHandlingFirefox() 
	{
		setup("firefox", true);
		navigateToUrls();
	}
	
	@Test
	public void testSslCertificatesHandlingEdge() 
	{
		setup("edge", true);
		navigateToUrls();
	}
	
	@Test
	public void testSslCertificatesHandlingSafari() 
	{
		setup("safari", true);
		navigateToUrls();
	}
}
