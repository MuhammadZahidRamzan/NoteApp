package com.example.noteapp.feature_note.domain.use_cases

import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.repositroy.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}