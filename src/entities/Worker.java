package entities;

import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel levell;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts;

    public Worker(){

    }
    
    public Worker(String name, WorkerLevel levell, Double baseSalary, Department department) {
        this.name = name;
        this.levell = levell;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevell() {
        return levell;
    }

    public void setLevell(WorkerLevel levell) {
        this.levell = levell;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
    
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum  = baseSalary;
        Calendar cal  = Calendar.getInstance();
        for(HourContract contract: contracts){
            cal.setTime(contract.getDate());
            int cal_year = cal.get(Calendar.YEAR);
            int cal_month = cal.get(Calendar.MONTH) + 1;
            if((year == cal_year) && (cal_month == month) ){
                sum += contract.totalValue();
            }
        }
        return sum;
    }

}
