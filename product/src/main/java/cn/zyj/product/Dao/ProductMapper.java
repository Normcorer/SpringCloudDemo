package cn.zyj.product.Dao;

import org.apache.ibatis.annotations.Param;
import pojo.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> selectAll();

    List<Product> queryProductList(@Param("start") int start, @Param("rows") int limit1);

    int selectCount();

    Product selectOne(String productId);
}
