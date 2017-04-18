package rachelmiller.class13;
// should add to firebase

/**
 * Created by rachelmiller on 4/17/17.
 */

public class Person {

    public String id; // the id connects to peopleReference.child("xyz").setValue(p); the xyz
    public String name;
    public int age;
    public boolean alive;


    public Person() {
    }


    public Person(String id, String name, int age, boolean alive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}


