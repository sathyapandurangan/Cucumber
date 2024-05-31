package PageObjectManager_Vectoria;

import BaseClass.BaseClass1;
import POM_Vectoria.Vectoria_AddCustomer;
import POM_Vectoria.Vectoria_LoginPage;


public class POMAN_Vectoria extends BaseClass1 {
	
	private Vectoria_LoginPage log;
	private Vectoria_AddCustomer add;
	
	
	public Vectoria_LoginPage getLog() {
		if(log==null) {
			log=new Vectoria_LoginPage(driver);
		}
		
		return log;
	}
	
	public Vectoria_AddCustomer getAdd() {
		if(add==null) {
			add=new Vectoria_AddCustomer(driver);
		}
		
		return add;
	}
	
	
	
	

}
