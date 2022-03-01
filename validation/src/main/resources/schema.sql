DROP TABLE IF EXISTS ASSET;
DROP TABLE IF EXISTS ASSET_DETAIL;
DROP TABLE IF EXISTS ASSET_PRICE;

CREATE TABLE ASSET
(
    ASSET_ID    NUMBER,
    LOCATION    VARCHAR
);

CREATE TABLE ASSET_DETAIL
(
    ASSET_ID    NUMBER,
    BUILDING_NUMBER NUMBER,
    UNIT_NUMBER NUMBER
);

CREATE TABLE ASSET_PRICE
(
    ASSET_ID    NUMBER,
    BUILDING_NUMBER NUMBER,
    UNIT_NUMBER NUMBER,
    PRICE_SEQ NUMBER,
    DEPOSIT NUMBER,
    RENT NUMBER
);