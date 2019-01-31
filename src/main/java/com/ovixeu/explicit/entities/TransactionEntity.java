package com.ovixeu.explicit.entities;

public class TransactionEntity {
    private int transactionId;
    private String transactionCardType;
    private double transactionAmount;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionCardType() {
        return transactionCardType;
    }

    public void setTransactionCardType(String transactionCardType) {
        this.transactionCardType = transactionCardType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
