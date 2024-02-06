/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorteioacamps;

import java.util.ArrayList;
import static sorteioacamps.FileHandler.createFile;
import static sorteioacamps.FileHandler.readFile;
import static sorteioacamps.FileHandler.writeFile;

/**
 *
 * @author lucassouza
 */
public class NumberRecordManager {
    private final String fileName = "numbersRecord.txt";

    public ArrayList<NumberRecord> readRecords(){
        String content = "";
        boolean fileCreated = createFile(fileName);
        ArrayList<NumberRecord> allRecords = new ArrayList<>();
        if(fileCreated){
            // file format:
            // number;task;gift;other
            for(int i = 0; i < 1000; i++){
                content += i + ";false;false;false\n";
                allRecords.add(new NumberRecord(i, false, false, false));
            }
            writeFile(fileName, content);
            return allRecords;
        }

        String readContent = readFile(fileName);
        String[] parts = readContent.split("\n");
        for (String part : parts) {
            String[] data = part.split(";");
            int number = Integer.parseInt(data[0]);
            boolean task = Boolean.parseBoolean(data[1]);
            boolean gift = Boolean.parseBoolean(data[2]);
            boolean other = Boolean.parseBoolean(data[3]);
            allRecords.add(new NumberRecord(number, task, gift, other));
        }
        return allRecords;
    }

    public void writeRecordsToFile(ArrayList<NumberRecord> allRecords){
        String toRecord = "";
        for (NumberRecord numberRecord : allRecords){
            toRecord += numberRecord.toString();
        }
        writeFile(fileName, toRecord);
    }
}
