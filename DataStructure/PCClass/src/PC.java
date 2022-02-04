public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressButton();
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"Yellow");
    }

    @Override
    public String toString() {
        return "PC{" +
                "theCase=" + theCase +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                '}';
    }
}
