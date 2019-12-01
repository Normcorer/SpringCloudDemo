package cn.zyj.search.untils;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Product;

@FeignClient(value = "productService-config",fallback = ProductFallBack.class)
public interface ProductHttpClient {
    @RequestMapping("/selectOne/{productId}")
    public Product selectOne(@PathVariable String productId);
}
