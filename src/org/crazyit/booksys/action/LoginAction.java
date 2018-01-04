package org.crazyit.booksys.action;

import java.util.Map;

import org.crazyit.booksys.domain.User;
import org.crazyit.booksys.service.UserService;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


@Repository
public class LoginAction extends ActionSupport {
	private UserService userService;
	private User user;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception {
		User thisUser=userService.login(user.getName(), user.getPassword());
		if(thisUser==null){
			return "failure";
		}
		ActionContext.getContext().getSession().put("user", thisUser);
		if(thisUser.getCategory().equals("A")){
			return "adminsuccess";
		}else{
			return "usersuccess";
		}
		
	}
}
