/*
 * Copyright 2020 the original author or authors.
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

package org.gradle.docs.snippets;

import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.file.DirectoryProperty;

public interface Snippets {
    /**
     * By convention, this is src/docs/snippets
     *
     * @return The root sample directory.
     */
    DirectoryProperty getSnippetsRoot();

    /**
     * @return Container of all published snippets. This is the primary configuration point for all snippets.
     */
    NamedDomainObjectContainer<? extends Snippet> getPublishedSnippets();
}
