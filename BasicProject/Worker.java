/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicProject;

import static BasicProject.QueueClass.*;

/**
 *
 * @author aksha
 */
public class Worker extends QueueClass implements Runnable {

    @Override
    public void run() {
        while(true)
        {
            if(queue.peek()!=null)
            {
                System.out.println(queue.poll());
            }
        }
    }
}
