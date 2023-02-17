public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Switzer", 3, "Farm");
        System.out.println(cow);
        cow.eating();
        cow.live();

        Wolf wolf = new Wolf("North wolf",4,"Siberian forest");
        System.out.println(wolf);
        wolf.eating();
        wolf.live();

        Fish fish = new Fish("Salmon",1,"River");
        System.out.println(fish);
        fish.eating();
        fish.live();

    }
}
