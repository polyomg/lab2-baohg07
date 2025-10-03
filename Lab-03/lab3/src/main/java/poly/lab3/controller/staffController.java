package poly.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import poly.lab3.model.staff;

@Controller
public class staffController {
    @RequestMapping("/staff/detail")
    public String detail(Model model) {
        staff Staff = staff.builder()

                .id("user@gmail.com")
                .fullname("nguyễn văn user")
                .level(2)
                .build();

        model.addAttribute("staff", Staff);
        return "/staff-detail";
    }
}
