package org.launchcode.skillstrackerstudio21sept.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    @ResponseBody
    public String index() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>Javascript</li>" +
                    "<li>Python</li>" +
                    "<li>C</li>" +
                "</ol>" +
//                "<form action='form' method='post'>" +
//                "<input type='submit' value='Take me to the form! -->' >" +
//                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action='langSelections' method='post'>" +
                "<h2>Name:</h2>" +
                "<input type='text' name='name'>" +
                "<h3>My favorite language:</h3><select name='langSelect1'>" +
                "    <option value=''>*Select*</option>\n" +
                "    <option value='Java'>Java</option>\n" +
                "    <option value='Javascript'>Javascript</option>\n" +
                "    <option value='Python'>Python</option></select>\n" +

                "<h3>My second favorite language:</h3><select name='langSelect2'>" +
                "    <option value=''>*Select*</option>\n" +
                "    <option value='Java'>Java</option>\n" +
                "    <option value='Javascript'>Javascript</option>\n" +
                "    <option value='Python'>Python</option></select>\n" +

                "<h3>My third favorite language:</h3><select name='langSelect3'>" +
                "    <option value=''>*Select*</option>\n" +
                "    <option value='Java'>Java</option>\n" +
                "    <option value='Javascript'>Javascript</option>\n" +
                "    <option value='Python'>Python</option></select>\n" +

                "<h3></h3><input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("langSelections")
    @ResponseBody
    public String langSelections(@RequestParam String name, @RequestParam String langSelect1, @RequestParam String langSelect2, @RequestParam String langSelect3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h3>" +
                "<ol>" +
                "<li>" + langSelect1 + "</li>" +
                "<li>" + langSelect2 + "</li>" +
                "<li>" + langSelect3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


}
