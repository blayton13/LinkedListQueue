package lab1;

/**
 * The MyListQueue class creates a linked list queue. There are MyLink pointers
 * that hold the location of the front and rear MyLink objects in the queue. The
 * path of the queue is found by following the next link stored within each MyLink.
 * Null pointers are appropriately used to show that there are no following objects,
 * or the queue is empty.
 * @author Blayton
 */
public class MyListQueue {
    
    private MyLink front;
    private MyLink back;
    
    /**
     * Default constructor - creates new queue, with front and back equal to null
     */
    public MyListQueue(){
        front=null;
        back=null;
    }
    
    /**
     * Adds a new object to the queue. If empty, new Link is front and back.
     * @param link 
     */
    public void enqueue(MyLink link){
        if(front==null) front=back=link;
        else{
            back.setNext(link);
            back=link;
            link.setNext(null);
        }
    }
    
    /**
     * Removes one link from the queue. The front of the queue is the object
     * that is removed.
     * @return MyLink object that was in the front of the queue
     */
    public MyLink dequeue(){
        MyLink temp;
        //checks to see if queue has contents
        if(front!=null){
            temp=front;                 //temporarily stores front to return address
            front=front.getNext();      //sets front to next address in queue
            if(front==null) back=front; //if empty, front and back point to null
            return temp;
        }
        return null;
    }
    
    /**
     * Used to test if null pointers were appropriately given, and if front and
     * back were correct.
     */
    public void printPointers(){
        System.out.println(front+"/q"+back);
    }
    
    /**
     * Used to count the number of objects stored in the queue.
     * @return integer representing number of objects in queue
     */
    public int count(){
        MyLink temp=null;                //uses temp object to follow path of queue
        int total = 0;              //counts object addresses in queue
        if(front!=null){
            total++;
            temp=front.getNext();
        }    
        while(temp!=null){          //keeps coutning until next address is null
            total++;
            temp=temp.getNext();
        }
        return total;
    }
    
    /**
     * Returns a String that lists each object in the queue from front to back
     * @return String listing queue contents
     */
    public String toString(){
        MyLink temp;
        StringBuilder sb = new StringBuilder();
        temp=front;
        while(temp!=null){
            sb.append(temp.toString()+"\n");
            temp=temp.getNext();
        }
        return sb.toString();
    }
    
}
