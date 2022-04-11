package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;
import com.kreitek.editor.Memento;

import java.io.Console;
import java.util.ArrayList;

public class UndoCommand implements Command {
    Memento memento;

    public UndoCommand(Memento memento) {
        this.memento = memento;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
            documentLines = memento.getState();
    }
}
