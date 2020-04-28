package edu.upv.poo;

public class Practica06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Practica06().run();
    }
    
    private final PaintFrame paintFrame =
            new PaintFrame();
    private final ToolsFrame toolsFrame =
            new ToolsFrame();
    
    public void run() {
        toolsFrame.addToolsListener(paintFrame);
        toolsFrame.addToolsListener(paintFrame.getPaintPanel());
        paintFrame.setVisible(true);
        toolsFrame.setVisible(true);
    }
    
    /*
     * TODO:
     * - Implementar funcionalidad de "Line".
     * - Implementar funcionalidad de "Rectangle".
     * - Implementar funcionalidad de "Circle".
     * - Implementar funcionalidad de "Eraser" *
    
    
     * Libro Java como programar (resumenes final cap):
     * - cap 3, cap 8, cap 9, cap 10
     * - patron de diseño: estrategía, observer.
     */
    
}
