package auser;


import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window;

public class LoginViewImpl extends VerticalLayout implements LoginView{

	private static final long serialVersionUID = 1L;
	private LoginViewHandler handler;
	private TextField txtUsername;
	private TextField txtPassword;

	
	private Window subWindow;
	
	private Button btnLogin;
	
	@Override
	public void setHandler(LoginViewHandler handler) {
		this.handler = handler;
	}
	
	@Override
	public void init(){
		subWindow = new Window("Авторизация");
		txtUsername = new TextField("Имя пользователя"); 
		// TODO: Достать, если есть из сессии имя пользователя
		txtUsername.setValue((String) UI.getCurrent().getSession().getAttribute("Username"));
		txtPassword = new TextField("Пароль");
		
		FormLayout subWindowLayout = new FormLayout();
		subWindowLayout.addComponent(txtUsername);
		subWindowLayout.addComponent(txtPassword);
		subWindow.setContent(subWindowLayout);
		
		btnLogin = new Button("Login");
		subWindowLayout.addComponent(btnLogin);
		btnLogin.addClickListener(new Button.ClickListener() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				// TODO: Записать в сессию имя пользователя
				UI.getCurrent().getSession().setAttribute("Username", txtUsername.getValue());
				subWindow.close();
				handler.login();
			}
		});
		
		subWindow.center();
		//subWindow.setClosable(false);
		subWindow.setDraggable(false);
		subWindow.setResizable(false);
		subWindow.setHeight("150px");
		subWindow.setWidth("350px");
		UI.getCurrent().addWindow(subWindow);
		
		
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
		if ((Boolean) UI.getCurrent().getSession().getAttribute("isConnected") == false) {
			init();
		}
		UI.getCurrent().getSession().setAttribute("isConnected", true);
	}
	@Override
	public Button getBtnLogin () {
		return btnLogin;
	}
	@Override
	public void afterSuccessfulLogin () {
		UI.getCurrent().getNavigator().navigateTo("");
	}
	
	
	

}
