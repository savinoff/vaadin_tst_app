package com.spc.alloc;

import com.vaadin.server.ServiceException;
import com.spc.alloc.User;

public class UserServiceDummy implements UserService{
	@Override
	public User login (String username, String password) throws ServiceException {
		return new User (username, password);
	}
}
