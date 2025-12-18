package org.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.management.dao.Ipo;
import org.management.repo.IpoRepo;
import org.management.service.IposService;

import java.util.List;
import java.util.Optional;

@Service
public class IposServiceImpl implements IposService {

    @Autowired
    private IpoRepo ipoRepo;

    @Override
    public List<Ipo> getAllIpos() {
        return ipoRepo.findAll();
    }

    @Override
    public Ipo getIpoById(int ipoId) {
        return ipoRepo.findById(ipoId).orElse(null);
    }

    @Override
    public Ipo saveIpo(Ipo ipo) {
        return ipoRepo.save(ipo);
    }

    @Override
    public Ipo updateIpo(int ipoId, Ipo ipo) {
        Optional<Ipo> existing = ipoRepo.findById(ipoId);
        if (existing.isPresent()) {
            ipo.setId(ipoId);
            return ipoRepo.save(ipo);
        }
        return null;
    }

    @Override
    public boolean deleteIpo(int ipoId) {
        if (ipoRepo.existsById(ipoId)) {
            ipoRepo.deleteById(ipoId);
            return true;
        }
        return false;
    }
}
