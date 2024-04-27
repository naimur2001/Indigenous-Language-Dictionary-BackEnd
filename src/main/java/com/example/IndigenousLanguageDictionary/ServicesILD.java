package com.example.IndigenousLanguageDictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicesILD {
@Autowired
RepositoryILD repositoryILD;

    public ServicesILD(RepositoryILD repositoryILD) {
        this.repositoryILD = repositoryILD;
    }

    public List<WordTranslations> getAllWordTranslations() {
        return repositoryILD.findAll();
    }
    public List<WordTranslations> findByBengaliWord(String bengaliWord) {
        return repositoryILD.findByBengaliWord(bengaliWord);
    }
}
