/**
 * NewProduct Service Implementation
 */

package HomeWork16.Task1.Service;

import HomeWork16.Task1.Model.NewProduct;

import java.util.Map;

public class NewProductServiceImpl implements NewProductService {

    /**
     * Creates NewProduct object
     *
     * @param size  Product size
     * @param price Product price
     * @return Returns object of NewProduct
     */
    @Override
    public NewProduct createNewProduct(int size, int price) {
        return new NewProduct(size, price);
    }

    /**
     * Print EntrySet of Map collection
     *
     * @param toys Collection of NewProduct objects
     */
    @Override
    public void printMapEntrySet(Map<String, NewProduct> toys) {
        System.out.println(toys.entrySet());
    }

    /**
     * Print KeySet of Map collection
     *
     * @param toys Collection of NewProduct objects
     */
    @Override
    public void printMapKeySet(Map<String, NewProduct> toys) {
        System.out.println(toys.keySet());
    }

    /**
     * Print Values of Map collection
     *
     * @param toys Collection of NewProduct objects
     */
    @Override
    public void printMapValues(Map<String, NewProduct> toys) {
        System.out.println(toys.values());
    }

    /**
     * Print Map collection by using toString method
     * witch is implemented in NewProduct class
     *
     * @param toys Collection of NewProduct objects
     */
    @Override
    public void printMapToString(Map<String, NewProduct> toys) {
        System.out.println(toys.toString());
    }
}
