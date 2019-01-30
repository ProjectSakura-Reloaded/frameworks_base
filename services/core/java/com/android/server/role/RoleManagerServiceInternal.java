/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.server.role;

import android.annotation.NonNull;
import android.os.UserHandle;
import android.util.ArrayMap;
import android.util.ArraySet;

/**
 * Internal calls into {@link RoleManagerService}
 */
public abstract class RoleManagerServiceInternal {
    /**
     * Get all roles and packages hold them.
     *
     * @param user The user to query to roles for
     *
     * @return The roles and their holders
     */
    @NonNull
    public abstract ArrayMap<String, ArraySet<String>> getRoleHoldersAsUser(
            @NonNull UserHandle user);
}
