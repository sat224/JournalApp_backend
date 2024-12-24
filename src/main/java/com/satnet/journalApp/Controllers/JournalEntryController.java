package com.satnet.journalApp.Controllers;

import com.satnet.journalApp.Entity.JournalEntry;
import com.satnet.journalApp.Services.journalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    @Autowired
    private journalEntryService journalEntries;

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping
    public List<JournalEntry> getAllEntries(){
        return journalEntries.getAllEntries();
    }
//    @GetMapping("id/{id}")
//    public JournalEntry getEntryById(@PathVariable Long id){
//        return journalEntries.get(id);
//    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry newEntry){
        journalEntries.addNewEntry(newEntry);
        return true;
    }
//    @PutMapping("id/{id}")
//    public boolean updateEntryById(@PathVariable Long id,@RequestBody JournalEntry newEntry){
//        journalEntries.put(id,newEntry);
//        return true;
//    }
//    @DeleteMapping("id/{id}")
//    public boolean deleteEntryById(@PathVariable Long id){
//        journalEntries.remove(id);
//        return true;
//    }
}
