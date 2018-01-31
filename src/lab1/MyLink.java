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
public class MyLink {
    private String name;
    private int age;
    private MyLink nextLink;
    
    public MyLink(){
        name="unnamed";
        age=0;
        nextLink=null;
    }
    
    public MyLink(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setNextLink(MyLink nextLink){
        this.nextLink=nextLink;
    }
    
    public boolean hasNext(){
        return nextLink!=null;
    }
    
    public void setNext(MyLink nextLink){
        this.nextLink=nextLink;
    }
    
    public MyLink getNext(){
        return nextLink;
    }
    
    public String toString(){
        return "Name: "+name+"\tAge: "+age;
    }
}
