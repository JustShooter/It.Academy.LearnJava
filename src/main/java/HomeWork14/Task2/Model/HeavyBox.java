package HomeWork14.Task2.Model;

import java.util.Objects;

public class HeavyBox {
    private int size;
    private int weight;

    public HeavyBox(final int size, final int weight) {
        this.size = size;
        this.weight = weight;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final HeavyBox heavyBox = (HeavyBox) o;
        return this.size == heavyBox.size && this.weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.size, this.weight);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "size=" + size +
                ", weight=" + weight +
                '}';
    }
}
