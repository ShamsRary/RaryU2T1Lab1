public class CatRunner {
    public static void main(String[] args) {

        System.out.println("Hello worldkkkk!");

        Cat cat1 = new Cat("bob",5,10);
        cat1.printCatInfo();
        cat1.introduce();


        Cat cat2 = new Cat("bill",999,999);
        cat2.printCatInfo();
        cat2.introduce();

        Cat cat3 = new Cat("bill",10,999);
        cat3.printCatInfo();
        cat3.introduce();



    }
}

