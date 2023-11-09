import java.util.Hashtable;

public class Main {
    static Hashtable<Customer, FruitList> mySales = new Hashtable<Customer, FruitList>();
    public void putOrderList(Customer cu, FruitList fruit) {
        mySales.put(cu, fruit);
        System.out.println("Already put the new order to the system");
    }

    public void printOrderList() {
        for (Customer key : mySales.keySet()) {
            FruitList value = mySales.get(key);
            System.out.println(key + " -BUY-" + value);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Customer cus01 = new Customer(999, "Jamie", "Games of Thrones");
        FruitList fruitList01 = new FruitList();
        fruitList01.enter("Cherry");
        fruitList01.enter("Watermelon");
        fruitList01.enter("Sau Rieng");

        Customer cus02 = new Customer(532, "mchien", "47 Ly Tu Trong");
        FruitList fruitList02 = new FruitList();
        fruitList02.enter("Watermelon");
        fruitList02.enter("Qua Mit");

        mySales.put(cus01, fruitList01);
        mySales.put(cus02, fruitList02);

        main.putOrderList(cus02, fruitList02);
        main.printOrderList();

    }
}
