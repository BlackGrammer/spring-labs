package me.blgrm.validation.asset.controller;

import lombok.AllArgsConstructor;
import me.blgrm.validation.asset.service.AssetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class AssetController {

    private final AssetService assetService;


    @GetMapping("/assets/prices")
    public ResponseEntity<List<Map<String, Object>>> getAllAssetPrices() {
        List<Map<String, Object>> allAssetPrices = assetService.getAllAssetPrices();
        if(allAssetPrices.size() == 0) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(allAssetPrices);
    }
}

