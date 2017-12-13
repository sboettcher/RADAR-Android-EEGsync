/*
 * Copyright 2017 Uniklinik Freiburg and The Hyve
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.radarcns.eegsync;

import android.support.annotation.NonNull;

import org.radarcns.android.device.DeviceServiceProvider;

import java.util.Collections;
import java.util.List;


public class EEGSyncProvider extends DeviceServiceProvider<EEGSyncStatus> {
    @Override
    public String getDescription() {
        return getRadarService().getString(R.string.eegsyncDescription);
    }

    @Override
    public Class<?> getServiceClass() {
        return EEGSyncService.class;
    }


    @Override
    public List<String> needsPermissions() {
        return Collections.emptyList();
    }

    @NonNull
    @Override
    public String getDeviceProducer() {
        return "EEGSync";
        }

    @NonNull
    @Override
    public String getDeviceModel() {
        return "GPIO177";
    }

    @NonNull
    @Override
    public String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override
    public String getDisplayName() {
        return getRadarService().getString(R.string.eegsyncLabel);
    }
}
