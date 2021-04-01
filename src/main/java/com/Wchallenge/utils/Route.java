package com.Wchallenge.utils;

public class Route {

    public static final String BASE = "/Wchallenge";
    public static final String USER = "/user";
    public static final String PHOTO = "/photo";
    public static final String ALBUM = "/album";
    public static final String SHARED_ALBUM = "/sharedAlbum";
    public static final String POST = "/post";

    public static final String GETALL = "/getAll";
    public static final String GETBY_ID = "/getById/{id}";
    public static final String PHOTOS_BYIDUSER = "/photosByIdUser/{userId}";
    public static final String ALBUMS_BYIDUSER = "/albumsByIdUser/{userId}";
    public static final String REGISTER = "/register";
    public static final String UPDATE_PERMISSIONS = "/updatePermissions/{id}";
    public static final String GETSHARED_ALBUMPERMISSIONS = "/sharedAlbumPermissions/{albumId}";


//    Client
    public static final String USERS_CLIENT = "/users";
    public static final String PHOTOS_CLIENT = "/photos";
    public static final String AlBUMS_CLIENT = "/albums";
    public static final String GETBY_ID_CLIENT = "/{id}";
    public static final String GETBY_IDUSER_CLIENT = "/{userId}";
    public static final String GETBY_IDALBUM_CLIENT = "/{albumId}";
    public static final String POSTS_CLIENT = "/posts";

}
