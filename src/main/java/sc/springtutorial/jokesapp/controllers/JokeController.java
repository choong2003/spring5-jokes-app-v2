package sc.springtutorial.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sc.springtutorial.jokesapp.services.JokeService;

/**
 * created 23/08/2021 - 12:37 AM
 * project spring5-jokes-app-v2
 * author sc
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
