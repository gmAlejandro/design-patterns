package com.kreitek.editor;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementolist = new ArrayList<Memento>();

    public void push(Memento memento){
        mementolist.add(memento);
        for (Memento m: mementolist) {
            System.out.println(m.getState());
        }
    }

    public Memento pop() {
        if(mementolist.size() > 0){
            Memento memento = mementolist.get(mementolist.size() - 2);
            mementolist.remove(mementolist.size() - 2);
            return memento;
        }
        return null;
    }


}
