package com.intec.jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doc")
public class DocumentController {

     @Autowired
     DocumentService docService;

     @PostMapping("save")
     public void saveDoc(@RequestParam String name) {
          docService.saveDoc(name);
     }

     @GetMapping("list")
     public void listDocs() {
          docService.getDocs();
     }
}
