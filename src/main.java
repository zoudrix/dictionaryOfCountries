import countryInfo.*;

import java.util.List;

public class main
{
    public static void main(String args[])
    {
        String countryDatasetPath = "Dataset/Countries.csv";
        List<Country> countryList = new CountryDAOImpl().ReadPyramidCSVFile(countryDatasetPath);

        String cityDatasetPath = "Dataset/Cities.csv";
        List<City> cityList = new CityDAOImpl().ReadPyramidCSVFile(cityDatasetPath);

        CountryIndex countryIndex = new CountryIndex();
        countryIndex.BuildCountryIndex(countryList, cityList);

        countryIndex.GetSortedPopulation();
        countryIndex.getListOfCountriesPopulation();
        countryIndex.getAvreage();
        countryIndex.getMaxCountryPopulation();
        countryIndex.GetHighestPopulationCountryCity();
        countryIndex.GetHighestPopulationCapital(cityList);
    }
}
