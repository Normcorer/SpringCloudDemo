package cn.zyj.search.Service;


import cn.zyj.search.Dao.InfoMapper;
import cn.zyj.search.untils.ProductHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Info;
import pojo.Product;

@Service
public class InfoService {
    @Autowired
    private InfoMapper infoMapper;
    @Autowired
    private ProductHttpClient productHttpClient;

    public Info suyuan(String productId) {
        try {
            Product product = productHttpClient.selectOne(productId);
            Info info = new Info();
            info.setProductId(productId);
            info.setProductName(product.getProductName());
            int addrId = product.getAddrId();
            info.setAddrId(addrId);
            String addrName = infoMapper.getAddrName(addrId);
            info.setAddrName(addrName);
            return info;
        }
        catch (Exception e){
            e.printStackTrace();
            Info info = new Info();
            info.setProductName("您好，您查询的商品不存在");
            return info;
        }
    }
}
