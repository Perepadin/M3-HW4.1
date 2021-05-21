public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 14_555;
        int bonusMiles = service.calculateBonus(ticketPrice);

        System.out.println("Цена билета:");
        System.out.println(ticketPrice);

        System.out.println("Всего начислено бонусных миль:");
        System.out.println(bonusMiles);
    }
}