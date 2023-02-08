package entities;

import java.util.Date;

public class HourContract {
    
    private Date  date;
    private Double valuePerHora;
    private Integer hours;

    public  HourContract(){

    }

    public HourContract(Date date, Double valuePerHora, Integer hours) {
        this.date = date;
        this.valuePerHora = valuePerHora;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHora() {
        return valuePerHora;
    }

    public void setValuePerHora(Double valuePerHora) {
        this.valuePerHora = valuePerHora;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    
    public double totalValue(){
        return valuePerHora  * hours;
    }
    
}
