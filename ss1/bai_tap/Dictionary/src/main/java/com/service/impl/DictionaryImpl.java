package com.service.impl;

import com.service.IDictionaryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryImpl implements IDictionaryService {

    @Override
    public String searchDictional(String search) {
        String value = "";
        String value2 = "khong tim thay";
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "xin chào");
        stringMap.put("sport", "thể thao");
        stringMap.put("Shoe", "Giày");
        stringMap.put("Salary", "Lương");
        stringMap.put("telephone", "điện thoại");
        stringMap.put("supermarket", "siêu thị");
        stringMap.put("tree", "cây");
        stringMap.put("volleyball", "bóng chuyền");
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            if (search.equals(entry.getKey())) {
                value = entry.getValue();
                return value;
            }
        }

        return value2;
    }
}
