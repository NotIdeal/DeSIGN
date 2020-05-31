package task1;

public interface Walk {
    String walk();
}

class canWalk implements Walk{
    public String walk(){
        return "UUU eeeee, I believe I can walk!";
    }
}

class canNotWalk implements Walk{
    public String walk(){
        return "Iomano, I can't walk!";
    }

}