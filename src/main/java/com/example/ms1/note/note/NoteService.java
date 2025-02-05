package com.example.ms1.note.note;

import com.example.ms1.note.notebook.Notebook;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    public Note saveDefault(Notebook notebook) {
        Note note = new Note();
        note.setTitle("new title");
        note.setContent("");
        note.setCreateDate(LocalDateTime.now());
        note.setNotebook(notebook);

        return noteRepository.save(note);
    }

}
