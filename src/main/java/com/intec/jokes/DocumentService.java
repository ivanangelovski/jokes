package com.intec.jokes;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {
     @Autowired
     DocumentRepository dr;

     @PostConstruct
     public void setup() {
          // dr.save(new Document(1, "doc1"));
     }

     public void saveDoc(String name) {
          Document doc = new Document();
          doc.setName(name);
          dr.save(doc);
     }

     public List<Document> getDocs() {
          return dr.findAll();
     }
}
