package COLLECTION;

public class Employee {
    private int eId;
    private String eName;
    private String ePosition;

    public Employee(int eId, String eName, String ePosition) {
        this.eId = eId;
        this.eName = eName;
        this.ePosition = ePosition;
    }

    public Employee() {
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getePosition() {
        return ePosition;
    }

    public void setePosition(String ePosition) {
        this.ePosition = ePosition;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", ePosition='" + ePosition + '\'' +
                '}';
    }
}
