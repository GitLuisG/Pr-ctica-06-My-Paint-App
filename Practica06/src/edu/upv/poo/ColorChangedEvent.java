package edu.upv.poo;

import java.awt.Color;
import java.util.EventObject;

public class ColorChangedEvent extends EventObject {
    
    private Color color;
    private String colorName;
    
    public ColorChangedEvent(
            Object source, Color color, String colorName) {
        super(source);
        this.color = color;
        this.colorName = colorName;
    }
    
    public Color getColor() { return color; }

    public String getColorName() { return colorName; }
    
}
