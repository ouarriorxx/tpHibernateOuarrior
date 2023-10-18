/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author kawta
 */

@Entity
public class Homme extends Personne {
    
    @OneToMany(mappedBy="homme", fetch= FetchType.EAGER)
    private List<Mariage> mariage = new ArrayList<>();
    
    public Homme() {
    }
    
    public Homme(String nom, String prenom, String telephone, String address, Date dateNaissance) {
        super(nom, prenom, telephone, address, dateNaissance);
    }

    public List<Mariage> getMariage() {
        return mariage;
    }

    public void setMariage(List<Mariage> mariage) {
        this.mariage = mariage;
    }

    @Override
    public String toString() {
        return  "Homme" + super.toString() + ", mariage=" + mariage + '}';
    }
    
}
