package ravi.org.management.stock_managemeng.dao;

import java.math.BigDecimal;

public class Share {
    //this is entity class
    private String id;
    private String symbol;
    private String companyName;
    private Integer quantity;
    private BigDecimal purchasePrice;
    private BigDecimal currentPrice;
    private String purchaseDate;
    private String exchange;
    private String sector;
    private String currency;

}
