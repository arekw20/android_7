package com.example.android_7;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
    @SerializedName("title")
    private String title;
    @SerializedName("author_name")
    private List<String> authors;
    @SerializedName("cover_i")
    private String cover;
    @SerializedName("number_of_pages_median")
    private String numberOfPages;
    @SerializedName("first_publish_year")
    private String firstPublishYear;
    @SerializedName("ebook_access")
    private String hasEbook;
    @SerializedName("language")
    private List<String> languages;
    @SerializedName("subject")
    private List<String> subjects;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getFirstPublishYear() {
        return firstPublishYear;
    }

    public void setFirstPublishYear(String firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    public String getHasEbook() {
        return hasEbook;
    }

    public void setHasEbook(String hasEbook) {
        this.hasEbook = hasEbook;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}