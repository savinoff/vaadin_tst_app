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

	@Override
	protected void init(VaadinRequest request) {
		
		Navigator navigator = new Navigator(this, this);
		LoginView loginView = new LoginViewImpl();
		LoginPresenter loginPresenter = new LoginPresenter(loginView, new UserServiceDummy());
		loginView.setHandler(loginPresenter);
		loginView.init();
		navigator.addView("", loginView);
		setNavigator(navigator);
		navigator.navigateTo("");
		
		pageLayout = new PageLayout();
		setContent(pageLayout);
	}

	public PageLayout getPageLayout() {
		return pageLayout;
	}

	public static AllocUI getCurrent() {
		return (AllocUI) UI.getCurrent();
	}

}
