package ravi.org.management.stock_managemeng.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ravi.org.management.stock_managemeng.dao.Ipo;
import ravi.org.management.stock_managemeng.service.IposService;

import java.util.List;

@RestController
@RequestMapping("/ipos")
public class IposController {

    private final IposService iposService;

    public IposController(IposService iposService) {
        this.iposService = iposService;
    }

    @GetMapping
    public ResponseEntity<List<Ipo>> getAllIpos() {
        List<Ipo> ipos = iposService.getAllIpos();
        return ResponseEntity.ok(ipos);
    }

    @GetMapping("/{ipoId}")
    public ResponseEntity<Ipo> getIpoById(@PathVariable String ipoId) {
        Ipo ipo = iposService.getIpoById(ipoId);
        if (ipo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ipo);
    }

    @PostMapping
    public ResponseEntity<Ipo> saveIpo(@RequestBody Ipo ipo) {
        Ipo savedIpo = iposService.saveIpo(ipo);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedIpo);
    }

    @PutMapping("/{ipoId}")
    public ResponseEntity<Ipo> updateIpo(@PathVariable String ipoId, @RequestBody Ipo ipo) {
        Ipo updatedIpo = iposService.updateIpo(ipoId, ipo);
        if (updatedIpo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedIpo);
    }

    @DeleteMapping("/{ipoId}")
    public ResponseEntity<Void> deleteIpo(@PathVariable String ipoId) {
        boolean deleted = iposService.deleteIpo(ipoId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
