package com.skc.springbbs.bbsController;

import com.skc.springbbs.bbsCommand.Bcmd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bcontroller {

    Bcmd cmd = null;

    @RequestMapping("/list")
    public String list(Model model){


        return "list";
    }


}
