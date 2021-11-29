public class Comander extends Man {

    private String ComName;
    private int ComAge;

    private Soldier S1;
    private Soldier S2;
    private Soldier S3;
    private Man G;

    public Comander (String ComName, int ComAge,  Soldier S1, Soldier S2, Soldier S3){
        this.S1 = S1;
        this.S2 = S2;
        this.S3 = S3;
        this.ComName = ComName;
        this.ComAge = ComAge;
    }

    public String getComName() {
        return ComName;
    }

    public void setComName(String comName) {
        ComName = comName;
    }

    public int getComAge() {
        return ComAge;
    }

    public void setComAge(int comAge) {
        ComAge = comAge;
    }

    public Soldier getS1() {
        return S1;
    }

    public void setS1(Soldier s1) {
        S1 = s1;
    }

    public Soldier getS2() {
        return S2;
    }

    public void setS2(Soldier s2) {
        S2 = s2;
    }

    public Soldier getS3() {
        return S3;
    }

    public void setS3(Soldier s3) {
        S3 = s3;
    }

    public Man getComander() {
        return G;
    }

    public void setComander(Man g) {
        G = g;
    }
}
