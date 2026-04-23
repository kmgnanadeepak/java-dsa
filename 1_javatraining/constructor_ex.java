class construct{
    int num;
    String name;
    construct(int numm,String namee){
        num=numm;
        name=namee;
    }
    void display(){
        System.out.println(num);
        System.out.println(name);
    }
}
class constructor_ex{
    public static void main(String args[]){
        construct deepak=new construct(551,"deepak");
        construct rahul=new construct(1,"rahul");
        deepak.display();
    }
}