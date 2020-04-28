package edu.upv.poo;

import java.util.EventListener;

public interface ToolsListener extends EventListener {
    
    void toolChanged(ToolChangedEvent e);
    
    void colorChanged(ColorChangedEvent e);
    
    void sizeChanged(SizeChangedEvent e);
    
}
