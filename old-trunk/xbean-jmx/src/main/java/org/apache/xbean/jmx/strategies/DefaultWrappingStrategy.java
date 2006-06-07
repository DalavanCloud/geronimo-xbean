/**
 *
 * Copyright 2005-2006 The Apache Software Foundation or its licensors, as applicable.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.xbean.jmx.strategies;

import java.util.Properties;

import org.apache.xbean.jmx.JMXException;
import org.apache.xbean.jmx.JMXWrappingStrategy;


/**
 * @version $Revision: $ $Date: $
 */
public class DefaultWrappingStrategy implements JMXWrappingStrategy {

    public Object wrapObject(Object service, Properties config) throws JMXException {
        return service;
    }

    public void unwrapObject(Object service, Properties config) {
    }
}
