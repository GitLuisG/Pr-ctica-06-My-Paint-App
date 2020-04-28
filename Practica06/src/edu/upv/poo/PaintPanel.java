package edu.upv.poo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class PaintPanel extends JPanel
        implements ToolsListener, MouseListener, MouseMotionListener {
    
    private final ArrayList<Point> points = 
            new ArrayList<>();
    private final ArrayList<Color> pointsColors =
            new ArrayList<>();
    private final ArrayList<Integer> pointsSize =
            new ArrayList<>();
    private Color color = Color.BLACK;
    private String tool = "Pencil";
    private int pointSize = 5;
    
    public PaintPanel() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.WHITE);
    }
    
    private void drawPoints(Graphics2D g) {
        for (int i = 0; i < points.size(); i++) {
            Point p = points.get(i);
            Color c = pointsColors.get(i);
            int s = pointsSize.get(i);  
            g.setColor(c);
            g.fillOval((int)p.getX(), (int)p.getY(), s, s);
        }
    }
    
    private void drawLines(Graphics2D g) {
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        drawPoints(g2);
        drawLines(g2);
    }

    @Override
    public void toolChanged(ToolChangedEvent e) {
        tool = e.getToolName();
        System.out.println("PaintPanel > tool changed to " + tool);
    }

    @Override
    public void colorChanged(ColorChangedEvent e) {
        color = e.getColor();
        System.out.println(
                "PaintPanel > color changed to " + e.getColorName());
    }
    
    @Override
    public void sizeChanged(SizeChangedEvent e) {
        pointSize = e.getSize();
        System.out.println(
                "PaintPanel > size chaganged to " +
                e.getSize());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (tool.equals("Pencil")) {
            points.add(e.getPoint());
            pointsColors.add(color);
            pointsSize.add(pointSize);
        }
        else if (tool.equals("Line")) {
            
        }
        
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        points.add(e.getPoint());
        pointsColors.add(color);
        pointsSize.add(pointSize);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
}
