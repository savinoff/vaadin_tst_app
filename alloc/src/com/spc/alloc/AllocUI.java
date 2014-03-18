package com.spc.alloc;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("alloc")
public class AllocUI extends UI {
	private PageLayout pageLayout;

	@Override
	protected void init(VaadinRequest request) {
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
