public class General extends Man {

    private String name;
    private int age;
    private Comander c1;
    private Comander c2;

    public General(String name, int age, Comander c1, Comander c2) {
        this.name = name;
        this.age = age;
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public Comander getC1() {
        return c1;
    }

    public void setC1(Comander c1) {
        this.c1 = c1;
    }

    public Comander getC2() {
        return c2;
    }

    public void setC2(Comander c2) {
        this.c2 = c2;
    }
}
