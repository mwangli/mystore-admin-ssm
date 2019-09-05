package com.lmw.web;

import com.lmw.beans.Admin;
import com.lmw.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController extends DispatcherServlet {

    @Autowired
    private AdminService adminServiceImpl;

    @RequestMapping("/login.do")
    public String login(Model model, Admin admin, HttpSession session) {
        Admin ad = adminServiceImpl.login(admin).get(0);
        if (ad == null) {
            model.addAttribute("error", "用户名或密码错误");
            return "index.jsp";
        } else {
            session.setAttribute("admin",admin);
            return "main.jsp";
        }
    }

    @RequestMapping("/getAllAdmin.do")
    public String getAll(Model model){
        List<Admin> list = adminServiceImpl.getAllAdmin();
        model.addAttribute("list",list);
        return "admin.jsp";
    }
}
