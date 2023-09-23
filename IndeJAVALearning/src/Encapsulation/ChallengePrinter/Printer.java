package Encapsulation.ChallengePrinter;

public class Printer {
    private int tonerLevel; // It is the percentage of how much toner level is left.
    private int pagesPrinted; //It is the count of total pages printed by the Printer
    private boolean duplex; //It is a boolean indicator, by specifying a starting toner amount, and whether the printer is duplex or not.

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0; // It is not necessary to add it, because int is by default 0, but for clarification I added it.
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount){
        int temp = tonerAmount + tonerLevel; //tonerAmount is added to the tonerLevel field
        if (temp < 0 || temp > 100){ // The tonerLevel should never exceed 100 percent, or even get below 0 percent.
           return  -1;                          //If the amount being added makes the level fall outside the range, return -1 from the method,
        }
        tonerLevel += tonerAmount;
        return tonerLevel; // otherwise return the actual toner level.
    }

    public int printPages(int pages){
        int sheets;
        if(duplex){
            System.out.println("This Printer is a duplex Printer");
            sheets = pages / 2 + pages % 2;
            pagesPrinted += sheets;
            return sheets;
        } else {
            pagesPrinted += pages;
            return pages;
        }

        /*An easier code form the teacher:
        int jobPages = (duplex) ? (pages /  2 ) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages
         */

    }
}
