package render;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
 */
public enum TemplateEnums {

    BASIC("basic.ftlh");

    private String name;

    TemplateEnums(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
