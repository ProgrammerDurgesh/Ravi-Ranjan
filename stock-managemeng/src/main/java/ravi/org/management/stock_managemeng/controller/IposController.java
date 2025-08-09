package ravi.org.management.stock_managemeng.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ipos")
public class IposController {

    @GetMapping("/all")
    public List<String> getAllIpos() {
        return null; // TODO: Implement logic
    }

    @GetMapping("/{ipoId}")
    public String getIpoById(@PathVariable String ipoId) {
        return null; // TODO: Implement logic
    }

    @PostMapping("/save")
    public String saveIpo(@RequestBody String ipo) {
        return null; // TODO: Implement logic
    }

    @PutMapping("/update/{ipoId}")
    public String updateIpo(@PathVariable String ipoId, @RequestBody String ipo) {
        return null; // TODO: Implement logic
    }

    @DeleteMapping("/delete/{ipoId}")
    public String deleteIpo(@PathVariable String ipoId) {
        return null; // TODO: Implement logic
    }
}
