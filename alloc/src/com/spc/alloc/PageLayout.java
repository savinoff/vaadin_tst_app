package com.spc.alloc;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class PageLayout extends VerticalLayout implements View{

	private static final long serialVersionUID = 1L;

	private HeaderLayout headerLayout;
	private BodyLayout bodyLayout;
	private FooterLayout footerLayout;

	public PageLayout() {
		setMargin(true);
		headerLayout = new HeaderLayout();
		addComponent(headerLayout);
		bodyLayout = new BodyLayout();
		addComponent(bodyLayout);
		footerLayout = new FooterLayout();
		addComponent(footerLayout);
		
		if ((Boolean) UI.getCurrent().getSession().getAttribute("isConnected") == false) {
			UI.getCurrent().getNavigator().navigateTo("login");
		}

	}

	public HeaderLayout getHeaderLayout() {
		return headerLayout;
	}

	public BodyLayout getBodyLayout() {
		return bodyLayout;
	}

	public FooterLayout getFooterLayout() {
		return footerLayout;
	}

	@Override
	public void enter(ViewChangeEvent event) {
		if ((Boolean) UI.getCurrent().getSession().getAttribute("isConnected") == false) {
			UI.getCurrent().getNavigator().navigateTo("login");
		}
		Notification.show("ViewChangeEvent event");
		
	}

}