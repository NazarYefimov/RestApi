package com.example.notes.repository;

import com.example.notes.model.Notepad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotepadRepository extends JpaRepository<Notepad, Long> {
}