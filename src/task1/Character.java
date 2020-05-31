package task1;

public class Character {
    String name;
    public Fly maybeFly;
    public Walk maybeWalk;

    public Character(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String tryFly(){
        return maybeFly.fly();
    }
    public void setFly(Fly maybeFly){
        this.maybeFly = maybeFly;
    }
    public String tryWalk(){
        return maybeWalk.walk();
    }
    public void setWalk(Walk maybeWalk){
        this.maybeWalk = maybeWalk;
    }
}
