package folder;


import java.awt.Color; 
import java.awt.Component;  
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.Insets; 
import java.awt.RenderingHints; 
import javax.swing.border.Border; 

/** Cette classe permet d'obtenir des bords arrondis sur un JPanel
 *  Elle modifie seulement les bords et si vous mettez un fond coloré, celui-ci dépassera par-dessous les bords
 *  à moins de gérer l'arrondi du fond.
 */
public class roundBorders implements Border{ 
    
    // Les trois méthodes ci-dessous sont paramétrables selon le résultat escompté.
    

    //Insets des bords 
    public Insets getBorderInsets(Component c) { 
        return new Insets(0, 0, 0, 0);//Paramétrable.
    } 

    //Opacité des bords
    public boolean isBorderOpaque() { 
        return false; //Paramétrable 
    } 

    //Couleur et arrondissement des bords.
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) { 
        Color borderColor = new Color(0,122,122);
        g.setColor(borderColor);//ou une autre couleur que tu peux rendre paramétrable 
        int arc = 30;//tu peux aussi le rendre configurable 
        int adjustXY = 1;//pour ajuster le dessin en x et y 
        int adjustWH = 2;//idem pour width et height 
        //pour eviter les escalier sur l'arrondi 
        Graphics2D g2 = (Graphics2D)g; 
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
        g2.drawRoundRect(x+adjustXY, y+adjustXY, width-adjustWH, height-adjustWH, arc, arc); 
    }}