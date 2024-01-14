public class PD6_16 {
    public static void main(String[] args) {
        double[] januarylArray = {-11.5, -10.3, -12, -6.5, -5, -15.5};
        double avJanArray = 0;
        double sumJan = 0;
        double[] februarylArray = {-16, -14.5, -11, -10.3, -3.5, 0};
        double avFebAr = 0;
        double sumFeb = 0;
        double[] marchlArray = {-3, -2.5, 0, 5, 9.5, 11.2};
        double avMarAr = 0;
        double sumMar = 0;

//vidurkis january
        for (double elementJ : januarylArray){
            avJanArray = (sumJan += elementJ)/ januarylArray.length;
        }
        //vidurkis february
        for (double elementF : februarylArray){
            avFebAr = (sumFeb += elementF)/ februarylArray.length;
        }
        //vidurkis march

        for (double elementM : marchlArray){
            avMarAr = (sumMar += elementM)/ marchlArray.length;
        }

        //Bendras atliktų matavimų vidurkis


        System.out.println("Vidutinė sausio temperatūra:"+ " "+ String.format("%.2f", avJanArray));
        System.out.println("Vidutinė vasario temperatūra:"+ " "+String.format("%.2f", avFebAr));
        System.out.println("Vidutinė kovo temperatūra:"+ " "+String.format("%.2f", avMarAr));
        System.out.println("Bendras atliktų matavimų vidurkis:"+ " "+ String.format("%.2f",((avFebAr+avMarAr+avJanArray)/3)));

    }
}
//Kiekvieną dieną yra atliekami oro temperatūros matavimai. Matavimai yra atliekami vieną kartą
//per dieną. Matavimų rezultatai yra surašomi į lentelę: menėsio diena - temperatūra. Parašykite
//programą, skaičiuojančią kiekvieno mėnesio vidutinę temperatūrą ir bendrą vidutinę temperatūrą
