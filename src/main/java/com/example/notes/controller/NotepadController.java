package com.example.notes.controller;


import com.example.notes.service.NotepadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NotepadController {

    @Autowired
    private NotepadService notepadService;

    public NotepadService getNotepadService() {
        return notepadService;
    }

    public void setNotepadService(NotepadService notepadService) {
        this.notepadService = notepadService;
    }

    // Обробники HTTP-запитів
}
