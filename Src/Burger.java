public class Burger {
    String bun;
    String meat;
    String cheese;
    String greenery;
    String mayo;
    boolean king;


    public Burger(String bun, String meat, String cheese, String greenery, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;
        System.out.println("Склад бургеру: " +
                bun +
                "; " + mayo +
                "; " + meat +
                "; " + cheese +
                "; " + greenery +
                "; " + mayo +
                "; " + bun
        );
    }

    public Burger(String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Дієтичний бургер: " +
                bun +
                "; " + meat +
                "; " + cheese +
                "; " + greenery +
                "; " + bun
        );
    }

    public Burger() {
    }

    public Burger(String bun, String meat, String cheese, String greenery, String mayo, boolean king) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;
        System.out.println("Королівський бургер: " +
                bun +
                "; " + mayo +
                "; " + meat +
                "; " + cheese +
                "; " + meat +
                "; " + greenery +
                "; " + mayo +
                "; " + bun
        );
    }
}