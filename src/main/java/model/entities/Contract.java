package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private int contract;
    private Date date;
    private double totalValue;
    private List<Installment> installment = new ArrayList();

    public Contract(){

    }

    public Contract(int contract, Date date, double totalValue) {
        this.contract = contract;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
    public void addInstallment( Installment installments){
        installment.add(installments);
    }

    public List<Installment> getInstallment() {
        return installment;
    }

}
