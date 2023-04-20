package com.example.demo.Accessories;

import jakarta.persistence.*;

@Entity
@Table(name = "accessories")
public class Accessories {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String name;
        private String brand;
        private int price;
        private String imageUrl;
        private String imageUrl2;
        private String imageUrl3;
        private String imageUrl4;
        private int qty;
        private String description;
        
        public Accessories(){}

        public Accessories(long id, String name, String brand, int price, String imageUrl, String imageUrl2, String imageUrl3, String imageUrl4, int qty, String description) {
            this.id = id;
            this.name = name;
            this.brand = brand;
            this.price = price;
            this.imageUrl = imageUrl;
            this.imageUrl2 = imageUrl2;
            this.imageUrl3 = imageUrl3;
            this.imageUrl4 = imageUrl4;
            this.qty = qty;
            this.description = description;
        }

        public Accessories(String name, String brand, int price, String imageUrl, String imageUrl2, String imageUrl3, String imageUrl4, int qty, String description) {
            this.name = name;
            this.brand = brand;
            this.price = price;
            this.imageUrl = imageUrl;
            this.imageUrl2 = imageUrl2;
            this.imageUrl3 = imageUrl3;
            this.imageUrl4 = imageUrl4;
            this.qty = qty;
            this.description = description;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getImageUrl(){
            return imageUrl;
        }

        public void setImageUrl(String imageUrl){
            this.imageUrl = imageUrl;
        }

        public String getImageUrl2() {
            return imageUrl2;
        }

        public void setImageUrl2(String imageUrl2) {
            this.imageUrl2 = imageUrl2;
        }

        public String getImageUrl3() {
            return imageUrl3;
        }

        public void setImageUrl3(String imageUrl3) {
            this.imageUrl3 = imageUrl3;
        }

        public String getImageUrl4() {
            return imageUrl4;
        }

        public void setImageUrl4(String imageUrl4) {
            this.imageUrl4 = imageUrl4;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Accessories{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", brand='" + brand + '\'' +
                    ", price='" + price + '\'' +
                    ", imageUrl='" + imageUrl + '\'' +
                    ", imageUrl2='" + imageUrl2 + '\'' +
                    ", imageUrl3='" + imageUrl3 + '\'' +
                    ", imageUrl4='" + imageUrl4 + '\'' +
                    ", qty='" + qty + '\'' +
                    ", description='" + description +
                    '}';
        }
}
