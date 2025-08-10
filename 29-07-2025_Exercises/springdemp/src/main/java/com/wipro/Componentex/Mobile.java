package com.wipro.Componentex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Mobile {
	private final Display display;

    @Autowired
    public Mobile(Display display) {
        this.display = display;
    }

    public void showMobileSpecs() {
        System.out.println("Mobile with display size: " + display.getSize() + " inches");
    }

}
