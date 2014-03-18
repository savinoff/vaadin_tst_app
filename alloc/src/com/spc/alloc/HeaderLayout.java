package com.spc.alloc;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class HeaderLayout extends HorizontalLayout{
	private static final long serialVersionUID = 1L;

	public HeaderLayout() {
		Label label = new Label("User: Vasya Pupkin");
		addComponent(label);
	}

}