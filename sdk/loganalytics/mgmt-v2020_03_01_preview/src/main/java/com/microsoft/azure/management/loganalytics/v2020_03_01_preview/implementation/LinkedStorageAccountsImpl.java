/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.DataSourceType;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.LinkedStorageAccounts;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.LinkedStorageAccountsResource;

class LinkedStorageAccountsImpl extends WrapperImpl<LinkedStorageAccountsInner> implements LinkedStorageAccounts {
    private final LogAnalyticsManager manager;

    LinkedStorageAccountsImpl(LogAnalyticsManager manager) {
        super(manager.inner().linkedStorageAccounts());
        this.manager = manager;
    }

    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public LinkedStorageAccountsResourceImpl define(String name) {
        return wrapModel(name);
    }

    private LinkedStorageAccountsResourceImpl wrapModel(LinkedStorageAccountsResourceInner inner) {
        return  new LinkedStorageAccountsResourceImpl(inner, manager());
    }

    private LinkedStorageAccountsResourceImpl wrapModel(String name) {
        return new LinkedStorageAccountsResourceImpl(name, this.manager());
    }

    @Override
    public Observable<LinkedStorageAccountsResource> listByWorkspaceAsync(String resourceGroupName, String workspaceName) {
        LinkedStorageAccountsInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .flatMap(new Func1<List<LinkedStorageAccountsResourceInner>, Observable<LinkedStorageAccountsResourceInner>>() {
            @Override
            public Observable<LinkedStorageAccountsResourceInner> call(List<LinkedStorageAccountsResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<LinkedStorageAccountsResourceInner, LinkedStorageAccountsResource>() {
            @Override
            public LinkedStorageAccountsResource call(LinkedStorageAccountsResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<LinkedStorageAccountsResource> getAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        LinkedStorageAccountsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, dataSourceType)
        .flatMap(new Func1<LinkedStorageAccountsResourceInner, Observable<LinkedStorageAccountsResource>>() {
            @Override
            public Observable<LinkedStorageAccountsResource> call(LinkedStorageAccountsResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((LinkedStorageAccountsResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        LinkedStorageAccountsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, dataSourceType).toCompletable();
    }

}
