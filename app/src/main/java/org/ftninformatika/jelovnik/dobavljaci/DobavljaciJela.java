package org.ftninformatika.jelovnik.dobavljaci;

import org.ftninformatika.jelovnik.model.Jela;
import org.ftninformatika.jelovnik.model.Kategorija;

import java.util.ArrayList;
import java.util.List;

public class DobavljaciJela {

    private static List<Jela> jela;
    private static List<Kategorija> kategorije;
    private static List<String> dummy;

    private void popuniKategoriju() {
        if (kategorije == null) {
            kategorije = new ArrayList<>();
            kategorije.add(new Kategorija(0, "Predjelo"));
            kategorije.add(new Kategorija(1, "Supe"));
            kategorije.add(new Kategorija(2, "Glavno jelo"));
            kategorije.add(new Kategorija(3, "Salate"));
            kategorije.add(new Kategorija(4, "Dezerti"));
            kategorije.add(new Kategorija(5, "prilozi"));
        }
    }

        private void popuniJela () {
            if (jela != null) {
                popunidummy();
                jela = new ArrayList<>();
                jela.add(new Jela(928, "Spagete", 5, dummy, 500));
                jela.add(new Jela(35, "Suvi vrat", 0, dummy, 230));
                jela.add(new Jela(25, "Pileca supa", 1, dummy, 600));
                jela.add(new Jela(432, "Sopska salata", 3, dummy, 460));
                jela.add(new Jela(6, "Palacinka", 4, dummy, 150));
            }
        }

        private void popunidummy () {
            if (dummy == null) {
                dummy = new ArrayList<>();
                dummy.add("Prsuta");
                dummy.add("Mocarela");
                dummy.add("Paradajiz");
                dummy.add("Pavlaka");
                dummy.add("Brasno");
                dummy.add("Slanina");
                dummy.add("Piletina");
            }
        }


        public Kategorija getKategorijaById ( int id){
            switch (id) {
                case 0:
                    return kategorije.get(0);
                case 1:
                    return kategorije.get(1);
                case 2:
                    return kategorije.get(2);
                case 3:
                    return kategorije.get(3);
                case 4:
                    return kategorije.get(4);
                case 5:
                    return kategorije.get(5);
                    default:
                        return null;
            }

        }


    }



