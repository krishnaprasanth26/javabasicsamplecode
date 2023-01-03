package collectionInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("linkedList = " + linkedList);

        //Add an element to the First Position.
        linkedList.addFirst(1);
        System.out.println("Linked List after adding to the first index: " + linkedList);

        //Add an element to the Last Position.
        linkedList.addLast(5);
        System.out.println("Linked List after adding to the last index: " + linkedList);

        /*
         * LinkedList performs the worst if the operation is retrieval of data.
         * Hence if our requirement is to fetch data, we should use ArrayList.
         * But LinkedList is the best choice if we have requirements of adding and
         * removing data very often. In this case we should avoid ArrayList
         */

        //Get the first value
        System.out.println("First Value :" +linkedList.getFirst());

        //Get the first value using index position
        System.out.println("First Value using index :"+linkedList.get(0));

        /*
         * Now get the third value of the list.
         * Since LinkedList has the data structure of doubly linked list,
         * the value of the third index is known only to the link present in
         * the Second index. Internally, the program will traverse to index number 2 and then only
         * it can get the value of 3. So Linked list is not suited for search operations.
         */
        System.out.println("Third value of the list : "+ linkedList.get(3));



        System.out.println("-----------------------------------------------------");
        //Looping through the Linked List using the Iterator.
        Iterator<Integer> iterator=linkedList.iterator();
        System.out.println("Iterator");
        while(iterator.hasNext()){
            System.out.println("Elements in the LL are "+ iterator.next());
        }






    }

}
