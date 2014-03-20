package com.spc.alloc;


import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class LoginViewImpl extends VerticalLayout implements LoginView{

	private static final long serialVersionUID = 1L;
	private LoginViewHandler handler;
	private TextField txtUsername;
	private TextField txtPassword;
	
	private Button btnLogin;
	
	@Override
	public void setHandler(LoginViewHandler handler) {
		this.handler = handler;
	}
	
	@Override
	public void init(){
		txtUsername = new TextField("Username");
		addComponent(txtUsername);
		txtPassword = new TextField("Password");
		addComponent(txtPassword);
		
		btnLogin = new Button("Login");
		addComponent(btnLogin);
		btnLogin.addClickListener(new Button.ClickListener() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				handler.login();
			}
		});
		
	}
	@Override
	public TextField getTxtUsername() {
		return txtUsername;
	}
	@Override
	public TextField getTxtPassword() {
		return txtPassword;
	}
	
	@Override
	public void enter (ViewChangeListener.ViewChangeEvent event) {
		
	}
	@Override
	public Button getBtnLogin () {
		return btnLogin;
	}
	@Override
	public void afterSuccessfulLogin () {
		UI.getCurrent().getNavigator().navigateTo("only-for-signed-in-users");
	}
	
	
	

}
