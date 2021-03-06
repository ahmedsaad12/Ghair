package com.endpoint.ghair.models;

import java.io.Serializable;
import java.util.List;

public class Market_Model implements Serializable {
    private List<Data> data;
    private int current_page;

    public List<Data> getData() {
        return data;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public class Data implements Serializable
    {
          private int id;
                  private String user_type;
                  private String name;
                  private String ar_market_title;
                  private String en_market_title;
                  private String email;
                  private String phone_code;
                  private String phone;
                  private String national_number;
                  private String address;
                  private double latitude;
                  private double longitude;
                  private String logo;
                  private String email_verified_at;
                  private int country_id;
                  private int city_id;
                  private int block;
                  private String is_accepted;
                  private int is_login;
                  private long logout_time;
                  private int is_confirmed;
                  private String market_title;

        public int getId() {
            return id;
        }

        public String getUser_type() {
            return user_type;
        }

        public String getName() {
            return name;
        }

        public String getAr_market_title() {
            return ar_market_title;
        }

        public String getEn_market_title() {
            return en_market_title;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone_code() {
            return phone_code;
        }

        public String getPhone() {
            return phone;
        }

        public String getNational_number() {
            return national_number;
        }

        public String getAddress() {
            return address;
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public String getLogo() {
            return logo;
        }

        public String getEmail_verified_at() {
            return email_verified_at;
        }

        public int getCountry_id() {
            return country_id;
        }

        public int getCity_id() {
            return city_id;
        }

        public int getBlock() {
            return block;
        }

        public String getIs_accepted() {
            return is_accepted;
        }

        public int getIs_login() {
            return is_login;
        }

        public long getLogout_time() {
            return logout_time;
        }

        public int getIs_confirmed() {
            return is_confirmed;
        }

        public String getMarket_title() {
            return market_title;
        }
    }}