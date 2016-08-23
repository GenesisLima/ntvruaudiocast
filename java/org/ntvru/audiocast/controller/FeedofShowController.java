package org.ntvru.audiocast.controller;

import java.util.ArrayList;
import java.util.List;

import org.ntvru.audiocast.model.Show;
import org.ntvru.audiocast.rss.AudiocastRSSViewer;
import org.ntvru.audiocast.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FeedofShowController {

	@Autowired
	private ShowService showService;
	
	@RequestMapping(value="/rssfeed", method=RequestMethod.GET)
	public ModelAndView getFeedRss(Show show){
		  
		//List<Show> items = new ArrayList<Show>();
		
		List<Show> items = showService.findAll();
		
		
		
		ModelAndView modelAndView = new ModelAndView(new AudiocastRSSViewer(), "feedShows",items);
	
		return modelAndView;
	}
	
	
}
