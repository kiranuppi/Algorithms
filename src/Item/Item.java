package Item;

import java.math.BigDecimal;

public class Item {
    String name;
    Integer count;
    BigDecimal price;

    public Item(String name, Integer count, BigDecimal price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
