package org.example.exerciceList;

import java.util.ArrayList;
import java.util.List;

public class Annuaire{

    private List<Company> companyList = new ArrayList<>();

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public void addCompany(String name, int siret, String address, String website){
        Company company = new Company(name, siret, address, website);
        companyList.add(company);
    }

    public void seeCompaniesNames(){
        for (Company companyName : companyList) System.out.println(companyName.getName());
    }

    public void seeCompaniesDetails(){
        for (Company company : companyList) System.out.println(company);
    }


}
