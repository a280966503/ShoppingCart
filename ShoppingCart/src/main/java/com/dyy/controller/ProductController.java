package com.dyy.controller;

import com.dyy.bean.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ProductController {

    private static ArrayList<Product> list = new ArrayList<>();

    static {
        list.add(new Product(1,"小米5",999));
        list.add(new Product(2,"iphone5",1999));
        list.add(new Product(3,"iphone6",2999));
        list.add(new Product(4,"荣耀10",9399));
        list.add(new Product(5,"华为19",4999));
        list.add(new Product(6,"海尔9",5999));
        list.add(new Product(7,"小米6",6999));

    }


    @RequestMapping("shopping")
    public String shoppingCart(Model model){
        model.addAttribute("list",list);
        return "list";
    }


}
