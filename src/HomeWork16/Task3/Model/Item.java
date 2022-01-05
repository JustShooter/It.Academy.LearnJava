package HomeWork16.Task3.Model;

import java.util.Objects;

public final class Item {
    private final String name;
    private final double price;
    private final int rating; // from 1 to 10

    public Item(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && rating == item.rating && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }

    @Override
    public String toString() {
        return name +
                ", цена=" + price +
                ", рейтинг=" + rating;
    }

}
