public class Man implements WarAcctionsOk {

    private String Name;
    private int Age;
    private Man Comander;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public void CanFight() {
        System.out.println("I Can Fight!");
    }

    @Override
    public void CanReport() {

    }
}
