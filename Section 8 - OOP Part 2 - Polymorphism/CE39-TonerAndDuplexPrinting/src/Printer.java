public class Printer
{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex)
    {
        this.pagesPrinted = 0;
        this.duplex = duplex;
        if(tonerLevel <= 0 || tonerLevel >= 100) this.tonerLevel = -1;
        this.tonerLevel = tonerLevel;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = (duplex) ? pages / 2 + pages % 2 : pages;
        System.out.println(duplex ? "Printing in duplex mode" : "");
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted()
    {
        return pagesPrinted;
    }
}
