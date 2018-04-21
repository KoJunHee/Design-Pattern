package cartForSongs;

public class NonDiscount implements DiscountMode{
    @Override
    public double discount() {
        return 1;
    }
}
