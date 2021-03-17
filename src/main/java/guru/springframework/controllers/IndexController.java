package guru.springframework.controllers;

import guru.springframework.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 1/20/16.
 */
@Controller
public class IndexController {

    ProductService productService;

    public IndexController() {
    }

    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")

    public String getIndex(){

        return "index";
    }
}
