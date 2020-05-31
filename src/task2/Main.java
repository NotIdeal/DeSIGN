package task2;

public class Main {
    public static void main(String[] args){
        PostalOffice KazReader = new PostalOffice();
        Subscriber a = new Subscriber("Alena", "Almaty");
        System.out.println("Hello Everyone! My name is " + a.getName() + ".");
        System.out.println("I love KazReader, so I want to become a subscriber to them.");
        KazReader.addSubscriber(a);

        System.out.println("Oh well, new magazines in KazReader!");

        Magazine gp = new Magazine("Harry Potter", "J.K Rowling");
        KazReader.newMagazine(gp);

        Magazine lr = new Magazine("Lord of Rings", "J.R.R Tolkien");
        KazReader.newMagazine(lr);

        System.out.println("My list of magazines for the current time.");
        a.showMyMagazines();

        System.out.println("I have no money to continue to be a subscriber. Therefore, I am leaving KazReader.");
        KazReader.deleteSubscriber(a);

        Magazine gt = new Magazine("Game of Thrones", "George R.R Martin");
        KazReader.newMagazine(gt);

        a.showMyMagazines();
        System.out.println("My list has not changed because I am not a subscriber.");
    }
}
