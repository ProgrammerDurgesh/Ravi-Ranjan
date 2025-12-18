package org.management.controller;

import org.springframework.web.bind.annotation.*;
import org.management.dao.Ipo;
import org.management.service.IposService;

import java.util.List;

@RestController
@RequestMapping("/ipos")
public class IposController {

    private final IposService iposService;

    public IposController(IposService iposService) {
        this.iposService = iposService;
    }

    @GetMapping("/all")
    public List<Ipo> getAllIpos() {
        return iposService.getAllIpos();
    }

    @GetMapping("/{ipoId}")
    public Ipo getIpoById(@PathVariable int ipoId) {
        return iposService.getIpoById(ipoId);
    }

    @PostMapping("/save")
    public Ipo saveIpo(@RequestBody Ipo ipo) {
        return iposService.saveIpo(ipo);
    }

    @PutMapping("/update/{ipoId}")
    public Ipo updateIpo(@PathVariable int ipoId, @RequestBody Ipo ipo) {
        return iposService.updateIpo(ipoId, ipo);
    }

    @DeleteMapping("/delete/{ipoId}")
    public boolean deleteIpo(@PathVariable int ipoId) {
        return iposService.deleteIpo(ipoId);
    }
}
