package org.management.controller;

import org.springframework.web.bind.annotation.*;
import org.management.dao.Share;

import java.util.List;

@RestController
@RequestMapping("/share")//api name url
public class ShareController {
    @GetMapping("/all")
    public List<Share> getAllShares() {
        return null; // TODO: Implement logic
    }

    @GetMapping("/{shareId}")
    public Share getShareById(@PathVariable String shareId) {
        return null; // TODO: Implement logic
    }

    //www.bse.com/shares
    @PostMapping("/save")
    public Share saveShare(@RequestBody Share share) {
        return null; // TODO: Implement logic
    }


    @PutMapping("/update/{shareId}")
    public Share updateShare(@PathVariable String shareId, @RequestBody Share share) {
        return null; // TODO: Implement logic
    }

    @DeleteMapping("/delete/{shareId}")
    public String deleteShare(@PathVariable String shareId) {
        return null; // TODO: Implement logic
    }
}
