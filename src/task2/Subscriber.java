package task2;

import java.util.ArrayList;

public class Subscriber {
    public String name;
    public String address;
    public ArrayList<Magazine> magazines;
    public Subscriber(String name, String address){
        this.name = name;
        this.address = address;
        this.magazines = new ArrayList<Magazine>();
    }

    public void addNewMagazine(Magazine a){
        magazines.add(a);
    }
    public void showMyMagazines(){
        for(int i = 0; i < this.magazines.size(); ++i){
            System.out.println(this.magazines.get(i).name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
