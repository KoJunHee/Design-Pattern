package cartForSongs;

public class OnSale implements DiscountMode {
    @Override
    public double discount() {
        return 0.1;
    }
}
