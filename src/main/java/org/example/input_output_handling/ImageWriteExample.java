package org.example.input_output_handling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageWriteExample {

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try
        {
            File inputFile = new File("image-1.png");
            inputStream = new FileInputStream(inputFile);

            // Read the image using ImageIO
            BufferedImage image = ImageIO.read(inputStream);

            // check read success
            if (image != null)
            {
                System.out.println("Image read successfully.");
                System.out.println("Width: " + image.getWidth());
                System.out.println("Height: " + image.getHeight());

                // Specify the path to the output image file
                File outputFile = new File("image-1-copy.png");

                // Create a FileOutputStream to the output image file
                outputStream = new FileOutputStream(outputFile);

                // Write the image to the output file using ImageIO
                ImageIO.write(image, "png", outputStream);
                System.out.println("Image written successfully to " + outputFile.getAbsolutePath());
            } else {
                System.out.println("Could not read the image.");
            }
        } catch (IOException e) {
            System.out.println("Error processing the image file: " + e.getMessage());
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing the input stream: " + e.getMessage());
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing the output stream: " + e.getMessage());
                }
            }
        }
    }
}

