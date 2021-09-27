/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GSVacProgram;

/**
 *
 * @author gshaw
 */
public class PQElement {

    private int key;
    private Patient element;

    public PQElement(int priority, Patient e) {
        key = priority;
        element = e;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int val) {
        key = val;
    }

    public Patient getElement() {
        return element;
    }

    public void setElement(Patient e) {
        element = e;
    }

    public String printPatient() {
        String msg;
        msg = " name = " + element.getName() + " " + "age =" + element.getAge() + " " + " Underlining Ilnesses =" + element.getUl();
        return msg;
    }
}
       //end of class PQElement
