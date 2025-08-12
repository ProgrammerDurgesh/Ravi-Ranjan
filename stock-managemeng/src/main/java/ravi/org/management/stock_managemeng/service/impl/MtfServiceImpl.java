package ravi.org.management.stock_managemeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ravi.org.management.stock_managemeng.dao.Mtf;
import ravi.org.management.stock_managemeng.repo.MtfRepo;
import ravi.org.management.stock_managemeng.service.MtfService;

import java.util.List;
import java.util.Optional;

@Service
public class MtfServiceImpl implements MtfService {

    @Autowired
    private MtfRepo mtfRepo;

    @Override
    public List<Mtf> getAllMtfRecords() {
        return mtfRepo.findAll();
    }

    @Override
    public Mtf getMtfRecordById(String mtfId) {
        return mtfRepo.findById(mtfId).orElse(null);
    }

    @Override
    public Mtf saveMtfRecord(Mtf mtfRecord) {
        return mtfRepo.save(mtfRecord);
    }

    @Override
    public Mtf updateMtfRecord(String mtfId, Mtf mtfRecord) {
        Optional<Mtf> existingRecord = mtfRepo.findById(mtfId);
        if (existingRecord.isPresent()) {
            // Optionally update fields of existingRecord.get() here if partial update is required
            // For now, we just save the new record with the same id
            mtfRecord.setId(mtfId);
            return mtfRepo.save(mtfRecord);
        } else {
            // Record not found; decide what to do: return null or throw exception
            return null;
        }
    }

    @Override
    public boolean deleteMtfRecord(String mtfId) {
        if (mtfRepo.existsById(mtfId)) {
            mtfRepo.deleteById(mtfId);
            return true;
        }
        return false;
    }
}
