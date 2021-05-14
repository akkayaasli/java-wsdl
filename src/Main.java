import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
//import concrete.NeroCustomerManager;
import concrete.StacbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BaseCustomerManager customerManager=new NeroCustomerManager();
		Customer asli=new Customer(1,"1997","Aslý","Akkaya","28783690980");
		customerManager.Save(asli);*/
		
		//mernis yalnýzca doðum yýlýna bakar. Hatalý giriþ yapýp exception alabiliriz.
		BaseCustomerManager customerManager=new StacbucksCustomerManager(new MernisServiceAdapter());
		Customer asli=new Customer(1,"Akkaya","Aslý",1997,"28783690980");
		customerManager.Save(asli);
		
		
		
		
	}

}
