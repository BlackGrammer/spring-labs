package me.blgrm.validation.asset.service;

import lombok.AllArgsConstructor;
import me.blgrm.validation.asset.mapper.AssetMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class AssetService {

    private final AssetMapper assetMapper;

    public List<Map<String, Object>> getAllAssetPrices() {
        return assetMapper.findAllAssetPrices();
    }


}
