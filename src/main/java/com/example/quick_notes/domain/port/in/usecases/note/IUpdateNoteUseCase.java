package com.example.quick_notes.domain.port.in.usecases.note;

import com.example.quick_notes.domain.Note;
import com.example.quick_notes.domain.NoteRequest;

public interface IUpdateNoteUseCase {
   Note updateNote(NoteRequest noteRequest, Long id);
}
