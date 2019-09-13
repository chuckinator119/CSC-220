/**
 * Name: <INSERT NAME>
 * Date: <INSERT DATE> 
 * Description:  <INSERT PROGRAM DESCRIPTION>
 */
 
/** Holds a group of person objects */
class People {
  private Person[] group;
  private int index;
  
  public People() {
    group = new Person[5];
    index = 0;
  }
  
  public boolean addPerson(Person p) {
    if (index < group.length) {
      group[index] = p;
      index++;
      return true;
    }
    return false;
  }
  
  public Person findPersonByName(String name) {
    Person result = null;
    for(Person p : group) {
      if (p.name.equals(name)) {
        result = p;
        break;
      }
    }
    return result;
  }
  
  public Person findPersonByAge(int age) {
    Person result = null;
    for(Person p : group) {
      if (p.age == age) {
        result = p;
        break;
      }
    }
    return result;
  }
}
 
 
/** Holds name, age and student status of a person */
class Person {
  public String name;
  public int age;
  public boolean isStudent;
  
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.isStudent = false;
  }
  
  public void birthday() {
    this.age++;
  }
  
  @Override
  public String toString() {
    String result = "";
    result += this.name + " is ";
    if (this.isStudent) {
      result += "a student ";
    }
    else {
      result += "not a student ";
    }
    result += "and is " + this.age + " years old";
    return result;
  }
}


/** Main class - contains entry point */
public class Main {
  public static void main(String[] args) {
    // instantiate a new People object
    People people = new People();

    // add some Person objects
    boolean addedAllPeople = true;
    addedAllPeople &= people.addPerson(new Person("Eleanor", 21));
    addedAllPeople &= people.addPerson(new Person("Tahani", 23));
    addedAllPeople &= people.addPerson(new Person("Chidi", 25));
    addedAllPeople &= people.addPerson(new Person("Jason", 27));
    addedAllPeople &= people.addPerson(new Person("Michael", 29));
    addedAllPeople &= people.addPerson(new Person("Janet", 31));
    
    // create pointers to two Persons
    Person p1;
    Person p2;
    
    // initialize them with the results of our searches
    p1 = people.findPersonByName("Chidi");
    p2 = people.findPersonByAge(10_000);
    
    // check if our results are correct
    Mysterious.checkAnswer(addedAllPeople, p1, p2);
  }
}
