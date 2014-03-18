package com.spc.alloc;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class FooterLayout extends HorizontalLayout{

	private static final long serialVersionUID = 1L;

	public FooterLayout() {
		Label label = new Label("Created by 7spc. v.0.0.0. 2014");
		addComponent(label);
	}
}