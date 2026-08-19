package arrlist;

import java.util.ArrayList;

public class customobject {
    class student{
        String name;
        int age;



        public student(String name,int age){
            this.name=name;
            this.age=age;
        }
        //me thamai custom object ekak hadana widiha
    }
    public void main(String[] args) {
        ArrayList<student> abc=new ArrayList<>();
        abc.add(new student("kamal",2));
    }
}
