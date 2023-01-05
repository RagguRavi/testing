package heicToJpg;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class HEICtoJPG {

    public static void main(String[] args) {
        try {
        	File file = new File("C:\\Users\\ravir\\OneDrive\\Pictures\\Zapya\\2022_12_10_093618\\IMG_0070.HEIC");
        	System.out.println(file.exists());
            // Read the HEIC file
            BufferedImage heicImage = ImageIO.read(file);
            System.out.println(heicImage);
            // Write the JPG file
            ImageIO.write(heicImage, "jpg", new File("F:\\output\\output.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
