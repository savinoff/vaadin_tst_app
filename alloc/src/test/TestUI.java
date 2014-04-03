package test;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

public class TestUI extends UI {

	private static final long serialVersionUID = -8893553410641968314L;
	protected Label label;
	
	@Override
	protected void init(VaadinRequest request) {
		label = new Label("Testos");
		setContent(label);
	}


}
