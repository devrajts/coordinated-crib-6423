package Dao_project.usercase;

import Dao_project.dao.CrimeDao;
import Dao_project.dao.CrimeDaoImpl;
import Dao_project.exception.CriminalException;
import Dao_project.model.Crime;

import java.util.List;

public class AreaWiseCrime {
    public static void main(String[] args) {
        CrimeDao cd = new CrimeDaoImpl();

        try {
            List<Crime> cm = cd.getCrimeFromArea();
            for(Crime c : cm){
                System.out.println("Criminal name : "+c.getName());
                System.out.println("Committed crime : "+c.getDescription());
                System.out.println("Committed place : "+c.getPlace());
                System.out.println("-------------------------------------");
            }
        } catch (CriminalException e) {
            throw new RuntimeException(e);
        }
    }
}
