package cn.zyj.search.Controller;


import cn.zyj.search.Service.InfoService;
import cn.zyj.search.untils.ProductHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Info;
import pojo.Product;

@RestController
public class InfoController {
    @Autowired
    private InfoService infoService;

    @CrossOrigin
    @RequestMapping("/test")
    public Info suyuan(String productId,String page,String limit){
        return  infoService.suyuan(productId);
    }
}
