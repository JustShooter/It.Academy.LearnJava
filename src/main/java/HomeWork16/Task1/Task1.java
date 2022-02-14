/**
 * Runner
 */
package main.java.HomeWork16.Task1;

import main.java.HomeWork16.Task1.Model.NewProduct;
import main.java.HomeWork16.Task1.Service.NewProductService;
import main.java.HomeWork16.Task1.Service.NewProductServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        NewProductService newProductService = new NewProductServiceImpl();
        Map<String, NewProduct> toys = fillMap(newProductService);
        newProductService.printMapEntrySet(toys);
        newProductService.printMapKeySet(toys);
        newProductService.printMapValues(toys);
        newProductService.printMapToString(toys);
    }

    private static Map<String, NewProduct> fillMap(NewProductService newProductService) {
        Map<String, NewProduct> toys = new HashMap<>();
        toys.put("Bear", newProductService.createNewProduct(12, 22));
        toys.put("Rabbit", newProductService.createNewProduct(9, 12));
        toys.put("Santa", newProductService.createNewProduct(6, 9));
        toys.put("Deer", newProductService.createNewProduct(15, 32));
        toys.put("Locomotive", newProductService.createNewProduct(18, 58));
        return toys;
    }

}
