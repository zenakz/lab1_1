package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

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
}
