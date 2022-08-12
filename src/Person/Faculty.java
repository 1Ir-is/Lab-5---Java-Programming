package Person;

import java.util.Date;

public class Faculty extends Employee{
    public Date officeTime;
    public String rank;

    public Faculty(Date officeTime, String rank) {
        this.officeTime = officeTime;
        this.rank = rank;
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date hireDate, Date officeTime, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, hireDate);
        this.officeTime = officeTime;
        this.rank = rank;
    }

    public Date getOfficeTime() {
        return officeTime;
    }

    public void setOfficeTime(Date officeTime) {
        this.officeTime = officeTime;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officeTime=" + officeTime +
                ", rank='" + rank + '\'' +
                '}';
    }
}
