package exercise.classandobject;

public class PersonTester {

    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Jim";
        person1.age = 60;
        person1.printName();

        Person person2 = new Person();
        person2.name = "Bob";
        person2.printName();
        person2.name = "Joe";
        person2.printName();

        Person person3 = new Person();
        person3.name = "Tom";
        person3.house = new House();

        Person person4 = person3;
        person4.printName();

        Person[] persons = new Person[]{person1, person2, person3};
        Person choosen = null;
        for(Person p: persons){
            if(p.name.equals("Jim")){
                choosen = p;
            }
        }

        System.out.println("Choosen:" + choosen.name);

    }
}
