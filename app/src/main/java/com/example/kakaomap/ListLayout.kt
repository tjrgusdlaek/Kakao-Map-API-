package com.example.kakaomap

data class ListLayout
    (val name: String, val road: String, val address: String, val x: Double, val y: Double )
        // 장소명 ,도로명 주소 ,지번 주소 ,위도 (Latitude) ,경도(Longitude) ,val distance : String