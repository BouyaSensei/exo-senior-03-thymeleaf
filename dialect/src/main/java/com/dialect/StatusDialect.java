package com.dialect;

import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;

import com.dialect.tags.StatusTagProcessor;

public class StatusDialect extends AbstractProcessorDialect {

    public StatusDialect() {
        super("StatusDialect", "tag", 1_000);
    }

    @Override
    public Set<IProcessor> getProcessors(String dialectPrefix) {
        return Set.of(new StatusTagProcessor("tag"));
    }

}