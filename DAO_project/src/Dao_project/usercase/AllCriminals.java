package Dao_project.usercase;

import Dao_project.dao.CrimeDao;
import Dao_project.dao.CrimeDaoImpl;
import Dao_project.exception.CriminalException;
import Dao_project.model.Criminal;

import java.util.List;

public class AllCriminals {
    public static void main(String[] args) {
        CrimeDao cd = new CrimeDaoImpl();

        try {
            List<Criminal> crm = cd.getAllCriminalDetails();
            for(Criminal c : crm){
                System.out.println("Criminal name : "+c.getName());
                System.out.println("Criminal age : "+c.getAge());
                System.out.println("Criminal gender : "+c.getGender());
                System.out.println("Criminal address : "+c.getAddress());
                System.out.println("Criminal identifying Marks : "+c.getIdentifyingMarks());
                System.out.println("Area of crime : "+c.getCrimeArea());
                System.out.println("Committed crime : "+c.getCrimeName());
                System.out.println("==========================================================");
            }
        } catch (CriminalException e) {
            throw new RuntimeException(e);
        }
    }
}
