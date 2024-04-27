package com.example.IndigenousLanguageDictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepositoryILD extends JpaRepository<WordTranslations,Integer> {
    List<WordTranslations> findByBengaliWord(String bengaliWord);

}
