public class Console extends Place{
    private int gamepad_count;
    private boolean free_sofa;

    public Console(int price_1hr, int time, int free_place_count, int gamepad_count, boolean free_sofa){
        super(price_1hr, time, free_place_count);
        this.gamepad_count = gamepad_count;
        this.free_sofa = free_sofa;
    }
}
