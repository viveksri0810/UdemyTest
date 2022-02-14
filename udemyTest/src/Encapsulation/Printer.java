package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;




    public int addToner(int tonerAmount){

        if(tonerAmount<0 && tonerAmount<=100){
            return -1;
        }
        else if(tonerLevel+tonerAmount<=100){
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        }
        else {
             return -1;
        }
    }

    public int printPages(int pages){
        int printToPages=pages;
        if (this.duplex){
            this.pagesPrinted=printToPages/2+printToPages%2;
        }
        else {
            this.pagesPrinted+=pages;
        }
        return this.pagesPrinted;
    }

    public Printer(int tonerLevel,  boolean duplexPrinter) {
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel=-1;
        }

        this.pagesPrinted = 0;
        this.duplex = duplexPrinter;
    }


    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
