package com.example.IndigenousLanguageDictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControllerILD {
 @Autowired
 ServicesILD servicesILD;


  @GetMapping("all_data")
    public List<WordTranslations> getAllDatas(){
      return servicesILD.getAllWordTranslations();
  }

    @GetMapping("/data/search")
    public List<WordTranslations>
    searchByBengaliWord(@RequestParam("bengali_word") String bengaliWord) {
        return servicesILD.findByBengaliWord(bengaliWord);
    }
}
