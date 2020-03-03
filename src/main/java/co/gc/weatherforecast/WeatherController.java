package co.gc.weatherforecast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherService weatherServ;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@PostMapping("/")
	public ModelAndView index(@RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude) {
		ModelAndView mav = new ModelAndView("show");
		Weather wea = weatherServ.text(latitude, longitude);
		
		mav.addObject("wea",wea);
		
		return mav;
	}

}
