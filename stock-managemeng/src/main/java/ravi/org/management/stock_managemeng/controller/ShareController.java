package ravi.org.management.stock_managemeng.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ravi.org.management.stock_managemeng.dao.Share;
import ravi.org.management.stock_managemeng.service.ShareService;

import java.util.List;

@RestController
@RequestMapping("/shares") // plural is preferred for resource names
public class ShareController {

    private final ShareService shareService;

    public ShareController(ShareService shareService) {
        this.shareService = shareService;
    }

    @GetMapping
    public ResponseEntity<List<Share>> getAllShares() {
        List<Share> shares = shareService.getAllShares();
        return ResponseEntity.ok(shares);
    }

    @GetMapping("/{shareId}")
    public ResponseEntity<Share> getShareById(@PathVariable String shareId) {
        Share share = shareService.getShareById(shareId);
        if (share == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(share);
    }

    @PostMapping
    public ResponseEntity<Share> saveShare(@RequestBody Share share) {
        Share saved = shareService.saveShare(share);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{shareId}")
    public ResponseEntity<Share> updateShare(@PathVariable String shareId, @RequestBody Share share) {
        Share updated = shareService.updateShare(shareId, share);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{shareId}")
    public ResponseEntity<Void> deleteShare(@PathVariable String shareId) {
        boolean deleted = shareService.deleteShare(shareId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
