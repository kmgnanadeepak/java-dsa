class emp{
    int id;
    String name;
    public emp(){
        id=100;
        name="John Doe";
    }
}
class main2{
    public static void main(String[] args){
        emp o1=new emp();
        System.out.println(o1.id);
        System.out.println(o1.name);
    }
}