package com.food.ordering.zinger.service;

import com.food.ordering.zinger.dao.ShopDao;
import com.food.ordering.zinger.model.ConfigurationModel;
import com.food.ordering.zinger.model.RequestHeaderModel;
import com.food.ordering.zinger.model.Response;
import com.food.ordering.zinger.model.ShopConfigurationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    ShopDao shopDao;

    public Response<String> insertShop(ConfigurationModel configurationModel, String oauthId, Integer id, String role) {
        RequestHeaderModel requestHeaderModel = new RequestHeaderModel(oauthId, id, role);
        return shopDao.insertShop(configurationModel, requestHeaderModel);
    }

    public Response<List<ShopConfigurationModel>> getShopByPlaceId(Integer placeId, String oauthId, Integer id, String role) {
        RequestHeaderModel requestHeaderModel = new RequestHeaderModel(oauthId, id, role);
        return shopDao.getShopsByPlaceId(placeId, requestHeaderModel);
    }

    public Response<String> updateShopConfiguration(ConfigurationModel configurationModel, String oauthId, Integer id, String role) {
        RequestHeaderModel requestHeaderModel = new RequestHeaderModel(oauthId, id, role);
        return shopDao.updateShopConfigurationModel(configurationModel, requestHeaderModel);
    }
}
