package lt.techin;

public class automobilis {
    String marke;
    String modelis;
    int metai;


    public automobilis(String marke, String modelis, int metai) {
        this.marke = marke;
        this.modelis = modelis;
        this.metai = metai;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }
    void displayInfo(){
        System.out.println(marke + " " + modelis + " " +  metai);

    }
}

