//Realizuokite parduotuvės funkcionalumą. Parduotuvė parduoda prekes: maisto prekes, alkoholinius gėrimus, knygas ir laikraščius. Bet kokios parduodamos prekės savybė:
//Ê Pavadinimas
//Ê Kaina
//Prekė žino savo kaina ir kainą su PVM. Apie PVM tarifus galite paskaityti čia: ”Pridėtinės
//vertės mokestis”. Klientai gali apsipirkti parduotuvėje ir nupirkti bet kokias ir bet kiek prekių.
//Apmokant prekių krepšelį klientui turi būti nurodoma bendra prekių kaina, kaina su PVM ir kaina
//doleriais pagal galiojanti šiai dienai Eur / USD keitimo kursą. Taip pat parduotuvėje gali vykti
//įvairios akcijos, tad klientui turi būti pritaikomos nuolaidos jei tokios priklauso.
package techin.lt.pd9_2;

import techin.lt.pd9_2.Contoles.ShoppingCart;
import techin.lt.pd9_2.product_groups.Alkohol;
import techin.lt.pd9_2.product_groups.Food;
import techin.lt.pd9_2.product_groups.Medicine;

public class Main {
    public static void main(String[] args) {
        Food bread = new Food("Vilniaus duona", 1, 20);
        Medicine panadol = new Medicine("Panadol", 2.50, 10);
        Alkohol likeris = new Alkohol("Bosca", 15.0, 0);

    ShoppingCart myShopingCart = new ShoppingCart();
    myShopingCart.addItem(bread);
    myShopingCart.addItem(panadol);
    myShopingCart.addItem(likeris);

        System.out.println(myShopingCart.getTotalPrice() + " Eur");
        System.out.println(myShopingCart.getTotalPriceWithVat() + " Eur + VAT");
        System.out.println(myShopingCart.getPriceInUSD(1.0877) + " USD");


    }
}
