package Person;

public class Student extends Person{
    public Status status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "status=" + status +
                '}';
    }
}

