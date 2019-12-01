package cn.zyj.product.Controller;


import cn.zyj.product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Gg;
import pojo.Product;
import untils.EasyUIResult;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/selectAll")
    public List<Product> selectAll(){
        return  productService.selectAll();
    }

    @CrossOrigin
    @RequestMapping("/pageManager")
    public EasyUIResult page(String page, String limit){
        return productService.page(page,limit);
    }

    @RequestMapping("/selectOne/{productId}")
    public Product selectOne(@PathVariable  String productId){
        return productService.selectOne(productId);
    }

    @RequestMapping("/gg")
    public Gg getGg(){
       return productService.getGg();
    }
}

