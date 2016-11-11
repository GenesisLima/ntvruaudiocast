package org.ntvru.audiocast.rss;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ntvru.audiocast.model.Show;
import org.ntvru.audiocast.utils.SyndicationLink;
import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.rometools.modules.atom.modules.AtomLinkModuleImpl;
import com.rometools.modules.itunes.EntryInformation;
import com.rometools.modules.itunes.EntryInformationImpl;
import com.rometools.modules.itunes.FeedInformation;
import com.rometools.modules.itunes.FeedInformationImpl;
import com.rometools.modules.itunes.types.Category;
import com.rometools.rome.feed.atom.Link;
import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Description;
import com.rometools.rome.feed.rss.Enclosure;
import com.rometools.rome.feed.rss.Guid;
import com.rometools.rome.feed.rss.Image;
import com.rometools.rome.feed.rss.Item;
import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndEntry;

/**
 * Created by Genesis Lima
 */
public class AudiocastRSSViewer extends AbstractRssFeedView {
	
	 private SyndEntry syndEntry;
	 private SyndContent syndDescription;
	
	 ArrayList modules = new ArrayList();
	 FeedInformation feedInfo = new FeedInformationImpl( );
	 EntryInformation e = new EntryInformationImpl();
	 List<Category> categories = new ArrayList<Category>();
//	 Category educationCategory = new Category("Education");		 
//	 Category politicsCategory = new Category("Politics");
	 List<Item> items = new ArrayList<Item>();
	 
	 
	 public AudiocastRSSViewer() {
		 categories.add(new Category("Education"));
		 feedInfo.setCategories(categories);
		
	}
	 


	@Override
	protected List<Item> buildFeedItems(Map<String, Object> model,
		 HttpServletRequest arg1, HttpServletResponse arg2) throws Exception {
		 @SuppressWarnings("unchecked")
		final List<Show> listShows = (List<Show>) model.get("feedShows");
		 
	
		 
		
		 for(Show show :listShows){
			 Item item = new Item();
			// syndEntry = new SyndEntryImpl();
			// syndDescription = new SyndContentImpl();
			 Content content = new Content();
//           
//		     
//		    
//			 
			 content.setValue(show.getSynopsis());
//			 
			 item.setContent(content);			
			 item.setTitle(show.getTopic());			
			 item.setLink(show.getUrl());
			 Guid guid = new Guid();
			 guid.setValue(show.getUrl());
			 guid.setPermaLink(true);
			 item.setGuid(guid);
			
			 Description description = new Description();
			 description.setValue(show.getSynopsis());
             item.setDescription(description);
             item.setPubDate(new Date());
           
            
//             e.setSubtitle(show.getTopic());
//             e.setDuration(new Duration(4182295));
//             e.setAuthor("NTVRU-UFPE");
//             e.setImage(new URL("http://estudante.ufpe.br/wp-content/themes/portaldoestudante/images/logo_UFPE.png"));
//             e.setSummary(show.getSynopsis());
//           
//             e.setKeywords(new String[]{"Educacao","Politico"});
            
             //FeedInfo was here
             
            
           
//             feedInfo.setImage(new URL("http://estudante.ufpe.br/wp-content/themes/portaldoestudante/images/logo_UFPE.png"));
//             
//            
             feedInfo.setSummary(show.getSynopsis());
             feedInfo.setSubtitle("Subtitulo");
//             feedInfo.setCategories(categories);
            feedInfo.setKeywords(new String[]{"Educacao"});
//           feedInfo.setAuthor("Nucleo de TV e Radio Universitaria");
//             
//             syndEntry.setTitle(show.getTopic());
//             syndEntry.setLink(show.getUrl());
             
			
             Enclosure enclosure = new Enclosure();
//            
             enclosure.setUrl(show.getUrl());
             enclosure.setType(show.getFileDocument().getFileType());
//             
             enclosure.setLength(4182295);
             item.getEnclosures().add(enclosure);
//             
//             item.setModules(modules);
            
          // syndDescription.setType(show.getFileDocument().getFileType());
           //  syndDescription.setValue(show.getSynopsis());
           //  syndEntry.setDescription(syndDescription);
             
           
			items.add(item);
			
			
			 
		 }
		// modules.add(e);
		
		
		
		 
		 
		return items;
	}
	
	@Override
	protected void buildFeedMetadata(Map<String, Object> model, Channel feed,
			HttpServletRequest request) {
		final List<Show> listShows = (List<Show>) model.get("feedShows");

		
		feed.setTitle("NTVRU-RSS");
		feed.setDescription("Este feed distribui os produtos de áudio do Núcleo de TV e Rádio Universitária da UFPE");
		feed.setLink("http://estudante.ufpe.br/wp-content/themes/portaldoestudante/images/logo_UFPE.png");
		feed.setWebMaster("genesis.lima@ufpe.br (Genesis Lima)");
		feed.setEncoding("UTF-8");
		feed.setLanguage("pt-br");
		feed.setModules(modules);
		Image ufpeImage = new Image();
		ufpeImage.setTitle("NTVRU-RSS");
		ufpeImage.setWidth(50);
		ufpeImage.setHeight(50);
		ufpeImage.setLink("http://estudante.ufpe.br/wp-content/themes/portaldoestudante/images/logo_UFPE.png");
		ufpeImage.setUrl("http://estudante.ufpe.br/wp-content/themes/portaldoestudante/images/logo_UFPE.png");
		feed.setImage(ufpeImage);
		  feedInfo.setCategories(categories);
		  feedInfo.setKeywords(new String[]{"Educação","Político"});
		  feedInfo.setOwnerName("NTVRU-UFPE");
          feedInfo.setOwnerEmailAddress("genesis.lima@ufpe.br (Genesis Lima)");
          feedInfo.setSummary("Este feed distribui os produtos de áudio do Núcleo de TV e Rádio Universitária da UFPE");
          feed.getModules().add(feedInfo);
         
          //begin atom
          final List<Link> atomLinks = new ArrayList<>();
          atomLinks.add(new SyndicationLink().withRel("self").withType(super.getContentType()).withHref("http://150.161.93.92:8081/audiocast/rssfeed").getLink());
//          if (posts.hasPrevious()) {
//              atomLinks.add(new SyndicationLink()
//                      .withRel("previous")
//                      .withType(super.getContentType())
//                      .withHref(String.format(hrefFormat, self, posts.previousPageable().getPageNumber()))
//                      .getLink()
//              );
//          }
//          if (posts.hasNext()) {
//              atomLinks.add(new SyndicationLink()
//                      .withRel("next")
//                      .withType(super.getContentType())
//                      .withHref(String.format(hrefFormat, self, posts.nextPageable().getPageNumber()))
//                      .getLink()
//              );
//          }
          feed.getModules().addAll(atomLinks.stream().map(l -> {
              final AtomLinkModuleImpl rv = new AtomLinkModuleImpl();
              rv.setLink(l);
              return rv;
          }).collect(Collectors.toList()));
          
//      
          //end atom
    
     //     modules.add(feedInfo);
        
    
	
		super.buildFeedMetadata(model, feed, request);
	}
	
	

}
