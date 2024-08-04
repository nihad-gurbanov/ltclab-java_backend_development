package com.holbie.cardealership.controller;

import com.holbie.cardealership.dto.BrandDTO;
import com.holbie.cardealership.entity.Brand;
import com.holbie.cardealership.service.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.StringReader;
import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandController {
    private final BrandService brandService;

    @PostMapping("/create")
    public String createBrand(@RequestBody BrandDTO brandDTO) {
        brandService.createBrand(brandDTO);
        return "Brand created successfully";
    }
    @GetMapping("/all")
    public List<Brand> getAllBrands() {
        return brandService.getAllBrands();
    }
}
