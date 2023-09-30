package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class journalService implements IJournalService{

    List<JournalEntry> journalEntries = new ArrayList<JournalEntry>();
    @Override
    public JournalEntry save(JournalEntry journalEntry) {
        journalEntries.add(journalEntry);
        return journalEntry;
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntries;
    }
}
