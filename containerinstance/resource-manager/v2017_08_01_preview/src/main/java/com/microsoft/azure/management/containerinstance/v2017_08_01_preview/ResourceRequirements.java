/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource requirements.
 */
public class ResourceRequirements {
    /**
     * The resource requests of this container instance.
     */
    @JsonProperty(value = "requests", required = true)
    private ResourceRequests requests;

    /**
     * The resource limits of this container instance.
     */
    @JsonProperty(value = "limits")
    private ResourceLimits limits;

    /**
     * Get the resource requests of this container instance.
     *
     * @return the requests value
     */
    public ResourceRequests requests() {
        return this.requests;
    }

    /**
     * Set the resource requests of this container instance.
     *
     * @param requests the requests value to set
     * @return the ResourceRequirements object itself.
     */
    public ResourceRequirements withRequests(ResourceRequests requests) {
        this.requests = requests;
        return this;
    }

    /**
     * Get the resource limits of this container instance.
     *
     * @return the limits value
     */
    public ResourceLimits limits() {
        return this.limits;
    }

    /**
     * Set the resource limits of this container instance.
     *
     * @param limits the limits value to set
     * @return the ResourceRequirements object itself.
     */
    public ResourceRequirements withLimits(ResourceLimits limits) {
        this.limits = limits;
        return this;
    }

}
