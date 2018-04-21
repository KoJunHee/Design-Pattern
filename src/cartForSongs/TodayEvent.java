package cartForSongs;

public class TodayEvent implements DiscountMode{
    @Override
    public double discount() {
        return 0.3;
    }
}
