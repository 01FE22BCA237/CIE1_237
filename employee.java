public class employee extends person {
    public int empid;
    public int salary;
    public employee(int empid, int salary){
           this.empid=empid;
           this.salary=salary;


    }
    public void display(){
        System.out.println("empid is :" +empid);
        System.out.println("salary is :" +salary);

    }
    public static void main(String[] args){
        person p =new person();
        employee e = new employee(103, 25000);
         p.displayName();
         p.name="Sadhana";
         p.displayAge("21-09-2004");
       e.display();
    }
} 
