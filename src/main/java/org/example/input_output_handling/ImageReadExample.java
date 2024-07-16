package org.example.input_output_handling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageReadExample {

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            // Specify the path to the image file
            File inputFile = new File("image-1.png");

            // Create a FileInputStream from the image file
            inputStream = new FileInputStream(inputFile);

            // Read the image using ImageIO
            BufferedImage image = ImageIO.read(inputStream);

            // Check if image was read successfully
            if (image != null)
            {
                System.out.println("Image read successfully.");
                System.out.println("Width: " + image.getWidth());
                System.out.println("Height: " + image.getHeight());
            } else {
                System.out.println("Could not read the image.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the image file: " + e.getMessage());
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing the input stream: " + e.getMessage());
                }
            }
        }
    }
}

