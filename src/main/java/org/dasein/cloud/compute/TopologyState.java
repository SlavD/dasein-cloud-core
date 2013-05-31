/**
 * Copyright (C) 2009-2013 Dell, Inc.
 * See annotations for authorship information
 *
 * ====================================================================
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
 * ====================================================================
 */

package org.dasein.cloud.compute;

/**
 * Represents the current state of a {@link Topology}.
 * <p>Created by George Reese: 5/31/13 11:07 AM</p>
 * @author George Reese
 * @version 2013.07 initial version
 * @since 2013.07
 */
public enum TopologyState {
    /**
     * Active and available for provisioning
     */
    ACTIVE,
    /**
     * Active, but not currently available for provisioning
     */
    OFFLINE,
    /**
     * Deleted from the system
     */
    DELETED
}