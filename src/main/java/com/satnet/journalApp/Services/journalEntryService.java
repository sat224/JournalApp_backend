package com.satnet.journalApp.Services;

import com.satnet.journalApp.Entity.JournalEntry;
import com.satnet.journalApp.Repository.journalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class journalEntryService {
    @Autowired
    private journalEntryRepository journalEntries;

    public List<JournalEntry> getAllEntries(){
        return journalEntries.findAll();
    }

    public String addNewEntry(JournalEntry newEntry){
        journalEntries.save(newEntry);
        return "Entry added successfully";
    }
}
