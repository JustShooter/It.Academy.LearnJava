package main.java.HomeWork14.Task3.Model;

import java.util.Objects;

public final class Product {
    private final int toySize;
    private final int toyPrice;

    public Product(final int toySize, final int toyPrice) {
        this.toySize = toySize;
        this.toyPrice = toyPrice;
    }

    public int getToySize() {
        return this.toySize;
    }

    public int getToyPrice() {
        return this.toyPrice;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Product product = (Product) o;
        return this.toySize == product.toySize && this.toyPrice == product.toyPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toySize, this.toyPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "toySize=" + toySize +
                ", toyPrice=" + toyPrice +
                '}';
    }
}
