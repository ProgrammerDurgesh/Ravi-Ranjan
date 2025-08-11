package ravi.org.management.stock_managemeng.service;

import org.springframework.stereotype.Service;
import ravi.org.management.stock_managemeng.dao.Mtf;

import java.util.List;
@Service
public interface MtfService {

    List<Mtf> getAllMtfRecords();

    Mtf getMtfRecordById(String mtfId);

    Mtf saveMtfRecord(Mtf mtfRecord);

    Mtf updateMtfRecord(String mtfId, Mtf mtfRecord);

    boolean deleteMtfRecord(String mtfId);
}
