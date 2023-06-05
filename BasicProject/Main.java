/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicProject;

import java.util.*;
/**
 *
 * @author aksha
 */
public class Main extends Alloter
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the directry name : ");
        String directryName=sc.next();
        Alloter.createReader(directryName);
        System.out.println("Enter number of Worker Threads : ");
        int numWorker=sc.nextInt();
        Alloter.createWorker(numWorker); 
    }
}
