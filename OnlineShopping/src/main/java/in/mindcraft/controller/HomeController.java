package in.mindcraft.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
    @RequestMapping("/customer")
    public ModelAndView checkStatus(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        ModelAndView mv = new ModelAndView();
        
        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        CustomerController customerctrl = new CustomerController();
        
        boolean isValidCustomer = customerctrl.checkcustomer(username);
        
        if (isValidCustomer) {
            System.out.println("Customer Present");
            mv.setViewName("result.jsp");
            
    
        } else {
            System.out.println("Customer Absent");
            mv.setViewName("index.jsp");
  
        }
        
        return mv;
    }
}
