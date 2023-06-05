/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicProject;

import static BasicProject.QueueClass.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author aksha
 */

public class Reader extends QueueClass implements Runnable {

    private String directryName;

    public Reader(String directryName) {
        this.directryName = directryName;
    }
    
    @Override
    public void run() {
        fileReading();
    }

    void fileReading() {
        try {
            File myObj = new File(directryName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                Object data = myReader.nextLine();
                queue.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}