package org.management.service;

import org.springframework.stereotype.Service;
import org.management.dao.Ipo;

import java.util.List;
@Service
public interface IposService {

    List<Ipo> getAllIpos();

    Ipo getIpoById(int ipoId);

    Ipo saveIpo(Ipo ipo);

    Ipo updateIpo(int ipoId, Ipo ipo);

    boolean deleteIpo(int ipoId);
}
