import java.util.Random;
public class BurgerMain {

    public static void main(String[] args) {
        Random random = new Random();
        String[] bun = {"булочка з кунжутом", "м'яка пшенична булочка", "картопляна булочка", "чіабатта"};
        String[] meat = {"котлета із яловичини", "котлета із баранини", "котлета зі свинини"};
        String[] cheese = {"плавлений сир", "нарізаний сир"};
        String[] greenery = {"помідор", "огірок", "огірки й цибуля", "помідор й цибуля", "помідор, огірки й цибуля"};
        String[] mayo = {"майонез", "майонез й кетчуп", "майонез й гірчиця", "майонез, кетчуп й гірчиця"};

        System.out.println("Склад бургерів знизу й нагору");

        Burger usual = new Burger(bun[random.nextInt(bun.length)], meat[random.nextInt(meat.length)], cheese[random.nextInt(cheese.length)], greenery[random.nextInt(greenery.length)], mayo[random.nextInt(mayo.length)]);
        Burger diet = new Burger(bun[random.nextInt(bun.length)], meat[random.nextInt(meat.length)], cheese[random.nextInt(cheese.length)], greenery[random.nextInt(greenery.length)]);
        Burger king = new Burger(bun[random.nextInt(bun.length)], meat[random.nextInt(meat.length)], cheese[random.nextInt(cheese.length)], greenery[random.nextInt(greenery.length)], mayo[random.nextInt(mayo.length)], true);
    }
}