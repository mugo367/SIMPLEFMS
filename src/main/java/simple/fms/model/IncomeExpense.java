package simple.fms.model;


import simple.fms.model.enumFiles.TransactionType;

public class IncomeExpense {
    private String transactionId;
    private String transactionDate;
    private TransactionType transactionType;

    private int transactionCost;
    private String transactionDetails;

    public IncomeExpense(String transactionId, String transactionDate, TransactionType transactionType, int transactionCost, String transactionDetails) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;

        this.transactionCost = transactionCost;
        this.transactionDetails = transactionDetails;
    }

    public IncomeExpense() {

    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }


    public int getTransactionCost() {
        return transactionCost;
    }

    public void setTransactionCost(int transactionCost) {
        this.transactionCost = transactionCost;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    @Override
    public String toString() {
        return
                "transactionId= " + transactionId +
                ", transactionDate= " + transactionDate +
                ", transactionType= " + transactionType +
                ", transactionCost= " + transactionCost +
                ", transactionDetails= " + transactionDetails;
    }
}
