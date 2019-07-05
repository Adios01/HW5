public class Main {

    public static void main(String[] args) {

        Car c1 = new  Car("red", 2001, "crv", 2.0);
        Car c2 = new  Car("blue", 2003, "W211", 3.2);
        Car c3 = new  Car("white", 2019, "LX570", 5.7);


        System.out.println(c1.printInfo());
        System.out.println(c2.printInfo());
        System.out.println(c3.printInfo());
        c1.volume = 2.4;
        System.out.println(c1.printInfo());


        Chair chair1 = new Chair();
        chair1.height = 1400;
        chair1.width = 320;



    }
}
