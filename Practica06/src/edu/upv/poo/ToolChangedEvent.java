package edu.upv.poo;

import java.util.EventObject;

public class ToolChangedEvent extends EventObject {
    
    private String toolName;
    
    public ToolChangedEvent(Object source, String toolName) {
        super(source);
        this.toolName = toolName;
    }
    
    public String getToolName() { return toolName; }
    
}
