package Person;

import java.util.Date;

public class Staff extends Employee{
    public String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date hireDate, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, hireDate);
        this.title = title;
    }

    public Staff(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
