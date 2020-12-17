package pers.harry.mapper;

import pers.harry.entity.Product;
import pers.harry.entity.Takeout;

import java.util.List;

public interface GoodsMapper {
    /**
     * 根据产品id查询产品信息
     * @param id
     * @return
     */
    List<Product> queryProducts(int id);

    /**
     * 查询所有产品名
     * @return
     */
    List<String> queryProductName();

    /**
     * 添加出库信息
     * @param takeout
     * @return
     */
    int addTakeOut(Takeout takeout);

    /**
     * 修改产品库存
     * @param takeout
     * @return
     */
    int updateQuantity(Takeout takeout);
}
