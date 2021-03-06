//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// TemplateMetaData - MetaData for template.
//
public class TemplateMetaData {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String description;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer currentVersion;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer latestVersion;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String keywordsToReplace;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp timestamp;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean autoUpdate;

    public TemplateMetaData setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return description;
    }
    public TemplateMetaData setCurrentVersion(Integer currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public Integer getCurrentVersion() {
        return currentVersion;
    }
    public TemplateMetaData setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public Integer getLatestVersion() {
        return latestVersion;
    }
    public TemplateMetaData setKeywordsToReplace(String keywordsToReplace) {
        this.keywordsToReplace = keywordsToReplace;
        return this;
    }
    public String getKeywordsToReplace() {
        return keywordsToReplace;
    }
    public TemplateMetaData setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Timestamp getTimestamp() {
        return timestamp;
    }
    public TemplateMetaData setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }
    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != TemplateMetaData.class) {
                return false;
            }
            TemplateMetaData a = (TemplateMetaData) another;
            if (description == null ? a.description != null : !description.equals(a.description)) {
                return false;
            }
            if (currentVersion == null ? a.currentVersion != null : !currentVersion.equals(a.currentVersion)) {
                return false;
            }
            if (latestVersion == null ? a.latestVersion != null : !latestVersion.equals(a.latestVersion)) {
                return false;
            }
            if (keywordsToReplace == null ? a.keywordsToReplace != null : !keywordsToReplace.equals(a.keywordsToReplace)) {
                return false;
            }
            if (timestamp == null ? a.timestamp != null : !timestamp.equals(a.timestamp)) {
                return false;
            }
            if (autoUpdate == null ? a.autoUpdate != null : !autoUpdate.equals(a.autoUpdate)) {
                return false;
            }
        }
        return true;
    }
}
