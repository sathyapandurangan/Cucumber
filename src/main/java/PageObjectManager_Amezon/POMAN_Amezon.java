package PageObjectManager_Amezon;

import BaseClass.BaseClass1;
import POM_Amezon.SearchProduct;
import POM_Amezon.SigninPage;

public class POMAN_Amezon extends BaseClass1{
	private SigninPage signin;
	private SearchProduct search;
	
	
	public SigninPage getSignin() {
		
		if(signin==null) {
			signin=new SigninPage(driver);
		}
		return signin;
	}
	public SearchProduct getSearch() {
		
		if(search==null) {
			search=new SearchProduct(driver);
		}
		return search;
	}
	

}
