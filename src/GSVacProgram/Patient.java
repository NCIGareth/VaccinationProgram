/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GSVacProgram;

/**
 *
 * @author gshaw
 */
public class Patient {

    private String name;
    private String age;
    private String ul;

    public Patient() {
        name = new String();
        age = new String();
        ul = new String();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUl() {
        return ul;
    }

    public void setUl(String ul) {
        this.ul = ul;
    }

}
