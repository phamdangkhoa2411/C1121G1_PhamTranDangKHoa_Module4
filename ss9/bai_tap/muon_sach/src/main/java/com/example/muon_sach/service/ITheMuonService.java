package com.example.muon_sach.service;

import com.example.muon_sach.model.TheMuon;

public interface ITheMuonService {
    TheMuon findById(String code);
    void save(TheMuon theMuon);
    void remove(Integer idThe);
}
