public enum Season {
    春季("春天", "温暖阳光"), 夏季("夏天", "烈日炎炎"),
    秋季("秋天", "秋高气爽"), 冬季("冬天", "银装素裹");

    private String season_name;        // 季节名
    private String feature;     // 特性

    Season(String season_name, String feature) {
        this.season_name = season_name;
        this.feature = feature;
    }

    @Override
    public String toString() {
        return this.feature + "的" + this.name();
    }
}
