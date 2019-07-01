package cashregister;

public class FakePrinter extends Printer {
    private boolean isCalled = false;
    private String text;

    @Override
    public void print(String output) {
        text = output;
        isCalled = true;
    }

    public boolean printMethodWasCalled() {
        return isCalled;
    }


    public String printedString() {
        return text;
    }
}
