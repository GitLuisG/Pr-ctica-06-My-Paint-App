package edu.upv.poo;

import java.util.EventObject;

public class SizeChangedEvent extends EventObject {
    
    private int size;
    
    public SizeChangedEvent(Object source, int size) {
        super(source);
        this.size = size;
    }
    
    public int getSize() { return size; }
    
}
