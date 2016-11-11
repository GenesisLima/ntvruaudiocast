package org.ntvru.audiocast.controller;

import org.ntvru.audiocast.model.Show;
import org.ntvru.audiocast.service.ShowService;
import org.ntvru.audiocast.streaming.MultipartFileSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
/**
 * Created by Genesis Lima
 */
@RestController
//@RequestMapping("/api/podcast/{idPodcast}/items")
@RequestMapping("downloads")
public class ItemController {

protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    
//    @Resource private ItemBusiness itemBusiness;
//
//    @Autowired
//    protected ItemDownloadManager itemDownloadManager;

       @Autowired
       ShowService service;

    @RequestMapping(value="/files/{id}", method = RequestMethod.GET)
    public void getEpisodeFile(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.debug("Download of item file {}", id);
        Show show= service.findById(id);
        System.out.println("SHOW ON ITEM CONTROLLER :"+show.getFileDocument().getFilePath()+"\\"+show.getFileDocument().getFileName());
      //  if (show.isDownloaded()) {
            logger.debug("Récupération en local de l'item {} au chemin {}", id, show.getUrl());
            MultipartFileSender.fromURIString(show.getFileDocument().getFilePath()+"\\"+show.getFileDocument().getFileName())
                    .with(request)
                    .with(response)
                .serveResource();

       // } else {
         //   response.sendRedirect(show.getUrl());
       // }
    }
    
}
