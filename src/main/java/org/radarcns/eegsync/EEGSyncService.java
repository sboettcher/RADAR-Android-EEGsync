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

import org.apache.avro.specific.SpecificRecord;
import org.radarcns.android.device.DeviceService;
import org.radarcns.kafka.ObservationKey;
import org.radarcns.topic.AvroTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/**
 * A service that manages a EEGSyncManager and a TableDataHandler to send store the data of the
 * EEG synchronization and send it to a Kafka REST proxy.
 */
public class EEGSyncService extends DeviceService<EEGSyncStatus> {
    private static final Logger logger = LoggerFactory.getLogger(EEGSyncService.class);

    @Override
    protected EEGSyncManager createDeviceManager() {
        return new EEGSyncManager(this);
    }

    @Override
    protected EEGSyncStatus getDefaultState() {
        return new EEGSyncStatus();
    }
}
