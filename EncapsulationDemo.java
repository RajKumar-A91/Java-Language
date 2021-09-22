class Student {

    private int rollno;
    private String name;
    //Encapsulation--->binding data with methods
    //the process binding datamembers with membermethods is known
    //as encapsulation
    //the proper way intiallize and access the variables is through 
    //getters and setters these are methods used to set and get values of variables 
    //respectively
    //the variables are always should be declared in private
    //and the methods used to getters and setters are in public
    //g
    public void setRollno(int r) {

        rollno=r;
        //log file
        System.out.println("<<the value of rollno is changed>>");
    }
    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        //log files
        System.out.println("<<the value of name is changed>>");
    }
}
public class EncapsulationDemo {

    public static void main(String args[]) {

        Student s1=new Student();
        s1.setRollno(565);
        System.out.println(s1.getRollno());
        s1.setName("RajKumar");
        System.out.println(s1.getName());


    }
    
}
