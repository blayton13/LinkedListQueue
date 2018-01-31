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
public class MyListQueue {
    
    MyLink front;
    MyLink back;
    MyLink temp;
    
    public MyListQueue(){
        front=null;
        back=null;
    }
    
    public void enqueue(MyLink link){
        if(front==null) front=back=link;
        else{
            back.setNext(link);
            back=link;
            link.setNext(null);
        }
    }
    
    public MyLink dequeue(){
        if(front!=null){
            temp=front;
            front=front.getNext();
            if(front==null) back=front;
            return temp;
        }
        
        
        return null;
    }
    
    public void printPointers(){
        System.out.println(front+"/q"+back);
    }
    
    public int count(){
        int total = 0;
        if(front!=null) total++;
        temp=front.getNext();
        while(temp!=null){
            total++;
            temp=temp.getNext();
        }
        return total;
    }
    
    public void setFrontLink(MyLink front){
        this.front=front;
        back=front;
        while(back.hasNext()){
            back=back.getNext();
        }
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        temp=front;
        while(temp!=null){
            sb.append(temp.toString()+"\n");
            temp=temp.getNext();
        }
        return sb.toString();
    }
    
}
