/**
 * NewProduct Service
 */
package HomeWork16.Task1.Service;

import HomeWork16.Task1.Model.NewProduct;

import java.util.Map;

public interface NewProductService {
    NewProduct createNewProduct(int size, int price);

    void printMapEntrySet(Map<String, NewProduct> toys);

    void printMapKeySet(Map<String, NewProduct> toys);

    void printMapValues(Map<String, NewProduct> toys);

    void printMapToString(Map<String, NewProduct> toys);
}
