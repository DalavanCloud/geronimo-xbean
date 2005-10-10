/**
 *
 * Copyright 2005 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.gbean.server.annotation;

/**
 * DefaultConstructor is an annotation to select the default constructor for a class.  This annotation informs the
 * server that specific constructor should be used instead of the default no argument constrctor.  The system will
 * provide Java default values for an constructor argument that is not specified.
 *
 * @author Dain Sundstrom
 * @version $Id$
 * @since 1.0
 */
public interface DefaultConstructor {
}