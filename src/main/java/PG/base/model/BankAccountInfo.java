package PG.base.model;

public class BankAccountInfo implements Comparable {

    private Long id;
    private String fullName;
    private double balance;

    public BankAccountInfo(Long id, String fullName, double balance) {
        super();
        this.id = id;
        this.fullName = fullName;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Object o) {
        BankAccountInfo that = (BankAccountInfo) o;
        int compare = Integer.compare(this.getId().intValue(), (Integer) that.getId().intValue());
        return compare;
    }
}
