package pers.harry.service;

import jdk.nashorn.internal.parser.Token;
import pers.harry.entity.Product;
import pers.harry.entity.Takeout;

import java.util.List;

public interface GoodsService {
    List<Product> queryProducts(int id);

    void addTakeOut(Takeout takeout);

    List<String> queryProductName();
}
