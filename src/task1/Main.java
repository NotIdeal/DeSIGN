package task1;

public class Main {

    public static void main(String[] args){
        Character troll = new Troll("Alena");
        System.out.println("Hello everybody, My name is " + troll.getName() + ", and I am a troll!");
        System.out.println(troll.tryFly());
        System.out.println(troll.tryWalk());
        System.out.println("My grandmother gave me secret magic juice that can help me fly.");
        troll.setFly(new canFly());
        System.out.println(troll.tryFly());
        System.out.println("Ohhhhh noooo, I broke my leg.");
        troll.setWalk(new canNotWalk());
        System.out.println(troll.tryWalk());
    }

}
