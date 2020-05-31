package task2;

import java.util.ArrayList;

public class PostalOffice implements InterfacePostal {
    public ArrayList<Subscriber> subscribers;
    public Magazine magazine;

    public PostalOffice(){
        subscribers = new ArrayList<Subscriber>();
    }

    public void addSubscriber(Subscriber a){
        this.subscribers.add(a);
    }
    public void deleteSubscriber(Subscriber a){
        for(int i = 0; i < subscribers.size(); ++i){
            if(subscribers.get(i) == a){
                subscribers.remove(i);
                break;
            }
        }
    }
    public void updateSubscriber(){
        for(int i = 0; i < subscribers.size(); ++i){
            subscribers.get(i).addNewMagazine(this.magazine);
        }
    }

    public void newMagazineAppeared(){
        updateSubscriber();
    }
    public void newMagazine(Magazine a){
        this.magazine = a;
        newMagazineAppeared();
    }
}
