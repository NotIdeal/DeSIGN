package task1;

public class Vampire extends Character{
    public Vampire(String name){
        super(name);
        maybeFly = new canNotFly();
        maybeWalk = new canWalk();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
