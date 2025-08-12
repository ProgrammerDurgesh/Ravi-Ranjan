package ravi.org.management.stock_managemeng.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ravi.org.management.stock_managemeng.dao.Mtf;
import ravi.org.management.stock_managemeng.service.MtfService;

import java.util.List;

@RestController
@RequestMapping("/mtf")
public class MtfController {

    private final MtfService mtfService;

    public MtfController(MtfService mtfService) {
        this.mtfService = mtfService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Mtf>> getAllMtfRecords() {
        List<Mtf> mtfList = mtfService.getAllMtfRecords();
        return ResponseEntity.ok(mtfList);
    }

    @GetMapping("/{mtfId}")
    public ResponseEntity<Mtf> getMtfRecordById(@PathVariable String mtfId) {
        Mtf mtf = mtfService.getMtfRecordById(mtfId);
        if (mtf == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mtf);
    }

    @PostMapping
    public ResponseEntity<Mtf> saveMtfRecord(@RequestBody Mtf mtfRecord) {
        Mtf saved = mtfService.saveMtfRecord(mtfRecord);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{mtfId}")
    public ResponseEntity<Mtf> updateMtfRecord(@PathVariable String mtfId, @RequestBody Mtf mtfRecord) {
        Mtf updated = mtfService.updateMtfRecord(mtfId, mtfRecord);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{mtfId}")
    public ResponseEntity<Void> deleteMtfRecord(@PathVariable String mtfId) {
        boolean deleted = mtfService.deleteMtfRecord(mtfId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
