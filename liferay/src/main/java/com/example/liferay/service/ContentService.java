package com.example.liferay.service;


import com.example.liferay.model.Content;
import com.example.liferay.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    public List<Content> getAllContents() {
        return contentRepository.findAll();
    }

    public Content getContentById(Long id) {
        return contentRepository.findById(id).orElse(null);
    }

    public Content createContent(Content content) {
        return contentRepository.save(content);
    }

    public Content updateContent(Long id, Content content) {
        content.setId(id); // Ensure the ID is set for update
        return contentRepository.save(content);
    }

    public void deleteContent(Long id) {
        contentRepository.deleteById(id);
    }
}
