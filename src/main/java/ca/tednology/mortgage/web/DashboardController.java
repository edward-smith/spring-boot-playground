package ca.tednology.mortgage.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * DashboardController.
 *
 * @author Edward Smith
 */
@Controller
@RequestMapping("/system")
public class DashboardController {

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String showDashboard() {
        System.err.println("OH MY ZOOGA!");
        return "dashboard";
    }

}
