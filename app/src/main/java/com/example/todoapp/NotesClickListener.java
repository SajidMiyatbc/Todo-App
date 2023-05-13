package com.example.todoapp;

import androidx.cardview.widget.CardView;

import com.example.todoapp.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
