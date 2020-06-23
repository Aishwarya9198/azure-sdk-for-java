/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerinstance.v2019_12_01.implementation.UsageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerinstance.v2019_12_01.implementation.ContainerInstanceManager;

/**
 * Type representing Usage.
 */
public interface Usage extends HasInner<UsageInner>, HasManager<ContainerInstanceManager> {
    /**
     * @return the currentValue value.
     */
    Integer currentValue();

    /**
     * @return the limit value.
     */
    Integer limit();

    /**
     * @return the name value.
     */
    UsageName name();

    /**
     * @return the unit value.
     */
    String unit();

}
