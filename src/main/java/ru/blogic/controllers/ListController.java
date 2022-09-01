package ru.blogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class ListController {
    @RequestMapping(value = "/showlist")
    public ModelAndView showList() {
        ModelAndView mv = new ModelAndView("list");
        List<String> currentList = Arrays.asList("<script>alert(100500)</script>", "Second", "Third", "Fourth", "Fifth");
        mv.addObject("currentList", currentList);
        return mv;
    }
}
