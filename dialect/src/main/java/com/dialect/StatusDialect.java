package com.dialect;

import java.util.Set;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;

import com.dialect.tags.StatusTagProcessor;

public class StatusDialect extends AbstractDialect {

    public StatusDialect() {
        super("StatusDialect");
    }

    public Set<IProcessor> getProcessors(ITemplateContext context) {
        return Set.of(new StatusTagProcessor("tag"));
    }

}