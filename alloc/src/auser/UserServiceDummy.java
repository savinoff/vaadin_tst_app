package auser;

import com.vaadin.server.ServiceException;
import com.vaadin.ui.UI;


public class UserServiceDummy implements UserService{
	@Override
	public User login (String username, String password) throws ServiceException {
		UI.getCurrent().getSession().setAttribute("isConnected", true);
		return new User (username, password);
	}
}
