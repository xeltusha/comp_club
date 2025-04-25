public class VIP extends Place{
    private boolean dvestisorok_hz;
    public VIP(int price_1hr, int time, int free_place_count, boolean dvestisorok_hz){
        super(price_1hr, time, free_place_count);
        this.dvestisorok_hz = dvestisorok_hz;
    }
}
