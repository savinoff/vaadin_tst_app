package com.spc.alloc;

import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class ReportsLayout extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public ReportsLayout() {
        Label lbl = new Label("Reports");
        addComponent(lbl);
    }
}