package com.example.notes.service;

import com.example.notes.model.Notepad;
import com.example.notes.repository.NotepadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotepadServiceImpl implements NotepadService {

    @Autowired
    private NotepadRepository notepadRepository;

    @Override
    public Notepad createNotepad(Notepad notepad) {
        return null;
    }

    @Override
    public Notepad getNotepadById(Long id) {
        return null;
    }

    @Override
    public Notepad updateNotepad(Long id, Notepad notepad) {
        return null;
    }

    @Override
    public void deleteNotepad(Long id) {

    }

    @Override
    public List<Notepad> getAllNotepads() {
        return null;
    }

    public NotepadRepository getNotepadRepository() {
        return notepadRepository;
    }

    public void setNotepadRepository(NotepadRepository notepadRepository) {
        this.notepadRepository = notepadRepository;
    }

    // Реалізація методів інтерфейсу
}
