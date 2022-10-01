package Dao_project.dao;

import Dao_project.exception.CriminalException;
import Dao_project.model.Crime;
import Dao_project.model.Criminal;

import java.util.List;

public interface CrimeDao {
    public String getCriminalName(String crime)throws CriminalException;
    public List<Criminal> getAllCriminalDetails() throws CriminalException;
    public String getCrimeStatus(String name)throws CriminalException;
    public List<Crime> getCrimeFromArea() throws CriminalException;
    public int getNumberOfCrimeStatus(String status) throws CriminalException;

    public int getNumberOfCrimeInCurrentMonth() throws CriminalException;





}
