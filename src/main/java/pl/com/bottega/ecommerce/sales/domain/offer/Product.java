package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;
import java.util.Objects;

public class Product {
    private String id;
    private String type;
    private String name;
    private Date snapshotDate;
    private Money price;

    public Product(String id, String type, String name, Date snapshotdate, Money price){
        this.id=id;
        this.type=type;
        this.name=name;
        this.snapshotDate =snapshotdate;
        this.price=price;
    }

    public String getId() {
        return id;
    }

    public Money getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Product product = (Product) obj;
        return Objects.equals(getId(), product.getId()) &&
               Objects.equals(getPrice(), product.getPrice()) &&
               Objects.equals(getName(), product.getName()) &&
               Objects.equals(getSnapshotDate(), product.getSnapshotDate()) &&
               Objects.equals(getType(), product.getType());
    }
}
