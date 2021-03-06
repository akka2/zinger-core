package com.food.ordering.zinger.model;

public class TransactionModel {
    private String transactionId;
    private String bankTransactionId;
    private Double transactionAmount;
    private String currency;
    private String responseCode;
    private String responseMessage;
    private String gatewayName;
    private String bankName;
    private String paymentMode;
    private String checksumHash;
    private OrderModel orderModel;

    public TransactionModel() {
        orderModel = new OrderModel();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getBankTransactionId() {
        return bankTransactionId;
    }

    public void setBankTransactionId(String bankTransactionId) {
        this.bankTransactionId = bankTransactionId;
    }

    public Double transactionAmountGet() {
        return transactionAmount;
    }

    public void transactionAmountSet(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getChecksumHash() {
        return checksumHash;
    }

    public void setChecksumHash(String checksumHash) {
        this.checksumHash = checksumHash;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public OrderModel getOrderModel() {
        return orderModel;
    }

    public void setOrderModel(OrderModel orderModel) {
        this.orderModel = orderModel;
    }

    @Override
    public String toString() {
        return "TransactionModel{" +
                "transactionId='" + transactionId + '\'' +
                ", bankTransactionId='" + bankTransactionId + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", currency='" + currency + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                ", gatewayName='" + gatewayName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", checksumHash='" + checksumHash + '\'' +
                ", orderModel=" + orderModel +
                '}';
    }
}
