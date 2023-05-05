package com.pdfGenerator.pdfGenerator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PdfFormsController {
    private Map<String,PdfForm> db = new HashMap<>() {{
        put("1", new PdfForm("1", "myPdf.pdf"));
    }};
    @GetMapping("/")
    public String hello(){
      return "Hello World";
    }

    @GetMapping("/pdfForms")
    public Collection<PdfForm> get(){
        return db.values();

    }
    @GetMapping("/pdfForms/{id}")
    public PdfForm get(@PathVariable String id){
        PdfForm pdfForm = db.get(id);
        if (pdfForm==null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return pdfForm;

    }
}
