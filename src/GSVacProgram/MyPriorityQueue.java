/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GSVacProgram;

import java.util.*;

/**
 *
 * @author gshaw
 */
public class MyPriorityQueue implements PQInterface {

    private ArrayList<PQElement> thePQueue;

    public MyPriorityQueue() {
        thePQueue = new ArrayList<PQElement>();
    }

    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    public ArrayList<PQElement> getThePQueue() {
        return thePQueue;
    }

    public void setThePQueue(ArrayList<PQElement> thePQueue) {
        this.thePQueue = thePQueue;
    }

    public int size() {
        return thePQueue.size();
    }

    private int findInsertPosition(int newkey) {
        boolean found;
        PQElement elem;
        int position;
        found = false;
        position = 0;
        while (position < thePQueue.size() && !found) {
            elem = thePQueue.get(position);
            if (elem.getKey() > newkey) {
                position = position + 1;
            } else {
                found = true;
            }
        }
        return position;
    }

    // new element with a given key and element information will be added 
    public void enqueue(int priorkey, Object item) {
        int index;
        PQElement elem = new PQElement(priorkey, (Patient) item);

        index = findInsertPosition(priorkey);

        if (index == size()) {
            thePQueue.add(elem);
        } else {
            thePQueue.add(index, elem);
        }
    }

    //the first element has the highest priority
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    public String printPQueue() {
        String printStr = new String();
        PQElement elem;
        for (int i = 0; i < thePQueue.size(); i++) {
            elem = thePQueue.get(i);
            printStr = printStr.concat(elem.printPatient() + " " + "Priority =" + elem.getKey() + "\n");
        }
        return printStr;
    }

    public void setPriorty() {

    }
}
