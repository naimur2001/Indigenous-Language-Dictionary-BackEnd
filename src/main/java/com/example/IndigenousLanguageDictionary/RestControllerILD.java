package com.example.IndigenousLanguageDictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin (origins = "*")
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
