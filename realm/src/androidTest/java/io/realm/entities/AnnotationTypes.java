/*
 * Copyright 2014 Realm Inc.
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

package io.realm.entities;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.Index;

public class AnnotationTypes extends RealmObject {
    @Index
    private String indexString;
    private String notIndexString;
    @Ignore
    private String ignoreString;

    public String getIndexString() {
        return indexString;
    }

    public void setIndexString(String indexString) {
        this.indexString = indexString;
    }

    public String getNotIndexString() {
        return notIndexString;
    }

    public void setNotIndexString(String notIndexString) {
        this.notIndexString = notIndexString;
    }

    public String getIgnoreString() {
        return ignoreString;
    }

    public void setIgnoreString(String ignoreString) {
        this.ignoreString = ignoreString;
    }
}
