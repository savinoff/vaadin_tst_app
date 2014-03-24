package com.spc.alloc;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Notification;
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
		Notification.show("ViewChangeEvent event");
		
	}

}