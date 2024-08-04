package com.holbie.cardealership.service;

import com.holbie.cardealership.dto.BrandDTO;
import com.holbie.cardealership.entity.Brand;
import com.holbie.cardealership.repository.BrandRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandService {

    private final BrandRepository brandRepository;
    private final ModelMapper modelMapper;

    public void createBrand(BrandDTO brandDTO) {
        Brand brand = modelMapper.map(brandDTO, Brand.class);
        brandRepository.save(brand);
    }

    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }
}
