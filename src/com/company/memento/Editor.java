package com.company.memento;

// Memento Pattern - Creating a UNDO mechanism
// Memento pattern is used to restore state of an object to a previous state. Memento pattern falls under behavioural pattern category.
// In Memento pattern we have three participants
// 1. Editor -- Originator
// 2. EditorState -- Memento
// 3. History -- CareTaker

public class Editor {
    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
