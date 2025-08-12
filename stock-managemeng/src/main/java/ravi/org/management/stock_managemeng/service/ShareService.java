package ravi.org.management.stock_managemeng.service;

import org.springframework.stereotype.Service;
import ravi.org.management.stock_managemeng.dao.Share;
import java.util.List;
@Service
public interface ShareService {

    List<Share> getAllShares();

    Share getShareById(int shareId);

    Share saveShare(Share share);

    Share updateShare(int shareId, Share share);

    boolean deleteShare(int shareId);
}
