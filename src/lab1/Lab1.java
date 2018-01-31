/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Blayton
 */

import java.util.*;
import java.io.*;

public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        File file = new File("Lab1InputFile.txt");
        Scanner fileIn = new Scanner(file);
        Scanner console = new Scanner(System.in);
        
        MyListQueue queue = new MyListQueue();
        
        String nameIn;
        int ageIn;
        MyLink linkTemp;
        
        while(fileIn.hasNext()){
            nameIn=fileIn.nextLine();
            ageIn=Integer.parseInt(fileIn.nextLine());
            linkTemp = new MyLink(nameIn,ageIn);
            queue.enqueue(linkTemp);
        }
        /*
        System.out.println("Total = "+queue.count());
        System.out.println("Queue contents:\n"+queue);
        System.out.println("Dequeueing two items\n");
        queue.dequeue();
        queue.dequeue();
        System.out.println("Total = "+queue.count());
        System.out.println("Queue contents:\n"+queue);
        */
        char input = console.nextLine().charAt(0);
        while(input!='q'){
            switch(input){
                case 'd':
                    queue.dequeue();
                    break;
                case 'p':
                    System.out.println(queue);
                    break;
                case 'l':
                    queue.printPointers();
                    break;
            }
            input=console.nextLine().charAt(0);
        }
    }
    
}