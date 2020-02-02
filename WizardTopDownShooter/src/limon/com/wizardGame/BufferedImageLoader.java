package limon.com.wizardGame;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class BufferedImageLoader {
    
    public BufferedImage image;
    
    public BufferedImage LoadImage(String path){
        
        try {
            image = ImageIO.read(getClass().getResource(path));
        } catch (IOException ex) {
            Logger.getLogger(BufferedImageLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return image;
    }
}
