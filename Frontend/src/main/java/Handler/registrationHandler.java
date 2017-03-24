package Handler;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.niit.frontend.controller.*;
@Component
public class registrationHandler {
	
	
		public UserDetails initFlow(){
			return new UserDetails();
		}
		


		public String validateDetails(UserDetails user,MessageContext messageContext){
			String status = "success";
			if(user.getName().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"name").defaultText("Name cannot be Empty").build());
				status = "failure";
				System.out.println("name pass");
			}
			if(user.getId().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"id").defaultText("UserId cannot be Empty").build());
				status = "failure";
				System.out.println("userid pass");
			}
			if(user.getPassword().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"password").defaultText("Password cannot be Empty").build());
				status = "failure";
				System.out.println("password pass");
			}
			if(user.getCpassword().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"cpassword").defaultText("Confirmed Password cannot be Empty").build());
				status = "failure";
				System.out.println("cpassword pass");
			}
			if(!user.getCpassword().equals(user.getPassword())){
				messageContext.addMessage(new MessageBuilder().error().source(
						"cpassword").defaultText("Passwords do not match").build());
				status = "failure";
				System.out.println("check password pass");
			}
			
				if(user.getEmailid().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"emailid").defaultText("Email cannot be Empty").build());
				status = "failure";
				System.out.println("emailid pass");
			}
			if(user.getContact().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"contact").defaultText("Mobile No. cannot be Empty").build());
				status = "failure";
				System.out.println("contact pass");
			}
			if(user.getAddress().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"address").defaultText("Address cannot be Empty").build());
				status = "failure";
				System.out.println("address pass");
			}
			
			return status;
		}
	}


