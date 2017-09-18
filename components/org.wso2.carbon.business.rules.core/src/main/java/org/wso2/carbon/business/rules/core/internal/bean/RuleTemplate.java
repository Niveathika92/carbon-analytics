/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.business.rules.core.internal.bean;


import java.util.Collection;
import java.util.Map;

/**
 * Represents a Rule Template, which consists of one or more Templates
 */
public class RuleTemplate {
    private String uuid;
    private String name;
    private String type;
    private String instanceCount; // "one" or "many"
    private String script; // Optional
    private String description; // Optional
    private Collection<Template> templates;
    private Map<String, RuleTemplateProperty> properties; // Name, RuleTemplateProperty object

    public RuleTemplate(String uuid, String name, String type, String instanceCount, String script, String description, Collection<Template> templates, Map<String, RuleTemplateProperty> properties) {
        this.uuid = uuid;
        this.name = name;
        this.type = type;
        this.instanceCount = instanceCount;
        this.script = script;
        this.description = description;
        this.templates = templates;
        this.properties = properties;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(String instanceCount) {
        this.instanceCount = instanceCount;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Template> getTemplates() {
        return templates;
    }

    public void setTemplates(Collection<Template> templates) {
        this.templates = templates;
    }

    public Map<String, RuleTemplateProperty> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, RuleTemplateProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "RuleTemplate{" +
                "\nuuid='" + uuid + '\'' +
                ", \nname='" + name + '\'' +
                ", \ntype='" + type + '\'' +
                ", \ninstanceCount='" + instanceCount + '\'' +
                ", \nscript='" + script + '\'' +
                ", \ndescription='" + description + '\'' +
                ", \ntemplates=" + templates +
                ", \nproperties=" + properties +
                "\n}";
    }
}
