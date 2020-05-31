package task1;

public class Elve extends Character{
    public Elve(String name){
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
