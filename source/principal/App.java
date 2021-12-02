package principal;

import components.*;

public class App {
    public static void main(String[] args) throws Exception {

        Cd cd = new Cd();
        Dvd dvd = new Dvd();
        dvd.inserirDados();
        dvd.printDados();
        cd.inserirDados();
        cd.printDados();

    }
}
