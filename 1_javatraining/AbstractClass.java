interface Abs {
    String stock_add();
}

interface Abs2 {
    void stock_remove();
}

public class AbstractClass implements Abs, Abs2 {

    public String stock_add() {
        return "New stock added";
    }

    public void stock_remove() {
        System.out.println("Stock removed");
    }

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass();

        System.out.println(obj.stock_add());
        obj.stock_remove();
    }
}