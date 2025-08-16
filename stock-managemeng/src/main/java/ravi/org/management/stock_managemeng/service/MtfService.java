package ravi.org.management.stock_managemeng.service;

import org.springframework.stereotype.Service;
import ravi.org.management.stock_managemeng.dao.Mtf;

import java.util.List;
@Service
public interface MtfService {

    List<Mtf> filter(String quantity, String share_symbol, String expiry_date);

    List<Mtf> getAllMtfRecords();

    Mtf getMtfRecordById(int mtfId);

    Mtf saveMtfRecord(Mtf mtfRecord);

    Mtf updateMtfRecord(int mtfId, Mtf mtfRecord);

    boolean deleteMtfRecord(int mtfId);
}
