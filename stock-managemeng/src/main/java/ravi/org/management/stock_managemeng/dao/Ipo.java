package ravi.org.management.stock_managemeng.dao;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "ipo")

public class Ipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;                   // IPO ID
    private String companyName;          // Name of the company going public
    private BigDecimal priceBandLow;     // Lower price band
    private BigDecimal priceBandHigh;    // Higher price band
    private int lotSize;                  // Minimum number of shares per lot
    private LocalDate issueStartDate;    // IPO opening date
    private LocalDate issueEndDate;      // IPO closing date
    private String exchange;              // NSE/BSE etc.
    private BigDecimal issueSize;        // Total issue size in crores
    private String status;                // Upcoming, Open, Closed

    public Ipo() {
    }

    public Ipo(int id, String companyName, BigDecimal priceBandLow, BigDecimal priceBandHigh, int lotSize,
               LocalDate issueStartDate, LocalDate issueEndDate, String exchange, BigDecimal issueSize, String status) {
        this.id = id;
        this.companyName = companyName;
        this.priceBandLow = priceBandLow;
        this.priceBandHigh = priceBandHigh;
        this.lotSize = lotSize;
        this.issueStartDate = issueStartDate;
        this.issueEndDate = issueEndDate;
        this.exchange = exchange;
        this.issueSize = issueSize;
        this.status = status;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getPriceBandLow() {
        return priceBandLow;
    }

    public void setPriceBandLow(BigDecimal priceBandLow) {
        this.priceBandLow = priceBandLow;
    }

    public BigDecimal getPriceBandHigh() {
        return priceBandHigh;
    }

    public void setPriceBandHigh(BigDecimal priceBandHigh) {
        this.priceBandHigh = priceBandHigh;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public LocalDate getIssueStartDate() {
        return issueStartDate;
    }

    public void setIssueStartDate(LocalDate issueStartDate) {
        this.issueStartDate = issueStartDate;
    }

    public LocalDate getIssueEndDate() {
        return issueEndDate;
    }

    public void setIssueEndDate(LocalDate issueEndDate) {
        this.issueEndDate = issueEndDate;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public BigDecimal getIssueSize() {
        return issueSize;
    }

    public void setIssueSize(BigDecimal issueSize) {
        this.issueSize = issueSize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
