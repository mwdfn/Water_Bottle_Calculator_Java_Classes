public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume){
        volume = newVolume;
    }

    public int drink(){
        setVolume(this.volume - 10);
        return volume;
    }

    public void emptyBottle(){
        setVolume(0);
    }

    public void refillBottle(){
        setVolume(100);
    }
}
