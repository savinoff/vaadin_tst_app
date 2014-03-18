package com.spc.alloc;

import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class MyReportsLayout extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public MyReportsLayout() {
        Label lbl = new Label("MyReports");
        addComponent(lbl);
    }
}
