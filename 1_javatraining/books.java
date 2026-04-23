class book{
    String title;
    int price;
    book(String title,int price){
        this.title=title;
        this.price=price;
    }
    void display(){
        System.out.println("title:"+title);
        System.out.println("price:"+price);
    }
}
class books{
    public static void main(String a[]){
        book b1=new book("the return of king",250);
        b1.display();
    }
}