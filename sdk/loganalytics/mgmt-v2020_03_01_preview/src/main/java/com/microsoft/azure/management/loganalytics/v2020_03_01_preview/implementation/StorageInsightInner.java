/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.StorageAccount;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.StorageInsightStatus;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The top level storage insight resource container.
 */
@JsonFlatten
public class StorageInsightInner extends ProxyResource {
    /**
     * The names of the blob containers that the workspace should read.
     */
    @JsonProperty(value = "properties.containers")
    private List<String> containers;

    /**
     * The names of the Azure tables that the workspace should read.
     */
    @JsonProperty(value = "properties.tables")
    private List<String> tables;

    /**
     * The storage account connection details.
     */
    @JsonProperty(value = "properties.storageAccount", required = true)
    private StorageAccount storageAccount;

    /**
     * The status of the storage insight.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private StorageInsightStatus status;

    /**
     * The ETag of the storage insight.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the names of the blob containers that the workspace should read.
     *
     * @return the containers value
     */
    public List<String> containers() {
        return this.containers;
    }

    /**
     * Set the names of the blob containers that the workspace should read.
     *
     * @param containers the containers value to set
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withContainers(List<String> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Get the names of the Azure tables that the workspace should read.
     *
     * @return the tables value
     */
    public List<String> tables() {
        return this.tables;
    }

    /**
     * Set the names of the Azure tables that the workspace should read.
     *
     * @param tables the tables value to set
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withTables(List<String> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the storage account connection details.
     *
     * @return the storageAccount value
     */
    public StorageAccount storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set the storage account connection details.
     *
     * @param storageAccount the storageAccount value to set
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withStorageAccount(StorageAccount storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

    /**
     * Get the status of the storage insight.
     *
     * @return the status value
     */
    public StorageInsightStatus status() {
        return this.status;
    }

    /**
     * Get the ETag of the storage insight.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the ETag of the storage insight.
     *
     * @param eTag the eTag value to set
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
