public class Wolf extends Animal {
    private String liveArea;

    public Wolf(String name, int age, String liveArea) {
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
        System.out.println("Wolf is eating");
    }

    @Override
    public void live() {
        System.out.println("Wolf is leaving");

    }

    @Override
    public String toString() {
        return "Wolf{" +
                "liveArea='" + liveArea + '\'' +
                '}'+ super.toString();
    }
}
