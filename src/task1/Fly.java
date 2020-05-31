package task1;

public interface Fly {
    String fly();
}

class canFly implements Fly{
    public String fly(){
        return "UUU eeeee, I believe I can fly!";
    }
}

class canNotFly implements Fly{
    public String fly(){
        return "Iomano, I can't fly!";
    }

}