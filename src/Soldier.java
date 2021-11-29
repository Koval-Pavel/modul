public class Soldier extends Man{

    private String Name;
    private int Age;
    private Man Comander;

    public Soldier (String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public void setAge(int age) {
        Age = age;
    }

    @Override
    public void CanReport() {
        System.out.println("my boss" + Comander);
    }

    public Man getComander() {
        return Comander;
    }

    public void setComander(Man comander) {
        Comander = comander;
    }
}
