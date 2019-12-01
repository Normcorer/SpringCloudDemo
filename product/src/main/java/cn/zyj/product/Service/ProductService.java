package cn.zyj.product.Service;

import cn.zyj.product.Config.ZyjProperties;
import cn.zyj.product.Dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Gg;
import pojo.Product;
import untils.EasyUIResult;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ZyjProperties zyjProperties;
    public List<Product> selectAll() {
       return productMapper.selectAll();
    }

    public EasyUIResult page(String page, String limit) {
        int page1=Integer.parseInt(page);
        int limit1 = Integer.parseInt(limit);
        int start = (page1-1)*limit1;
        List<Product> pList =productMapper.queryProductList(start,limit1);
        EasyUIResult result = new EasyUIResult();
        int total = productMapper.selectCount();
        result.setRows(pList);
        result.setTotal(total);
        return result;
    }

    public Product selectOne(String productId) {
        return  productMapper.selectOne(productId);
    }

    public Gg getGg() {
        Gg gg = new Gg();
        gg.setContent(zyjProperties.getContent());
        return gg;
    }
}
