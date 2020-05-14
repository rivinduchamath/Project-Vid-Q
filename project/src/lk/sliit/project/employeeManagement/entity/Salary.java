package lk.sliit.project.employeeManagement.entity;

import javax.persistence.*;

/**
 * @author: Chanuka
 * Date: 19-Mar-20
 */
@Entity//Emplyee Salary Table
public class Salary implements SuperEntity {

    @Id
    private String SalaryId;
    @Column(nullable = true)
    private double basicSalary;
    @Column(nullable = true)
    private double otHours;
    @Column(nullable = true)
    private double otRate;
    @Column(nullable = true)
    private double bonus;
    @Column(nullable = true)
    private double incomeTax;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "employeeID", referencedColumnName = "idNo", nullable = true)
    private Employee employeeID;

    //No arg constructor
    public Salary() {}

    //Add Full Arg Constructor
    public Salary(String salaryId, double basicSalary, double otHours, double otRate, double bonus, double incomeTax, Employee employeeID) {
        SalaryId = salaryId;
        this.basicSalary = basicSalary;
        this.otHours = otHours;
        this.otRate = otRate;
        this.bonus = bonus;
        this.incomeTax = incomeTax;
        this.employeeID = employeeID;
    }

    //Getters And Setters
    public String getSalaryId() {
        return SalaryId;
    }

    public void setSalaryId(String salaryId) {
        SalaryId = salaryId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getOtHours() {
        return otHours;
    }

    public void setOtHours(double otHours) {
        this.otHours = otHours;
    }

    public double getOtRate() {
        return otRate;
    }

    public void setOtRate(double otRate) {
        this.otRate = otRate;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        this.incomeTax = incomeTax;
    }


    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    //Override toString
    @Override
    public String toString() {
        return "Salary{" +
                "SalaryId='" + SalaryId + '\'' +
                ", basicSalary=" + basicSalary +
                ", otHours=" + otHours +
                ", otRate=" + otRate +
                ", bonus=" + bonus +
                ", incomeTax=" + incomeTax +
                ", employeeID=" + employeeID +
                '}';
    }//End toString Method
}//End Class
