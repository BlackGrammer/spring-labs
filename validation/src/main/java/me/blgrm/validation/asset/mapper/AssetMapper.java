package me.blgrm.validation.asset.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AssetMapper {

    List<Map<String, Object>> findAllAssetPrices();

}
