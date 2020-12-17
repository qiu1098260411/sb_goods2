package pers.harry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.harry.entity.Product;
import pers.harry.entity.Takeout;
import pers.harry.service.GoodsService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @RequestMapping("/queryProducts")
    public String queryProducts(@RequestParam(required = true,defaultValue = "0") int id, Model model){
        model.addAttribute("products",goodsService.queryProducts(id));
        return "index";
    }

    @RequestMapping("/queryProductName")
    public String queryProductName(Model model){
        model.addAttribute("productNames",goodsService.queryProductName());
        return "takeout";
    }

    @RequestMapping("/queryQuantity")
    @ResponseBody
    public int  queryQuantity(int id){
        List<Product> products = goodsService.queryProducts(id);
        Product product = products.get(0);
        return product.getQuantity();
    }

    @RequestMapping("/addTakeOut")
    public String addTakeOut(Takeout takeout){
        goodsService.addTakeOut(takeout);
        return "redirect:/queryProducts";
    }

}
