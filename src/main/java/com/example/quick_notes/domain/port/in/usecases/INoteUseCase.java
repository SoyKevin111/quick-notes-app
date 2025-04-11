package com.example.quick_notes.domain.port.in.usecases;

import com.example.quick_notes.domain.Note;
import com.example.quick_notes.domain.request.CreateNoteRequest;
import com.example.quick_notes.domain.request.UpdateNoteRequest;

import java.util.List;
import java.util.Optional;

public interface INoteUseCase {
   Note create(CreateNoteRequest createNoteRequest);
   Note update(UpdateNoteRequest updateNoteRequest, Long id);
   void deleteById(Long id);
   Optional<Note> findById(Long id);
   List<Note> findAll();
}
