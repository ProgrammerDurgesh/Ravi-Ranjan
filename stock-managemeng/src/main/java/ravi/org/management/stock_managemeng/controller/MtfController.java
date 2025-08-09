package ravi.org.management.stock_managemeng.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/mtf")
public class MtfController {

    @GetMapping("/all")
    public List<String> getAllMtfRecords() {
        return null; // TODO: Implement logic
    }

    @GetMapping("/{mtfId}")
    public String getMtfRecordById(@PathVariable String mtfId) {
        return null; // TODO: Implement logic
    }

    @PostMapping("/save")
    public String saveMtfRecord(@RequestBody String mtfRecord) {
        return null; // TODO: Implement logic
    }

    @PutMapping("/update/{mtfId}")
    public String updateMtfRecord(@PathVariable String mtfId, @RequestBody String mtfRecord) {
        return null; // TODO: Implement logic
    }

    @DeleteMapping("/delete/{mtfId}")
    public String deleteMtfRecord(@PathVariable String mtfId) {
        return null; // TODO: Implement logic
    }
}
