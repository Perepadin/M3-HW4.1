public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusMiles = service.calculateBonus(20100);
        System.out.println("Всего начислено бонусных миль:");
        System.out.println(bonusMiles);
    }
}