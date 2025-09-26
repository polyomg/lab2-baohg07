package poly.lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import poly.lab2.Product.StoreProduct;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/product/form")
    public String form(Model model){
        StoreProduct p = new StoreProduct();
        p.setName("iPhone 17");
        p.setPrice(2000);

        model.addAttribute("storeProduct", p);
        return "form-bai4";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute("storeProduct") StoreProduct p , Model model){
        model.addAttribute("storeProduct", p);
        return "form-bai4";
    }

    @ModelAttribute("items")
    public List<StoreProduct> items(){
        return Arrays.asList(
                new StoreProduct("A", 1),
                new StoreProduct("B", 9)
        );
    }

}
