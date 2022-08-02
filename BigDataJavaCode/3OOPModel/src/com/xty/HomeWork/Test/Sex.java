package com.xty.HomeWork.Test;

public enum Sex {
    MAN("男人", "英俊"), WOMEN("女人", "美丽");

    private String sex;
    private String nature;

    Sex(String sex, String nature) {
        this.sex = sex;
        this.nature = nature;
    }

    public String getSex() {
        return sex;
    }

    public String getNature() {
        return nature;
    }
}
