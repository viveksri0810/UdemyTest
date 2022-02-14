package Composition.House;

public class Main {

    public static void main(String[] args) {
        Furniture furniture=new Furniture("PepperFry","Lshape","grey");
        Bed bed=new Bed("king","Stainless steel",7,7,2);
        Wall wall=new Wall(10,10, "white","east");
//        Wall wall1=new Wall(10,10, "white","west");
//        Wall wall2=new Wall(10,10, "white","north");
//        Wall wall3=new Wall(10,10, "white","south");
        Telivision telivision=new Telivision("Sony","black",2019,47);
        House house=new House(20,20,"light blue",furniture,bed,wall,telivision);

        telivision.turnOnTv();
        house.getTelivision().turnOnTv();
    }
}
