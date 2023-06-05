/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicProject;

import java.lang.*;

/**
 *
 * @author aksha
 */
public class Alloter extends QueueClass {
    
    public static void createReader(String directryName)
    {
        try 
        {
            Reader R = new Reader(directryName);
            Thread thread1 = new Thread(R);
            thread1.start();
        } 
        catch (Exception e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
        
    public static void createWorker(int numWorker)
    {
        try 
        {
            Thread workerThread[]=new Thread[numWorker];
            for(int i=0;i<numWorker;i++)
            {
                workerThread[i] = new Thread(new Worker());
                workerThread[i].start();
            }
        }
        catch (Exception e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}