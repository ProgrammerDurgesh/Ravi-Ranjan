package ravi.org.management.stock_managemeng.service;

import org.springframework.stereotype.Service;
import ravi.org.management.stock_managemeng.dao.Ipo;

import java.util.List;
@Service
public interface IposService {

    List<Ipo> getAllIpos();

    Ipo getIpoById(int ipoId);

    Ipo saveIpo(Ipo ipo);

    Ipo updateIpo(int ipoId, Ipo ipo);

    boolean deleteIpo(int ipoId);
}
