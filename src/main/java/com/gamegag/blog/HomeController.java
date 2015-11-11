package com.gamegag.blog;

import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired private DAOPost _daopdost;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		List<Post> post = _daopdost.findAll();
		model.addAttribute("post", post);
		
		return "test/home";
	}
	

    @RequestMapping(value="/getAllPosts", method = RequestMethod.GET)
	@ResponseBody
    public List<Post> getAllUsers() {
    		return _daopdost.findAll();
    }
	
}
