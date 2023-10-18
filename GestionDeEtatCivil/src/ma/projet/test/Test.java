/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import ma.projet.beans.Mariage;
import ma.projet.beans.MariageKey;
import ma.projet.service.FemmeService;
import ma.projet.service.HommeService;
import ma.projet.service.MariageService;

/**
 *
 * @author kawta
 */
public class Test {

    public static void main(String[] args) {
        HommeService hs = new HommeService();
        FemmeService fs = new FemmeService();
        MariageService ms = new MariageService();
        
        Homme h1 = new Homme("SAFI", "SAID", "57711628", "mamb", new Date(1984 - 1900, 4, 3));
        Homme h2 = new Homme("hnome 1", "hprenome 1", "57711628", "jkuh", new Date(1994 - 1900, 4, 3));
        Homme h3 = new Homme("hnome 2", "hprenome 2", "57711628", "mamb", new Date(1987 - 1900, 4, 3));
        Homme h4 = new Homme("hnome 3", "hprenome 3", "57711628", "jkuh", new Date(1999 - 1900, 4, 3));
        Homme h5 = new Homme("hnome 4", "hprenome 4", "57711628", "mamb", new Date(1982 - 1900, 4, 3));
        Femme f1 =  new Femme("RAMI", "SALIMA", "57711628", "mambahgf", new Date(1987 - 1900, 4, 3));
        Femme f2 = new Femme("AMAL", "ALI", "57711628", "grgr", new Date(1984 - 1900, 8, 13));
        Femme f3 =  new Femme("WAFA", "ALAOUI", "57711628", "mambahgf", new Date(1988 - 1900, 4, 3));
        Femme f4 = new Femme("KARIMA", "ALAMI", "57711628", "grgr", new Date(1987 - 1900, 2, 3));
        Femme f5 =  new Femme("mamnamey 1", "papnamey 1", "57711628", "mambahgf", new Date(1992 - 1900, 1, 5));
        Femme f6 = new Femme("mamnamey 2", "papnamey 2", "57711628", "grgr", new Date(1995 - 1900, 4, 3));
        Femme f7 =  new Femme("mamnamey 3", "papnamey 3", "57711628", "mambahgf", new Date(1980 - 1900, 4, 3));
        Femme f8 = new Femme("mamnamey 4", "papnamey 4", "57711628", "grgr", new Date(1979 - 1900, 4, 3));
        Femme f9 =  new Femme("mamnamey 5", "papnamey 5", "57711628", "mambahgf", new Date(1988 - 1900, 11, 3));
        Femme f10 = new Femme("mamnamey 6", "papnamey 6", "57711628", "grgr", new Date(1984 - 1900, 6, 3));
        
        hs.create(h1);
        hs.create(h2);
        hs.create(h3);
        hs.create(h4);
        hs.create(h5);
        fs.create(f1);
        fs.create(f2);
        fs.create(f3);
        fs.create(f4);
        fs.create(f5);
        fs.create(f6);
        fs.create(f7);
        fs.create(f8);
        fs.create(f9);
        fs.create(f10);
        
        
        // h1 et f1
        Mariage m = new Mariage();
        m.setId(new MariageKey(h1.getId(), f6.getId()));
        m.setDateDebut(new Date(1990 - 1900, 8, 3));
        m.setDateFin(null);
        m.setNbrEnfant(4);
        m.setFemme(f1);
        m.setHomme(h1);
        
        
        f1.getMariage().add(m);
        h1.getMariage().add(m);
        
        // h1 et f2
        Mariage m2 = new Mariage();
        m.setId(new MariageKey(h1.getId(), f2.getId()));
        m2.setDateDebut(new Date(1995 - 1900, 8, 3));
        m2.setDateFin(null);
        m2.setNbrEnfant(2);
        m2.setFemme(f2);
        m2.setHomme(h1);
        
        f2.getMariage().add(m2);
        h1.getMariage().add(m2);
        
        // h1 et f3
        Mariage m3 = new Mariage();
        m3.setId(new MariageKey(h1.getId(), f3.getId()));
        m3.setDateDebut(new Date(2000 - 1900, 10, 4));
        m3.setDateFin(null);
        m3.setNbrEnfant(3);
        m3.setFemme(f3);
        m3.setHomme(h1);
        
        f3.getMariage().add(m3);
        h1.getMariage().add(m3);
        
        // h1 et f4
        Mariage m4 = new Mariage();
        m4.setId(new MariageKey(h1.getId(), f4.getId()));
        m4.setDateDebut(new Date(1989 - 1900, 8, 3));
        m4.setDateFin(new Date(1990 - 1900, 8, 3));
        m4.setNbrEnfant(0);
        m4.setFemme(f4);
        m4.setHomme(h1);
        
        f4.getMariage().add(m4);
        h1.getMariage().add(m4);
        
        
        // h3 et f6
        Mariage m5 = new Mariage();
        m5.setId(new MariageKey(h3.getId(), f6.getId()));
        m5.setDateDebut(new Date(2015 - 1900, 4, 18));
        m5.setDateFin(new Date(2020 - 1900, 5, 3));
        m5.setNbrEnfant(1);
        m5.setFemme(f6);
        m5.setHomme(h3);
        
        f6.getMariage().add(m5);
        h3.getMariage().add(m5);
        
        
        // h2 et f4
        Mariage m6 = new Mariage();
        m6.setId(new MariageKey(h2.getId(), f4.getId()));
        m6.setDateDebut(new Date(1995 - 1900, 4, 18));
        m6.setDateFin(null);
        m6.setNbrEnfant(3);
        m6.setFemme(f4);
        m6.setHomme(h2);
        
        f4.getMariage().add(m6);
        h2.getMariage().add(m6);
        
        
        
        ms.create(m);
        ms.create(m2);
        ms.create(m3);
        ms.create(m4);
        ms.create(m5);
        ms.create(m6);
        
  
        // Display the lists of women
        for(Femme f : fs.getAll()){
            System.out.println(f);
        }
        
        // Display the oldest woman
        Femme femmePlusAge = fs.getById(7);
        for(Femme f : fs.getAll()){
            if(f.getDateNaissance().compareTo(femmePlusAge.getDateNaissance()) == -1){
                femmePlusAge = f;
            }
        }
        System.out.println("\n Oldest Woman : " + femmePlusAge);
      
        // To display the wives of man 
        hs.affichierEpousesPasseDunHomme(hs.getById(1), new Date(1988 - 1900, 0, 1), new Date());
            
        // To count the number of children of woman 3 given between two dates
        
        System.out.println(fs.nombredEnfantDuneFemme(fs.getById(9), new Date(1989 - 1900, 0, 1), new Date(1998 - 1900, 0, 1)));
            
        //  Display the list of women married two times or more
        
        System.out.println("\n The list of women married two or more times: ");
        for(Femme f : fs.femmeMarieesAuMoisDeuxFois()){
            System.out.println(f);    
        }
        System.out.println();
            
        // Display the number of men who are married to four women between two dates
        
        System.out.println("Display those who are married to four women between two dates : ");
        System.out.println(hs.getNbrHommesMaries4Femmes( new Date(1989 - 1900, 0, 1),  new Date(2001 - 1900, 0, 1)));
        System.out.println();
            
        // Display the marriages of a man passed as a parameter
        
        hs.getLesMariagesDunHommePassé(h1);
    }
    
}
