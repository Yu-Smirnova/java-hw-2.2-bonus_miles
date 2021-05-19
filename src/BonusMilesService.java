public class BonusMilesService {
    public int calculate (int price) {
        int bonusMilePrice = 20;
        int miles =  price / bonusMilePrice;
        return miles;
    }

}
