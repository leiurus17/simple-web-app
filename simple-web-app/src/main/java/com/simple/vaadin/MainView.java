package com.simple.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class MainView extends VerticalLayout {
	
	public MainView() {
		VerticalLayout todosList = new VerticalLayout();
		TextField todoField = new TextField();
		Button addButton = new Button("Add");
		
		add(
				new H1("Vaadin Todo"),
				todosList,
				new HorizontalLayout(
						todoField,
						addButton)
				);
	}

}