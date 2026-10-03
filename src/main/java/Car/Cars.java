package Car;

import java.util.ArrayList;

public class Cars {



    private String companyName;
    private String modelName;
    private String manufacturingDate;
    private static ArrayList<Cars> carsArrayList = new ArrayList<>();

    public Cars(String companyName,String modelName, String manufacturingDate){
        this.companyName=companyName;
        this.modelName=modelName;
        this.manufacturingDate=manufacturingDate;
        carsArrayList.add(this);
    }

    public static long getTotalCarsByCompanyName(String companyName) {
        int count = 0;
        for(Cars c: carsArrayList){
            if(c.companyName.equals(companyName)){
                count++;
            }
        }
        return carsArrayList.stream().filter(a-> a.companyName == companyName).count();
    }

    @Override
    public String toString() {
        return "Cars{" +
               "companyName='" + companyName + '\'' +
               ", modelName='" + modelName + '\'' +
               ", manufacturingDate='" + manufacturingDate + '\'' +
               '}';
    }

}
