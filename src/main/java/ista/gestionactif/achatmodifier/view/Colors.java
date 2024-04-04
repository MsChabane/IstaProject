package ista.gestionactif.achatmodifier.view;

import java.awt.*;
import java.awt.Color;

public class Colors{

    public static Colors instance= new Colors();

    private Color colorText = Color.BLACK;
    private Color Backgroundtext = new Color(237,237,237);
    public Color getColorText() {
        return colorText;
    }

    public Color getBackgroundtext() {
        return Backgroundtext;
    }
}