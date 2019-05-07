package test;

public class Customer extends Person {

    private int number;

    private boolean inMailingList;

    public Customer() {
    }

    public Customer(String name, String address, String phone) {
        super(name, address, phone);
    }

    public Customer(int number, boolean inMailingList) {
        this.number = number;
        this.inMailingList = inMailingList;
    }

    public Customer(String name, String address, String phone, int number, boolean inMailingList) {
        super(name, address, phone);
        this.number = number;
        this.inMailingList = inMailingList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isInMailingList() {
        return inMailingList;
    }

    public void setInMailingList(boolean inMailingList) {
        this.inMailingList = inMailingList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "number=" + number +
                ", inMailingList=" + inMailingList +
                "} " + super.toString();
    }
}
