package club.banyuan.Demo;

import java.util.Objects;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/1 2:07 下午
 */
public class Product {
    private String Id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String id, String name, double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(Id, product.Id) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
