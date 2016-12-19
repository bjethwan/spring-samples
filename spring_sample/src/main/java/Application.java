import com.bjethwan.service.CustomerServiceImpl;
import com.bjethwan.service.ICustomerService;


public class Application {
	public static void main(String[] args) {

		ICustomerService customerService = new CustomerServiceImpl();
		
		System.out.println(customerService.findAll().get(0).getFirstName());
		
	}
}
