public class Student extends Human {

    private int zach;
    private String fakultet;

    public Student() {
        super();
    }

    public Student(int zach, String fakultet) {
        this.zach = zach;
        this.fakultet = fakultet;
    }
    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String lastName, boolean sex, int age, int zach, String fakultet) {
        super(lastName, sex, age);
        this.zach = zach;
        this.fakultet = fakultet;
    }

    public Student(String name, int age, int zach, String fakultet) {
        super(name, age);
        this.zach = zach;
        this.fakultet = fakultet;
    }

    public int getZach() {
        return zach;
    }

    public void setZach(int zach) {
        this.zach = zach;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    @Override
    public String toString() {
        return System.lineSeparator() +
                "Student{" +
                "zach=" + zach +
                ", fakultet='" + fakultet + '\'' + ", LastName " +  super.getLastName()
                + ", Sex " + super.getStringSex() + ", Age = "+ super.getAge() +
                '}';
    }
}
