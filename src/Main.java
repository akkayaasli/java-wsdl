import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
//import concrete.NeroCustomerManager;
import concrete.StacbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BaseCustomerManager customerManager=new NeroCustomerManager();
		Customer asli=new Customer(1,"1997","Asl�","Akkaya","28783690980");
		customerManager.Save(asli);*/
		
		//mernis yaln�zca do�um y�l�na bakar. Hatal� giri� yap�p exception alabiliriz.
		BaseCustomerManager customerManager=new StacbucksCustomerManager(new MernisServiceAdapter());
		Customer asli=new Customer(1,"Akkaya","Asl�",1997,"28783690980");
		customerManager.Save(asli);
		
		
		
		
	}

}
