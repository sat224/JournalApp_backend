package com.satnet.journalApp.Repository;

import com.satnet.journalApp.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface journalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
