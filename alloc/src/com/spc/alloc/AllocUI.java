package com.spc.alloc;

import auser.LoginPresenter;
import auser.LoginView;
import auser.LoginViewImpl;
import auser.UserServiceDummy;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("alloc")
public class AllocUI extends UI {
	private PageLayout pageLayout;
	private Navigator navigator;

	@Override
	protected void init(VaadinRequest request) {
		
		UI.getCurrent().getSession().setAttribute("isConnected", false);
		getPage().setTitle("Vaadin alloc interface");
		navigator = new Navigator(this, this);
		LoginView loginView = new LoginViewImpl();
		LoginPresenter loginPresenter = new LoginPresenter(loginView, new UserServiceDummy());
		loginView.setHandler(loginPresenter);
		loginView.init();
		navigator.addView("login", loginView);
		
		
		pageLayout = new PageLayout();
		navigator.addView("", pageLayout);
		//setContent(pageLayout);
		
		setNavigator(navigator);
		
		if ((Boolean) UI.getCurrent().getSession().getAttribute("isConnected") == false) {
			navigator.navigateTo("login");
		} else {
			navigator.navigateTo("");
		}
		
	}

	public PageLayout getPageLayout() {
		return pageLayout;
	}

	public static AllocUI getCurrent() {
		return (AllocUI) UI.getCurrent();
	}
	
	public Navigator getNavigator() {
		return navigator;
	}

}
