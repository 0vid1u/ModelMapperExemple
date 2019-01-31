package com.ovixeu.implicit.dto;

public class PaymentDTO {

    private int id;
    private String paymentNumber;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "id=" + id +
                ", paymentNumber='" + paymentNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
