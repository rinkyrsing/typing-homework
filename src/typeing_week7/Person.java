package typeing_week7;


public class Person {
    String firstname;
    String lastname;
    int age;

    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstname){
        this.firstname = firstname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public void setAge(int age) {
        if (age > 0 || age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    public boolean isTeen(){
        if(getAge() > 12 && getAge() < 12){
             return true;
        }else
        return false;
    }
    public String getFullName(){
     if (firstname.isEmpty() && lastname.isEmpty()){
         return " ";
        }else if(firstname.isEmpty()){
         return getLastName();
     }else if(lastname.isEmpty()){
         return firstname;
     }else {
         return getFirstName() + " " + getLastName();
      }
    }

    public static void main(String[] args) {
     Person person =new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
