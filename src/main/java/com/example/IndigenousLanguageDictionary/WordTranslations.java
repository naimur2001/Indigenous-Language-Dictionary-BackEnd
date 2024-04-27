package com.example.IndigenousLanguageDictionary;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "WordTranslations")
public class WordTranslations {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "bengaliWord")
    private String bengaliWord;

    @Column(name = "bengaliIPA")
    private String bengaliIPA;

    @Column(name = "bengaliAntonym")
    private String bengaliAntonym;

    @Column(name = "bengaliSynonyms")
    private String bengaliSynonyms;

    @Column(name = "englishWord")
    private String englishWord;

    @Column(name = "englishIPA")
    private String englishIPA;

    @Column(name = "englishAntonym")
    private String englishAntonym;

    @Column(name = "englishSynonyms")
    private String englishSynonyms;

    @Column(name = "frenchWord")
    private String frenchWord;

    @Column(name = "frenchIPA")
    private String frenchIPA;

    @Column(name = "frenchAntonym")
    private String frenchAntonym;

    @Column(name = "frenchSynonyms")
    private String frenchSynonyms;

    @Column(name = "is_Active")
    private boolean active=true;

    @Column(name = "created_on", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn = new Date();

    @Column(name = "updated_on", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn = new Date();

    // No-argument constructor
    public WordTranslations() {
    }
    public WordTranslations(Integer id, String bengaliWord, String bengaliIPA, String bengaliAntonym, String bengaliSynonyms, String englishWord, String englishIPA, String englishAntonym, String englishSynonyms, String frenchWord, String frenchIPA, String frenchAntonym, String frenchSynonyms, boolean active, Date createdOn, Date updatedOn) {
        this.id = id;
        this.bengaliWord = bengaliWord;
        this.bengaliIPA = bengaliIPA;
        this.bengaliAntonym = bengaliAntonym;
        this.bengaliSynonyms = bengaliSynonyms;
        this.englishWord = englishWord;
        this.englishIPA = englishIPA;
        this.englishAntonym = englishAntonym;
        this.englishSynonyms = englishSynonyms;
        this.frenchWord = frenchWord;
        this.frenchIPA = frenchIPA;
        this.frenchAntonym = frenchAntonym;
        this.frenchSynonyms = frenchSynonyms;
        this.active = active;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getBengaliWord() {
        return bengaliWord;
    }

    public void setBengaliWord(String bengaliWord) {
        this.bengaliWord = bengaliWord;
    }

    public String getBengaliIPA() {
        return bengaliIPA;
    }

    public void setBengaliIPA(String bengaliIPA) {
        this.bengaliIPA = bengaliIPA;
    }

    public String getBengaliAntonym() {
        return bengaliAntonym;
    }

    public void setBengaliAntonym(String bengaliAntonym) {
        this.bengaliAntonym = bengaliAntonym;
    }

    public String getBengaliSynonyms() {
        return bengaliSynonyms;
    }

    public void setBengaliSynonyms(String bengaliSynonyms) {
        this.bengaliSynonyms = bengaliSynonyms;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getEnglishIPA() {
        return englishIPA;
    }

    public void setEnglishIPA(String englishIPA) {
        this.englishIPA = englishIPA;
    }

    public String getEnglishAntonym() {
        return englishAntonym;
    }

    public void setEnglishAntonym(String englishAntonym) {
        this.englishAntonym = englishAntonym;
    }

    public String getEnglishSynonyms() {
        return englishSynonyms;
    }

    public void setEnglishSynonyms(String englishSynonyms) {
        this.englishSynonyms = englishSynonyms;
    }

    public String getFrenchWord() {
        return frenchWord;
    }

    public void setFrenchWord(String frenchWord) {
        this.frenchWord = frenchWord;
    }

    public String getFrenchIPA() {
        return frenchIPA;
    }

    public void setFrenchIPA(String frenchIPA) {
        this.frenchIPA = frenchIPA;
    }

    public String getFrenchAntonym() {
        return frenchAntonym;
    }

    public void setFrenchAntonym(String frenchAntonym) {
        this.frenchAntonym = frenchAntonym;
    }

    public String getFrenchSynonyms() {
        return frenchSynonyms;
    }

    public void setFrenchSynonyms(String frenchSynonyms) {
        this.frenchSynonyms = frenchSynonyms;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
// Getters and setters (omitted for brevity)
@Override
public String toString() {
    return "WordTranslationsILD{" +
            "id=" + id +
            ", bengaliWord='" + bengaliWord + '\'' +
            ", bengaliIPA='" + bengaliIPA + '\'' +
            ", bengaliAntonym='" + bengaliAntonym + '\'' +
            ", bengaliSynonyms='" + bengaliSynonyms + '\'' +
            ", englishWord='" + englishWord + '\'' +
            ", englishIPA='" + englishIPA + '\'' +
            ", englishAntonym='" + englishAntonym + '\'' +
            ", englishSynonyms='" + englishSynonyms + '\'' +
            ", frenchWord='" + frenchWord + '\'' +
            ", frenchIPA='" + frenchIPA + '\'' +
            ", frenchAntonym='" + frenchAntonym + '\'' +
            ", frenchSynonyms='" + frenchSynonyms + '\'' +
            ", active=" + active +
            ", createdOn=" + createdOn +
            ", updatedOn=" + updatedOn +
            '}';
}

}
