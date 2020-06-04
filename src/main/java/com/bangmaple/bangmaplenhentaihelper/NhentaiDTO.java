package com.bangmaple.bangmaplenhentaihelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author bangmaple
 */
class InnerTag {

    private Long id;
    private String type;
    private String name;
    private String url;
    private Long count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InnerTag{id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }

}

public class NhentaiDTO implements Serializable {

    private Integer id;
    private String media_id;
    private String scanlator;
    private Long upload_date;
    private InnerTag[] tags;
    private Integer num_pages;
    private Long num_favorites;
    private Title title;
    private Images image;

     class Title {

        private String english;
        private String japanese;
        private String pretty;

        public String getEnglish() {
            return english;
        }

        public void setEnglish(String english) {
            this.english = english;
        }

        public String getJapanese() {
            return japanese;
        }

        public void setJapanese(String japanese) {
            this.japanese = japanese;
        }

        public String getPretty() {
            return pretty;
        }

        public void setPretty(String pretty) {
            this.pretty = pretty;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Title{english=").append(english);
            sb.append(", japanese=").append(japanese);
            sb.append(", pretty=").append(pretty);
            sb.append('}');
            return sb.toString();
        }

    }

     class Images {

         class InnerPage {

            private String t;
            private Integer w;
            private Integer h;

            public String getT() {
                return t;
            }

            public void setT(String t) {
                this.t = t;
            }

            public int getW() {
                return w;
            }

            public void setW(Integer w) {
                this.w = w;
            }

            public Integer getH() {
                return h;
            }

            public void setH(Integer h) {
                this.h = h;
            }

        }
        private InnerPage[] pages;
        private InnerPage cover;
        private InnerPage thumbnail;

        public InnerPage[] getPages() {
            return pages;
        }

        public void setPages(InnerPage[] pages) {
            this.pages = pages;
        }

        public InnerPage getCover() {
            return cover;
        }

        public void setCover(InnerPage cover) {
            this.cover = cover;
        }

        public InnerPage getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(InnerPage thumbnail) {
            this.thumbnail = thumbnail;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Images{pages=").append(Arrays.toString(pages));
            sb.append(", cover=").append(cover);
            sb.append(", thumbnail=").append(thumbnail);
            sb.append('}');
            return sb.toString();
        }

    }

    public Long getNum_favorites() {
        return num_favorites;
    }

    public void setNum_favorites(Long num_favorites) {
        this.num_favorites = num_favorites;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Images getImages() {
        return image;
    }

    public void setImages(Images images) {
        this.image = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public String getScanlator() {
        return scanlator;
    }

    public void setScanlator(String scanlator) {
        this.scanlator = scanlator;
    }

    public Long getUpload_date() {
        return upload_date;
    }

    public void setUpload_date(Long upload_date) {
        this.upload_date = upload_date;
    }

    public InnerTag[] getTags() {
        return tags;
    }

    public void setTags(InnerTag[] tags) {
        this.tags = tags;
    }

    public Integer getNum_pages() {
        return num_pages;
    }

    public void setNum_pages(Integer num_pages) {
        this.num_pages = num_pages;
    }

    public Long getNum_favories() {
        return num_favorites;
    }

    public void setNum_favories(Long num_favorites) {
        this.num_favorites = num_favorites;
    }

}
