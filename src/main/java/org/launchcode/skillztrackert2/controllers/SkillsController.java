package org.launchcode.skillztrackert2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping(value = "")
    public String index() {
        return "<html>" +
                "<h1>Skills!</h1>" +
                "<h2>Languages and frameworks to consider for future upskilling</h2>" +
                "<ol>" +
                "<li>React</li>" +
                "<li>Deeper Dive: Entity Framework for C# ASP Core.Net</li>" +
                "<li>Deeper Dive: Spring REST api</li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping(value = "form")
    public String skillsForm() {
        return "<html>" +
                "<form method='post'>" +
                "<label for='name-input'>Name: " +
                "<input id=name-input type='text' name='name' /><br>" +

                "<select name='firstChoice'>" +
                "<option value='React'>React</option>" +
                "<option value='Deeper Dive: Entity Framework for C# ASP Core.Net'>" +
                    "Deeper Dive: Entity Framework for C# ASP Core.Net" +
                "</option>" +
                "<option value='Deeper Dive: Spring REST api'>" +
                    "Deeper Dive: Spring REST api" +
                "</option>" +
                "</select>" +
                "</label><br>" +

                "<select name='secondChoice'>" +
                "<option value='React'>React</option>" +
                "<option value='Deeper Dive: Entity Framework for C# ASP Core.Net'>" +
                    "Deeper Dive: Entity Framework for C# ASP Core.Net" +
                "</option>" +
                "<option value='Deeper Dive: Spring REST api'>" +
                    "Deeper Dive: Spring REST api" +
                "</option>" +
                "</select>" +
                "</label><br>" +


                "<select name='thirdChoice'>" +
                "<option value='React'>React</option>" +
                "<option value='Deeper Dive: Entity Framework for C# ASP Core.Net'>" +
                    "Deeper Dive: Entity Framework for C# ASP Core.Net" +
                "</option>" +
                "<option value='Deeper Dive: Spring REST api'>" +
                    "Deeper Dive: Spring REST api" +
                "</option>" +
                "</select>" +
                "</label><br>" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</html>";
    }

    @PostMapping(value = "form")
    public String skillsResult(@RequestParam String name,
                               @RequestParam String firstChoice,
                               @RequestParam String secondChoice,
                               @RequestParam String thirdChoice) {

        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>" +
                "</html>";
    }

}
