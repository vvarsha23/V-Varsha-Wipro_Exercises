package com.wipro.Componentex;
import org.springframework.stereotype.Component;
@Component
public class Display {
	private int size = 6;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Display [size=" + size + "]";
    }

}
