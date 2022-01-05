package HomeWork16.Task2.Model;

import java.util.Objects;

public final class NewHeavyBox implements Comparable<NewHeavyBox> {
    private final int size;
    private final int weight;

    public NewHeavyBox(final int size, final int weight) {
        this.size = size;
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
        final NewHeavyBox heavyBox = (NewHeavyBox) o;
        return this.size == heavyBox.size && this.weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.size, this.weight);
    }

    @Override
    public String toString() {
        return "NewHeavyBox{" +
                "weight=" + weight +
                ", size=" + size +
                '}';
    }

    @Override
    public int compareTo(NewHeavyBox o) {
        if (getWeight() == o.getWeight()) {
            return getSize() - o.getSize();
        } else {
            return getWeight() - o.getWeight();
        }
    }
}
