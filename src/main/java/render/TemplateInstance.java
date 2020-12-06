package render;

import core.FreeMarkConfig;
import freemarker.template.Template;

import java.io.IOException;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 */
public enum TemplateInstance {

    BASIC(getConfig(TemplateEnums.BASIC));


    TemplateInstance(Template template) {
        this.template = template;
    }

    private Template template;

    public Template getTemplate() {
        return this.template;
    }

    private static Template getConfig(TemplateEnums tpl) {

        try {
            return FreeMarkConfig.getInstance().getTemplate(tpl.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
