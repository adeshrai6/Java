public class PCClass {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20, 5);
        System.out.println("Dimension: " + dimensions);

        Case theCase = new Case("200B", "Dell", dimensions);
        System.out.println("Case: " + theCase);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2500, 1400));
        System.out.println("Monitor: " + monitor);

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "V2.44");
        System.out.println("Motherboard: " + motherboard);

        PC thePc = new PC(theCase, monitor, motherboard);
        thePc.powerUp();
        System.out.println("Pc: " + thePc);

    }
}
