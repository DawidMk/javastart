package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Student extends Person implements NameHolder{
    private Integer indexNo;
    private BigDecimal scholarship;

//    public Student() {
//    }

    public Student(String firstName, String lastName, Integer personId, Integer age, Integer indexNo, BigDecimal scholarship) {
        super(firstName, lastName, personId, age);
        this.indexNo = indexNo;
        this.scholarship = scholarship;
    }

    @Override
    public BigDecimal showIncome() {
        return scholarship;
    }

    @Override
    public String showYourName() {
        return getFirstName()+" "+getLastName();
    }

    public void introduction() {
        super.introduction();
        System.out.print(" i studenciakiem");
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public BigDecimal getScholarship() {
        return scholarship;
    }

    public void setScholarship(BigDecimal scholarship) {
        this.scholarship = scholarship;
    }
}
