package com.spc.alloc;

import com.vaadin.server.ServiceException;
import com.vaadin.ui.TextField;

public class LoginPresenter implements LoginViewHandler{
	private LoginView view;
	private UserService service; 
	
	public LoginPresenter (LoginView view, UserService service) {
		this.service = service;
		this.view = view;
	}
	
	@Override
	public void Login () {
		TextField txtUsername = view.getTxtUsername();
		TextField txtPassword = view.getTxtPassword();
		
		String username = txtUsername.getValue();
		String password = txtPassword.getValue();
		
		try{
			service.login(username, password);
			view.afterSuccessfulLogin();
		} catch (ServiceException e) {
			// TODO: log exception
			// TODO: notify view about error
		}
		
			
	}
		
}
