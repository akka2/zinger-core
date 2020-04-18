package com.food.ordering.zinger.controller;

import com.food.ordering.zinger.constant.Column.UserColumn;
import com.food.ordering.zinger.model.*;
import com.food.ordering.zinger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.food.ordering.zinger.constant.ApiConfig.UserApi.*;

@RestController
@RequestMapping(BASE_URL)
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = loginRegisterCustomer)
    public Response<UserPlaceModel> loginRegisterCustomer(@RequestBody UserModel user) {
        return userService.loginRegisterCustomer(user);
    }

    @PostMapping(value = verifySeller)
    public Response<UserShopListModel> verifySeller(@RequestBody UserModel user) {
        return userService.verifySeller(user);
    }

    /**************************************************/

    @PostMapping(value = inviteSeller)
    public Response<String> inviteSeller(@RequestBody UserShopModel userShopModel, @RequestHeader(value = UserColumn.oauthId) String oauthId, @RequestHeader(value = UserColumn.id) Integer id, @RequestHeader(value = UserColumn.role) String role) {
        return userService.inviteSeller(userShopModel, oauthId, id, role);
    }

    @PostMapping(value = acceptInvite)
    public Response<String> acceptInvite(@RequestBody UserShopModel userShopModel) {
        return userService.acceptInvite(userShopModel);
    }

    /**************************************************/

    @GetMapping(value = getSellerByShopId)
    public Response<List<UserModel>> getSellerByShopId(@PathVariable("shopId") Integer shopId, @RequestHeader(value = UserColumn.oauthId) String oauthId, @RequestHeader(value = UserColumn.id) Integer id, @RequestHeader(value = UserColumn.role) String role) {
        return userService.getSellerByShopId(shopId, oauthId, id, role);
    }

    @GetMapping(value = verifyInvite)
    public Response<UserInviteModel> verifyInvite(@PathVariable("shopId") Integer shopId, @PathVariable("mobile") String mobile) {
        return userService.verifyInvite(shopId, mobile);
    }

    /**************************************************/

    @PatchMapping(value = updateUser)
    public Response<String> updateUser(@RequestBody UserModel userModel, @RequestHeader(value = UserColumn.oauthId) String oauthId, @RequestHeader(value = UserColumn.id) Integer id, @RequestHeader(value = UserColumn.role) String role) {
        return userService.updateUser(userModel, oauthId, id, role);
    }

    @PatchMapping(value = updateUserPlaceData)
    public Response<String> updateUserPlaceData(@RequestBody UserPlaceModel userPlaceModel, @RequestHeader(value = UserColumn.oauthId) String oauthId, @RequestHeader(value = UserColumn.id) Integer id, @RequestHeader(value = UserColumn.role) String role) {
        return userService.updateUserPlaceData(userPlaceModel, oauthId, id, role);
    }

    @PatchMapping(value = deleteInvite)
    public Response<String> deleteInvite(@RequestBody UserShopModel userShopModel, @RequestHeader(value = UserColumn.oauthId) String oauthId, @RequestHeader(value = UserColumn.id) Integer id, @RequestHeader(value = UserColumn.role) String role) {
        return userService.deleteInvite(userShopModel, oauthId, id, role);
    }

    /**************************************************/

    @DeleteMapping(value = deleteSeller)
    public Response<String> deleteSeller(@PathVariable("shopId") Integer shopId, @PathVariable("userId") Integer userId, @RequestHeader(value = UserColumn.oauthId) String oauthId, @RequestHeader(value = UserColumn.id) Integer id, @RequestHeader(value = UserColumn.role) String role) {
        return userService.deleteSeller(shopId, userId, oauthId, id, role);
    }
}
