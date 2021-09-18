package Composition.PC;

public class Main {

    public static void main(String[] args) {
        Dimension theDimension=new Dimension(0,20,5);
        Case theCase=new Case("220B","DELL","240",theDimension);
        Resolution theResolution = new Resolution(2540,1440);
        Monitor theMonitor=new Monitor("27inches","Acer",27,theResolution);
        Motherboard theMotherboard=new Motherboard("DJ-200","Asus",4,6,"v2.44");
        PC thePC=new PC(theCase,theMonitor,theMotherboard);
        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        System.out.println(thePC.getTheCase().getDimension().getHeight());

    }
}
