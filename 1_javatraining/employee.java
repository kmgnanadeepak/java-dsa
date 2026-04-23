class employeelist{
    int id;
    String name;
    int salary;
    employeelist(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("salary : "+salary);
    }
}
class employee{
    public static void main(String a[]){
        employeelist rahul=new employeelist(1,"rahul",12000);
        employeelist virat=new employeelist(1,"virat",15000);
        employeelist rohit=new employeelist(1,"rohit",10000);
        rahul.display();
        virat.display();
        rohit.display();

    }
}