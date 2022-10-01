package Dao_project.usercase;

import Dao_project.dao.CrimeDao;
import Dao_project.dao.CrimeDaoImpl;
import Dao_project.exception.CriminalException;

import java.util.Scanner;

public class getStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter criminal name to get the crime status :");
        System.out.println("Example : Raj , john, cena");
        System.out.println("--------------------------------------------------");
        String cname = sc.next();

        CrimeDao cd = new CrimeDaoImpl();

        try {
            String result = cd.getCrimeStatus(cname);
            System.out.println("Status of a criminal "+cname+" is "+result);
        } catch (CriminalException e) {
            System.out.println(e.getMessage());
        }
    }
}
