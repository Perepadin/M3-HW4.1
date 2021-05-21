public class BonusMilesService {
    public int calculateBonus(int ticketPrice) {
        int bonusMiles = ticketPrice / 20;
        return bonusMiles;
    }
}
