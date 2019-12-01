package cn.zyj.search.untils;

import org.springframework.stereotype.Component;
import pojo.Product;

@Component
public class ProductFallBack implements ProductHttpClient{
    @Override
    public Product selectOne(String productId) {
        return null;
    }
}
