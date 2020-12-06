package render;

import core.FreeMarkConfig;
import freemarker.template.Template;

import java.io.IOException;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
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
