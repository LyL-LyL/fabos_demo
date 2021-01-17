package com.example.demo.service;

import com.example.demo.mappers.StorageMapper;
import com.example.demo.model.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@Transactional
@Service
public class StorageService {

    @Autowired
    private StorageMapper storageMapper;

    public int addOrder() {

        return 1;
    }

    //增加库存
    public int addStorage() {
        Storage storage = new Storage();
        //仓库Id用UUID生成
        String storageId = UUID.randomUUID().toString().replaceAll("-", "");
        storage.setStorageId(storageId);
        storage.setStuffName("B仓库");
        storage.setStorageQuantity(30);
        int result = storageMapper.insertSelective(storage);
        return result;
    }


}
