package org.crazyit.booksys.action;

import org.crazyit.booksys.domain.User;
import org.crazyit.booksys.service.BookService;
import org.crazyit.booksys.service.UserService;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionSupport;

@Repository
public class RegisterAction extends ActionSupport {


	private UserService userService;
	private User user;
	private String repassword;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String execute() throws Exception {	
		if(!repassword.equals(user.getPassword())){
			System.out.println("diffpassword");
			return "diffpassword";
		}else{
			if(userService.register(user)){
				System.out.println("success");
				return "success";
			}else{
				System.out.println("repeat");
				return "repeat";
			}
		}
	}
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	

}
