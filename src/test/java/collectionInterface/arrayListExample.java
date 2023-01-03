package collectionInterface;

import java.sql.Array;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class arrayListExample {

    public static void main(String[] args) {
        List<Object> sample = new ArrayList<Object>();
        sample.add("1");
        sample.add("Test insertion");
        sample.add("2");
        sample.add("Test insertion 2");
        sample.add("3");
        sample.add("Test insertion 3");
        System.out.println("Sample Object Inserted= " + sample);

        //Add element at the required index.
        sample.add(0,"Head");
        System.out.println("Sample Object Inserted at Head= " + sample);

        //Find the element inserted at certain Index.
        System.out.println("Index position of Test insertion "+sample.indexOf("Test insertion"));

        //List allows duplicate elements.
        sample.add("1");
        System.out.println("Sample object with duplicate elements "+sample);

        //Index of last duplicate elements.
        System.out.println("Last index of the last element "+sample.lastIndexOf("1"));

        //Add list content to another list
        List<Object> anotherSample = new ArrayList<>();
        anotherSample.addAll(sample);
        System.out.println("The another Sample List "+anotherSample);

        //Clear to delete all the elements.
        sample.clear();
        System.out.println("Empty ArrayList "+sample);

        //Adding null to the empty Arraylist
        sample.add(null);
        System.out.println("Empty ArrayList with null inserted "+sample);

        //Adding list to another list at the 0th position.
        anotherSample.addAll(0,sample);
        System.out.println(anotherSample);

        //Adding an element using Set method. The set method is used to add an element in the existing ArrayList
        // and does not increase the size of the Arraylist automatically, whereas the add method increases the size
        // of the Arraylist dynamically.

        anotherSample.set(8,"Car");
        // The set code returns index out of bound exception in the below condition.
        //anotherSample.set(9,"Bike");

        System.out.println("The last two elements added using the Set method "+anotherSample);

        /*get an element based on index position.
		If the index is not there we will get index out of bound exception*/
        System.out.println("Element at 5th Position "+anotherSample.get(5));

        //isEmpty() method to check the list is empty or not
        System.out.println("This list is empty. True or False? "+ anotherSample.isEmpty());
        System.out.println(anotherSample);

        //get all the elements in the list using for loop
        for(int size=0; size<anotherSample.size();size++){
            System.out.println("element at "+size+"th position " +anotherSample.get(size));
        }

        // Fetch the elements using For Each loop.
        for (Object string:anotherSample)
        {
            System.out.println("List Elements = " + string);
        }
        //forward traversing using ListIterator
        ListIterator<Object> listIterator= anotherSample.listIterator();
        while(listIterator.hasNext()){
            System.out.println("Forward Iteration : "+listIterator.next());
        }

        // reverse Iteration using ListIterator
        while(listIterator.hasPrevious()){
            System.out.println("Reverse Iteration : "+listIterator.previous());
        }

        /*Iteration with Iterator (NOTE: Not ListIterator)
		Iterator can only traverse forward but not on reverse.
		Hence we are using ListIterator for better usages.*/

        Iterator<Object> iterator=anotherSample.iterator();
        while(iterator.hasNext()){
            System.out.println("Forward Only:"+iterator.next());
        }

        /* ArrayList is non-synchronized.It should not be used in multi-threaded
         * environment without explicit synchronization.Hence,
         * adding an element to the list when traversing through it
         * will give concurrent modification exception.
         * This is happening because when a thread is trying to read the elements
         * from the list another thread is trying to add or remove an element from the same.
         */

        try{
            for (Object string : anotherSample) {
                System.out.println("Reading the list values "+ string);
                anotherSample.add("Mustang");
            }
        }
        catch(Exception e){

            System.out.println("Dude! You are trying to modify a list while a read operation is happening");
        }

        arrayListExample syncOnCopyandWrite = new arrayListExample();
        syncOnCopyandWrite.syncArrayListExample();
    }
    public void syncArrayListExample(){

        CopyOnWriteArrayList<String> syncal = new CopyOnWriteArrayList<String>();

        //Adding elements to synchronized ArrayList
        syncal.add("Pen");
        syncal.add("NoteBook");
        syncal.add("Ink");
        System.out.println("Iterating synchronized ArrayList:");

        Iterator<String> syncIterator = syncal.iterator();
        while (syncIterator.hasNext()){
            System.out.println(syncIterator.next());
            syncal.add("Eraser");
            syncal.remove("Eraser");


        }
        System.out.println("Final List: "+syncal);
    }
}
