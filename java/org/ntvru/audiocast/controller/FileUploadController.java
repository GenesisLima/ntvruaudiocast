package org.ntvru.audiocast.controller;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.log4j.Logger;
import org.ntvru.audiocast.model.Show;
import org.ntvru.audiocast.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/upload")
public class FileUploadController {

    private static final Logger LOGGER = Logger.getLogger(FileUploadController.class);

   @Autowired
   private FileService fileService;

    private String path;
    private String name;
    private String type;
    private Long size;
    
   

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public ModelAndView uploadFileHandler(@RequestParam("file") MultipartFile file, ModelMap model,RedirectAttributes redirectAttributes, Show show) {
   System.out.println("Show "+show.toString()+"Nome: "+show.getName());
   System.out.println("Show "+show.toString()+"Nome: "+show.getTopic());
   System.out.println("Show "+show.toString()+"Nome: "+show.getSynopsis());
   ModelAndView modelAndView = new ModelAndView("redirect:/home#novo_programa");
   
     
   
   
        path = "";
        name = file.getOriginalFilename();
        type = file.getContentType();
        size = file.getSize();

        String newFileMessage = "O upload do arquivo " + name + " foi realizado com sucesso!"; 
        String alreadyExistsMessage =  "O arquivo " + name + " já foi salvo anteriormente!"; 
        
        try {
            byte[] bytes = file.getBytes();

            // Creating the directory to store file
              path = fileService.createPath();

            File dir = new File(path);

            if (!dir.exists()) {
                dir.mkdirs();
            }

            // Create the file on server
            File serverFile = new File(dir.getAbsolutePath() + "\\" + name);

            if (!serverFile.exists()) {

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));

                stream.write(bytes);

                stream.close();

                fileService.save(path, name, size, type);
                System.out.println("FIND ALL"+fileService.findAll());
                System.out.println(newFileMessage);

                redirectAttributes.addFlashAttribute("message", newFileMessage);
            } else {

            	 redirectAttributes.addFlashAttribute("message", alreadyExistsMessage);
            }

        } catch (Exception e) {
            LOGGER.error("O upload do arquivo " + name + " falhou devido => " + e.getMessage());
        }
        
        

        return modelAndView;
    }

    /**
     * Upload multiple file using Spring Controller
     */
//    @RequestMapping(value = "/multipleFiles", method = RequestMethod.POST)
//    public ModelAndView uploadMultipleFileHandler(@RequestParam("file") MultipartFile[] files, ModelMap model) {
//
//        String mensagem = "";
//
//        for (MultipartFile file : files) {
//
//            path = "";
//            name = file.getOriginalFilename();
//            type = file.getContentType();
//            size = file.getSize();
//
//            try {
//                byte[] bytes = file.getBytes();
//
//                // Creating the directory to store file
//             //   path = service.createPath();
//
//                File dir = new File(path);
//
//                if (!dir.exists()) {
//                    dir.mkdirs();
//                }
//
//                // Create the file on server
//                File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
//
//                if (!serverFile.exists()) {
//
//                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
//
//                    stream.write(bytes);
//
//                    stream.close();
//
//                  //  service.save(path, name, size, type);
//
//                    mensagem = mensagem + "O upload do arquivo " + name + " foi realizado com sucesso! <br />";
//                } else {
//
//                    mensagem = mensagem + "Não foi salvo! O arquivo " + name + " ja existe.";
//                }
//            } catch (Exception e) {
//                LOGGER.error("O upload do arquivo " + name + " falhou devido => " + e.getMessage());
//            }
//        }
//
//        model.addAttribute("mensagem", mensagem);
//
//        return new ModelAndView("/uploadMultiple", model);
//    }
}
