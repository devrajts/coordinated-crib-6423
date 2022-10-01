package Dao_project.usercase;

import Dao_project.dao.CrimeDao;
import Dao_project.dao.CrimeDaoImpl;
import Dao_project.exception.CriminalException;

public class getCrimeCount {
    public static void main(String[] args) {

        CrimeDao cd = new CrimeDaoImpl();

        try {
            int result = cd.getNumberOfCrimeInCurrentMonth();
            System.out.println("Total number of crimes in a current month is "+result);
        } catch (CriminalException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
