package com.fire.android.recyclerviewscrolldemo;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/8/22.
 * Auther：Administrator
 * Email：1606561454@qq.com
 * Description：
 */

public class ContentBean implements Serializable{
    /**
     * date : 2017-08-21
     * dayOfWeek : 星期一
     * details : {"morningRecipeSet":[{"id":1,"name":"鱼香茄子",
     * "description":"这是鱼香茄子是是把鱼做成茄子的造型","imageUrl":"http://172.16.101.154:8083/1.jpg",
     * "category":"素菜"}],"noonRecipeSet":[{"id":2,"name":"青椒肉丝",
     * "description":"这是青椒肉丝很好吃的哦","imageUrl":"http://172.16.101.154:8083/2.jpg",
     * "category":"荤菜"}],"eveningRecipeSet":[{"id":3,"name":"麻婆豆腐",
     * "description":"这是麻婆豆腐，有很多花椒哦!","imageUrl":"http://172.16.101.154:8083/3.jpg",
     * "category":"面食"}]}
     */

    private String date;
    private String dayOfWeek;
    private DetailsBean details;

    private String configDate;

    public String getConfigDate() {
        return configDate;
    }

    public void setConfigDate(String configDate) {
        this.configDate = configDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public DetailsBean getDetails() {
        return details;
    }

    public void setDetails(DetailsBean details) {
        this.details = details;
    }

    public static class DetailsBean implements Serializable {
        private List<MorningRecipeSetBean> morningRecipeSet;
        private List<MorningRecipeSetBean> noonRecipeSet;
        private List<MorningRecipeSetBean> eveningRecipeSet;

        public List<MorningRecipeSetBean> getMorningRecipeSet() {
            return morningRecipeSet;
        }

        public void setMorningRecipeSet(List<MorningRecipeSetBean> morningRecipeSet) {
            this.morningRecipeSet = morningRecipeSet;
        }

        public List<MorningRecipeSetBean> getNoonRecipeSet() {
            return noonRecipeSet;
        }

        public void setNoonRecipeSet(List<MorningRecipeSetBean> noonRecipeSet) {
            this.noonRecipeSet = noonRecipeSet;
        }

        public List<MorningRecipeSetBean> getEveningRecipeSet() {
            return eveningRecipeSet;
        }

        public void setEveningRecipeSet(List<MorningRecipeSetBean> eveningRecipeSet) {
            this.eveningRecipeSet = eveningRecipeSet;
        }

        public static class MorningRecipeSetBean implements Serializable,MultiItemEntity{
            /**
             * id : 1
             * name : 鱼香茄子
             * description : 这是鱼香茄子是是把鱼做成茄子的造型
             * imageUrl : http://172.16.101.154:8083/1.jpg
             * category : 素菜
             */

            private int id;
            private String name;
            private String description;
            private String imageUrl;
            private String category;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            @Override
            public int getItemType() {
                return 1;
            }
        }

        public static class NoonRecipeSetBean implements Serializable{
            /**
             * id : 2
             * name : 青椒肉丝
             * description : 这是青椒肉丝很好吃的哦
             * imageUrl : http://172.16.101.154:8083/2.jpg
             * category : 荤菜
             */

            private int id;
            private String name;
            private String description;
            private String imageUrl;
            private String category;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }
        }

        public static class EveningRecipeSetBean implements Serializable{
            /**
             * id : 3
             * name : 麻婆豆腐
             * description : 这是麻婆豆腐，有很多花椒哦!
             * imageUrl : http://172.16.101.154:8083/3.jpg
             * category : 面食
             */

            private int id;
            private String name;
            private String description;
            private String imageUrl;
            private String category;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }
        }
    }
}
