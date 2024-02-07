/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorteioacamps;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lucassouza
 */
public class FileHandler {

    // Method to create a new file
    public static boolean createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to write content to a file
    public static void writeFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

}
