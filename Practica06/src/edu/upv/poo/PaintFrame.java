package edu.upv.poo;

import java.awt.*;
import javax.swing.*;

public class PaintFrame extends JFrame
        implements ToolsListener {
    
    private PaintPanel paintPanel =
            new PaintPanel();
    
    public PaintFrame() {
        super("My Paint App");
        add(paintPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
    }
    
    public PaintPanel getPaintPanel() {
        return paintPanel;
    }

    @Override
    public void toolChanged(ToolChangedEvent e) {
        System.out.println(
                "PaintFrame > tool changed to " +
                e.getToolName());
    }

    @Override
    public void colorChanged(ColorChangedEvent e) {
        System.out.println(
                "Paint Frame > color chanted to " +
                e.getColorName());
    }
    
    @Override
    public void sizeChanged(SizeChangedEvent e) {
        System.out.println(
                "Paint Frame > size changed to " +
                e.getSize());
    }
    
}
