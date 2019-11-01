package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    public String heroName;
    public String imgUrl;

    public SuperHero(String heroName, String imgUrl) {
        this.heroName = heroName;
        this.imgUrl = imgUrl;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

