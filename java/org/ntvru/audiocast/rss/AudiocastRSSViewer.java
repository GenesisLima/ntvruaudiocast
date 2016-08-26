package org.ntvru.audiocast.rss;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ntvru.audiocast.model.Show;
import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Description;
import com.rometools.rome.feed.rss.Enclosure;
import com.rometools.rome.feed.rss.Item;


public class AudiocastRSSViewer extends AbstractRssFeedView {
	
	


	@Override
	protected List<Item> buildFeedItems(Map<String, Object> model,
		 HttpServletRequest arg1, HttpServletResponse arg2) throws Exception {
		 @SuppressWarnings("unchecked")
		 List<Show> listShows = (List<Show>) model.get("feedShows");
		 List<Item> items = new ArrayList<Item>(listShows.size());
		 
		 for(Show show :listShows){
			 Item item = new Item();
			 		 
			 Content content = new Content();
			 
			 content.setValue(show.getSynopsis());
			 item.setContent(content);
			 item.setTitle(show.getTopic());
			 item.setLink(show.getUrl());
			 Description description = new Description();
			 description.setValue(show.getSynopsis());
             item.setDescription(description);
             
             
			
             Enclosure enclosure = new Enclosure();
            
             enclosure.setUrl(show.getUrl());
             enclosure.setType(show.getFileDocument().getFileType());
             enclosure.setLength(4182295);
             item.getEnclosures().add(enclosure);
			
             
             
			items.add(item); 
			 
		 }
		 
		return items;
	}
	
	@Override
	protected void buildFeedMetadata(Map<String, Object> model, Channel feed,
			HttpServletRequest request) {
		
		

		
		feed.setTitle("Feed de Conteúdo NTVRU");
		feed.setDescription("Este feed distribui os produtos de áudio do Núcleo de TV e Rádio Universitária da UFPE");
		feed.setLink("http://www.ufpe.br");
		feed.setWebMaster("genesis.lima@ufpe.br");
		super.buildFeedMetadata(model, feed, request);
	}
	
	

}
