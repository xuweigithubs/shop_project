package manager.categories.vo;
public enum  CategoryEnum {
    LEVEL_ONE("0", "第0层");
    CategoryEnum(String value,String key){
        this.value=value;
        this.key=key;
    }
    private String value;
    private String key;
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
}
