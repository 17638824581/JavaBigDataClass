public enum Esex {

    man("男"), woman("女");

    private String sex;

    Esex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.sex;
    }
}
