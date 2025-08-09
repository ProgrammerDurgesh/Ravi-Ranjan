package ravi.org.management.stock_managemeng.service;

import ravi.org.management.stock_managemeng.dao.Share;
import java.util.List;

public interface ShareService {

    List<Share> getAllShares();

    Share getShareById(String shareId);

    Share saveShare(Share share);

    Share updateShare(String shareId, Share share);

    boolean deleteShare(String shareId);
}
