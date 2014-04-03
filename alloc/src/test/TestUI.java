package test;


import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;

public class TestUI extends UI {

	private static final long serialVersionUID = -8893553410641968314L;
	protected Label label;
	
	@Override
	protected void init(VaadinRequest request) {
		label = new Label("Testos");
		//setContent(label);
		
		JPAContainer<Person> persons = JPAContainerFactory.make(Person.class, "addressbook");
		Person p1 = new Person();
		p1.setFirstName("First NAme");
		persons.addEntity(p1);
		Table personsTable = new Table("Table of persons");
		setContent(personsTable);

		
	}


}
