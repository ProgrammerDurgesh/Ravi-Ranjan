package ravi.org.management.stock_managemeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ravi.org.management.stock_managemeng.dao.Share;
import ravi.org.management.stock_managemeng.repo.ShareRepo;
import ravi.org.management.stock_managemeng.service.ShareService;

import java.util.List;
import java.util.Optional;

@Service
public class ShareServiceImpl implements ShareService {

    @Autowired
    private ShareRepo shareRepo;

    @Override
    public List<Share> getAllShares() {
        return shareRepo.findAll();
    }

    @Override
    public Share getShareById(int shareId) {
        return shareRepo.findById(shareId).orElse(null);
    }

    @Override
    public Share saveShare(Share share) {
        return shareRepo.save(share);
    }

    @Override
    public Share updateShare(int shareId, Share share) {
        Optional<Share> existing = shareRepo.findById(shareId);
        if (existing.isPresent()) {
            share.setId(shareId);
            return shareRepo.save(share);
        }
        return null;
    }

    @Override
    public boolean deleteShare(int shareId) {
        if (shareRepo.existsById(shareId)) {
            shareRepo.deleteById(shareId);
            return true;
        }
        return false;
    }
}
