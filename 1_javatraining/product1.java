class product{
    int id;
    String name;
    int price;
    int discount=0;
    product(){
        id=0;
        name="unknwn";
        price=0;
    }
    product(int id,int price){
        this.id=id;
        this.price=price;
    }
    product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    void display(){
        if(price>1000)
        discount =(price/100)*10;
        price=price-discount;
        System.out.println("id : "+id +"\n"+"name : "+name +"\n"+"price: "+price);
    }
    
}
class product1{
    public static void main(String a[]){
        product p1=new product(1,100);
        product p2=new product();
        product p3=new product(1,"pen",1100);
        p1.display();
        p2.display();
        p3.display();
    }
}