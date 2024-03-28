package zera.pojo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;


public class Account {

    private String actno;

    private Double balance;


    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno == null ? null : actno.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}