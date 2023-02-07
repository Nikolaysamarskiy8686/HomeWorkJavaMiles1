public class Main {
    public static void main(String[] args) {
        int ticketprice = 1200;
        int every20rubles = 20;
        int bonusmiles = ticketprice / every20rubles;
        System.out.println("Бонусных миллей:" + bonusmiles);
    }
}