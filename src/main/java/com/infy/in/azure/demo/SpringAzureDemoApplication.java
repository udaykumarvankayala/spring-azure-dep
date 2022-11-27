package com.infy.in.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

    public List<Country> createCountryList()
    {
        Country indiaCountry=new Country(1, "India");
        Country chinaCountry=new Country(4, "China");
        Country nepalCountry=new Country(3, "Nepal");
        Country bhutanCountry=new Country(2, "Bhutan");

        List<Country> listOfCountries = new ArrayList<Country>();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(chinaCountry);
        listOfCountries.add(nepalCountry);
        listOfCountries.add(bhutanCountry);
        return listOfCountries;
    }
    @GetMapping("/msg")

    public List<Country> getCountries()
    {
        List<Country> listOfCountries = new ArrayList<Country>();
        listOfCountries=createCountryList();
        return listOfCountries;
    }
     /*public String message(){
         return "congrats uday good job super good super";

    }*/

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }

}
