package folder;
import java.awt.*;
import javax.swing.*;

/** Cette classe permet d'obtenir un fond dégradé sur un JPanel.
 * Le dégradé n'est pas responsive !
 * @author Lolfish
 */
public class DesignGradient extends JPanel {

@Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color lightBlue = new Color(0,135,206,250); // Définir les couleurs souhaitées (ici pas besoin d'une couleur white vu que ça existe déjà)
        GradientPaint grad = new GradientPaint(0, 0, Color.white, 0, getHeight(), lightBlue); // Ici le dégradé va du blanc au bleu, vertical mais vous pouvez régler l'orientation en jouant avec les paramètres.
        g2.setPaint(grad);
        g2.fillRect(0, 0, getWidth(), getHeight()); // Remplissage du "rectancle" qui forme le background.
    }
 
    
     public DesignGradient() {
        super();
    }
}