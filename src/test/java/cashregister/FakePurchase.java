package cashregister;


public class FakePurchase extends Purchase{
    private String purchaseString;

    @Override
    public String asString() {
        return purchaseString;
    }

    public void setStringIWant(String output){
        purchaseString = output;
    }
}
