package poly.lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

    @GetMapping("/param/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/param/save/{x}")
    public String save(
            @PathVariable("x") String x,   // lấy từ URL
            @RequestParam("y") String y,   // lấy từ input form
            Model model) {

        // đưa dữ liệu ra view
        model.addAttribute("x", x);
        model.addAttribute("y", y);

        return "form";
    }
}
