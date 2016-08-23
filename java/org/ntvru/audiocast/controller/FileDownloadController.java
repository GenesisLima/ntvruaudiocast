package org.ntvru.audiocast.controller;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.ntvru.audiocast.model.FileDocument;
import org.ntvru.audiocast.model.Show;
import org.ntvru.audiocast.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ballem on 26/05/2015.
 */
@RestController
@RequestMapping("download")
public class FileDownloadController {

    private static final Logger LOGGER = Logger.getLogger(FileDownloadController.class);

    @Autowired
    private ShowService service;
    
    
    
    @Autowired
    HttpServletRequest request;

    @RequestMapping(value = "/list")
    public ModelAndView getFiles(ModelMap model) {
            
        model.addAttribute("shows", service.findAll());
        for(Show show: service.findAll()){
        	System.out.println("SHOW: "+show.getFileDocument().getId()+"- "+show.getFileDocument().getFileName());
        }
     //System.out.println("FILES: "+service.findAll().get(1).getFileName());
        return new ModelAndView("download", model);
    }

    @RequestMapping(value = "/file/{id}/{fileName}", method = RequestMethod.GET)
    public ResponseEntity<byte[]> load(@PathVariable("id") String id, @PathVariable("fileName") String fileName) {

        BufferedInputStream inputStream = null;
          System.out.println("SHOW ID: "+id);
        HttpHeaders headers = new HttpHeaders();
           /*Add from Mongo*/
        Show show= service.findById(id);
//TODO Do the findById method works
        System.out.println(show.getFileDocument());
        String dir = show.getFileDocument().getFilePath();
        String showId = String.valueOf(show.getFileDocument().getId());
        System.out.println("NAME OF FILE DOCUMENT: "+dir);
        String name = show.getFileDocument().getFileName();
        System.out.println("NAME OF FILE DOCUMENT: "+name);
        String type = show.getFileDocument().getFileType();

        try {

            Path path = Paths.get(dir + File.separator + name);

            String temp = path.getFileName().toString();
             System.out.println("http://"+request.getLocalAddr()+":"+request.getLocalPort()+""+request.getContextPath()+"/download/file/"+showId+"/"+name);
//             String ipAddress = request.getHeader("X-FORWARDED-FOR");  
//  		   if (ipAddress == null) {  
//  			   ipAddress = request.getRemoteAddr(); 
//  		   }
  			   
  			   //System.out.println("Client IP: "+ipAddress+" Date: "+ new GregorianCalendar());
            if (temp.equalsIgnoreCase(name)) {

                inputStream = new BufferedInputStream(new FileInputStream(path.toFile()));

                headers.setContentType(MediaType.valueOf(type));

                return new ResponseEntity<byte[]>(IOUtils.toByteArray(inputStream), headers, HttpStatus.OK);
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                LOGGER.error(e.getMessage());
            }
        }
        return null;
    }
}
