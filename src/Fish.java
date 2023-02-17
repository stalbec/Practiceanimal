public class Fish extends Animal {
    private String liveArea;

    public Fish(String name, int age, String liveArea) {
        super(name, age);
        this.liveArea = liveArea;
    }

    public String getLiveArea() {
        return liveArea;
    }

    public void setLiveArea(String liveArea) {
        this.liveArea = liveArea;
    }

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating() {
        System.out.println("Fish is eating");
    }

    @Override
    public void live() {
        System.out.println("Fish is leaving");

    }

    @Override
    public String toString() {
        return "Fish{" +
                "liveArea='" + liveArea + '\'' +
                '}'+ super.toString();

    }
}

