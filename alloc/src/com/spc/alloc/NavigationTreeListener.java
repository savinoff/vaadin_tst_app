package com.spc.alloc;

import com.vaadin.event.ItemClickEvent;

public class NavigationTreeListener implements ItemClickEvent.ItemClickListener {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void itemClick(ItemClickEvent event){
		Object value = event.getItemId();
		AllocUI current = AllocUI.getCurrent();
		ContentLayout contentLayout = current.getPageLayout().getBodyLayout().getContentLayout();
		contentLayout.removeAllComponents();
		
		if (NavigationTree.REPORTS_LABEL.equals(value)) {
			ReportsLayout layout = new ReportsLayout();
			contentLayout.addComponent(layout);
		} else if (NavigationTree.MY_REPORTS_LABEL.equals(value)) {
			MyReportsLayout layout = new MyReportsLayout();
			contentLayout.addComponent(layout);
		}
	}

}
