package com.spc.alloc;

import com.vaadin.ui.HorizontalSplitPanel;

public class BodyLayout extends HorizontalSplitPanel{
	
	private static final long serialVersionUID = 1L;
	
	private NavigationTree navigationTree;
	private ContentLayout contentLayout;
	
	public BodyLayout(){
		setHeight("500px");
		setSplitPosition(300, Unit.PIXELS);
		navigationTree = new NavigationTree();
		setFirstComponent(navigationTree);
		contentLayout = new ContentLayout();
		setSecondComponent(contentLayout);
	}
	
	public ContentLayout getContentLayout() {
		return contentLayout;
		
	}
}
