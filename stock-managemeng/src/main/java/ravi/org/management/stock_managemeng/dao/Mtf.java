package ravi.org.management.stock_managemeng.dao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Mtf {

    private String id;                   // MTF record ID
    private String customerId;           // Customer ID
    private String shareSymbol;          // Stock symbol
    private int quantity;                 // Number of shares under MTF
    private BigDecimal loanAmount;       // Loan amount taken
    private BigDecimal interestRate;     // Annual interest rate
    private BigDecimal marginPercentage; // Margin requirement
    private LocalDate startDate;         // MTF start date
    private LocalDate expiryDate;        // MTF expiry date
    private String status;               // Active, Closed, Overdue

    public Mtf() {
    }

    public Mtf(String id, String customerId, String shareSymbol, int quantity, BigDecimal loanAmount,
               BigDecimal interestRate, BigDecimal marginPercentage, LocalDate startDate,
               LocalDate expiryDate, String status) {
        this.id = id;
        this.customerId = customerId;
        this.shareSymbol = shareSymbol;
        this.quantity = quantity;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.marginPercentage = marginPercentage;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
        this.status = status;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getShareSymbol() {
        return shareSymbol;
    }

    public void setShareSymbol(String shareSymbol) {
        this.shareSymbol = shareSymbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getMarginPercentage() {
        return marginPercentage;
    }

    public void setMarginPercentage(BigDecimal marginPercentage) {
        this.marginPercentage = marginPercentage;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
