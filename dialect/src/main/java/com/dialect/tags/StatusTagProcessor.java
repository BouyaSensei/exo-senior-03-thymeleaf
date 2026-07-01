package com.dialect.tags;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class StatusTagProcessor extends AbstractAttributeTagProcessor {

    private static final String ATTR_NAME = "badge";
    private static final int PRECEDENCE = 10000; // Priorité haute

    public StatusTagProcessor(final String dialectPrefix) {
        super(
                TemplateMode.HTML,
                dialectPrefix,
                null,
                false,
                ATTR_NAME,
                true,
                PRECEDENCE,
                true);
    }

    @Override
    protected void doProcess(ITemplateContext context, IProcessableElementTag tag,
            AttributeName attributeName, String attributeValue,
            IElementTagStructureHandler structureHandler) {

        String type = attributeValue;

        // On construit le nouveau HTML
        String badgeHtml = String.format(
                "<span class='badge badge-%s'>%s</span>",
                type,
                tag.getAttributeValue("tag:status"));

        structureHandler.replaceWith(badgeHtml, false);

    }
}