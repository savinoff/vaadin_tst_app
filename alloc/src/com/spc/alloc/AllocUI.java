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


//@SuppressWarnings("serial")
//@Theme("alloc")
//public class AllocUI extends UI {
//
//	@Override
//	protected void init(VaadinRequest request) {
//		final VerticalLayout layout = new VerticalLayout();
//		layout.setMargin(true);
//		setContent(layout);
//
//		Button button = new Button("Click Me");
//		button.addClickListener(new Button.ClickListener() {
//			public void buttonClick(ClickEvent event) {
//				layout.addComponent(new Label("Thank you for clicking"));
//			}
//		});
//		layout.addComponent(button);
//	}
//
//}