package auser;

import com.vaadin.server.ServiceException;

public class UserServiceDummy implements UserService{
	@Override
	public User login (String username, String password) throws ServiceException {
		return new User (username, password);
	}
}
