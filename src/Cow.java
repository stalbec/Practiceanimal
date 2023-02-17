public class Cow extends Animal{
    private String liveArea;

    public Cow(String name, int age, String liveArea) {
        super(name, age);
        this.liveArea = liveArea;
    }

    public String getLiveArea() {
        return liveArea;
    }

    public void setLiveArea(String liveArea) {
        this.liveArea = liveArea;
    }

    @Override
    public void eating() {
        System.out.println("Cow is eating");
    }

    @Override
    public void live() {
        System.out.println("Cow is leaving");

    }

    @Override
    public String toString() {
        return "Animal:    " +"Cow:    "+
                "liveArea:    " + liveArea + '\'' +
                '}'+ super.toString();

    }
}
