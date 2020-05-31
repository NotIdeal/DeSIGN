package task1;

public class Pegasus extends Character {
    public Pegasus(String name){
        super(name);
        maybeFly = new canFly();
        maybeWalk = new canWalk();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
