package in.naveenit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		
		Address add = new Address();
		add.setCity("khammam");
		add.setState(" telangana");
		add.setCountry("India");
		
		
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("naveen");
		c.setEmail("naveen@123");
		c.setPhno(1235728);
		 
		  ObjectMapper mapper =  new  ObjectMapper();
		 mapper.writeValue(new File("customer.jason"),c);
		System.out.println(" jason file Created");

	}

}
