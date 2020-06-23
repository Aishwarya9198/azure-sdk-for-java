/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response indicates that the service is not able to process the
 * incoming request. The reason is provided in the error message.
 */
public class DataExportErrorResponse {
    /**
     * The details of the error.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Get the details of the error.
     *
     * @return the error value
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Set the details of the error.
     *
     * @param error the error value to set
     * @return the DataExportErrorResponse object itself.
     */
    public DataExportErrorResponse withError(ErrorResponse error) {
        this.error = error;
        return this;
    }

}
