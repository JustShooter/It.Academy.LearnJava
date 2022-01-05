/**
 * NewProduct class
 */
package HomeWork16.Task1.Model;

import java.util.Objects;

public final class NewProduct {
    private final int toySize;
    private final int toyPrice;

    public NewProduct(final int toySize, final int toyPrice) {
        this.toySize = toySize;
        this.toyPrice = toyPrice;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final NewProduct newProduct = (NewProduct) o;
        return this.toySize == newProduct.toySize && this.toyPrice == newProduct.toyPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toySize, this.toyPrice);
    }

    @Override
    public String toString() {
        return "NewProduct{" +
                "toySize=" + toySize +
                ", toyPrice=" + toyPrice +
                '}';
    }
}
