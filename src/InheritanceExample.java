public class InheritanceExample {
    public static void main(String[] args) {
        PrinterParent parent = new PrinterParent("HP-123");
        parent.checkInk();

        ColoredPrinter coloredPrinter = new ColoredPrinter("sadfs");
        coloredPrinter.printColored();
    }
}

class PrinterParent {
    protected String model = "default";

    public PrinterParent(String model) {
        this.model = model;
    }

    public void checkInk() {
        System.out.println("Check ink in parent");
    }

    public void checkPaper() {
        System.out.println("Check paper in parent");
    }

    protected void foo() {

    }
}

class ColoredPrinter extends PrinterParent {
    public ColoredPrinter(String model) {
        super(model);
    }

    public void printColored() {
        checkInk();
        checkPaper();
        foo();

        System.out.println("Printing colored on " + model);
    }
}
