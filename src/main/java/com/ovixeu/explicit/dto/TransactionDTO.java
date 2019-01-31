package com.ovixeu.explicit.dto;

public class TransactionDTO {
    private int id;
    private String cardType;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "id=" + id +
                ", cardType='" + cardType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
