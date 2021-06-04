package com.example.donatethefood_helppeople.donation_dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.donatethefood_helppeople.model_class.InformationModel;

import java.util.List;

@Dao
public interface IonformationDao {
    @Insert
    long insertNewDonation(InformationModel model);

    @Query("select * from tbl_Donation")
    List<InformationModel> getAllDonationList();

    @Query("delete from tbl_Donation")
    void deleteAll();
}   
