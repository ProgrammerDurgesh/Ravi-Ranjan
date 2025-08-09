package ravi.org.management.stock_managemeng.service;

import ravi.org.management.stock_managemeng.dao.Ipo;

import java.util.List;

public interface IposService {

    List<Ipo> getAllIpos();

    Ipo getIpoById(String ipoId);

    Ipo saveIpo(Ipo ipo);

    Ipo updateIpo(String ipoId, Ipo ipo);

    boolean deleteIpo(String ipoId);
}
