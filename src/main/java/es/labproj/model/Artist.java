package es.labproj.model;


public class Artist {

    private String name;
    private String playcount;
    private String listeners;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaycount() {
        return this.playcount;
    }

    public void setPlaycount(String playcount) {
        this.playcount = playcount;
    }

    public String getListeners() {
        return this.listeners;
    }

    public void setListeners(String listeners) {
        this.listeners = listeners;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", playcount='" + getPlaycount() + "'" +
            ", listeners='" + getListeners() + "'" +
            "}";
    }

}