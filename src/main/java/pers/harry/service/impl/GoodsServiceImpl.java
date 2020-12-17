package pers.harry.service.impl;

import org.springframework.stereotype.Service;
import pers.harry.entity.Product;
import pers.harry.entity.Takeout;
import pers.harry.mapper.GoodsMapper;
import pers.harry.service.GoodsService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Product> queryProducts(int id ) {
        return goodsMapper.queryProducts(id);
    }

    @Override
    public void addTakeOut(Takeout takeout) {
        goodsMapper.addTakeOut(takeout);
        goodsMapper.updateQuantity(takeout);
    }

    @Override
    public List<String> queryProductName() {

        return goodsMapper.queryProductName();
    }
}
