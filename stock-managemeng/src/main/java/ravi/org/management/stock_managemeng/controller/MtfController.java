package ravi.org.management.stock_managemeng.controller;

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

    @GetMapping("/filter/{quantity}/{share_symbol}/{expiry_date}")
    public List<Mtf> filter(@PathVariable String quantity, @PathVariable String share_symbol, @PathVariable String expiry_date)
    {
        return mtfService.filter(quantity,share_symbol,expiry_date);
    }

    @GetMapping("/all")
    public List<Mtf> getAllMtfRecords() {
        return mtfService.getAllMtfRecords();
    }

    @GetMapping("/{mtfId}")
    public Mtf getMtfRecordById(@PathVariable int mtfId) {
        return mtfService.getMtfRecordById(mtfId);
    }

    @PostMapping("/save")
    public Mtf saveMtfRecord(@RequestBody Mtf mtfRecord) {
        return mtfService.saveMtfRecord(mtfRecord);
    }

    @PutMapping("/update/{mtfId}")
    public Mtf updateMtfRecord(@PathVariable int mtfId, @RequestBody Mtf mtfRecord) {
        return mtfService.updateMtfRecord(mtfId, mtfRecord);
    }

    @DeleteMapping("/delete/{mtfId}")
    public boolean deleteMtfRecord(@PathVariable int mtfId) {
        return mtfService.deleteMtfRecord(mtfId);
    }
}
