package com.example.notes.service;

import com.example.notes.model.Notepad;
import java.util.List;

public interface NotepadService {
    Notepad createNotepad(Notepad notepad);
    Notepad getNotepadById(Long id);
    Notepad updateNotepad(Long id, Notepad notepad);
    void deleteNotepad(Long id);
    List<Notepad> getAllNotepads();
}
