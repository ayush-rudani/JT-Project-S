package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefController {

    @RequestMapping("/index2")
    public String login() {
        return "index";
    }
//	public String login() {
//		return "/WEB-INF/view/login-register.jsp";
//	}

    @ResponseBody
    @RequestMapping("/temp")
    public String tmp() {
        return "hello it's me i'm temp.";
    }

}
