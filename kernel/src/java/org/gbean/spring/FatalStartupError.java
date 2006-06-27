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
package org.gbean.spring;

/**
 * @version $Revision$ $Date$
 */
public class FatalStartupError extends Error {
    private final int exitCode;
    private static final int DEFAULT_EXIT_CODE = 3;

    public FatalStartupError(String message) {
        this(message, DEFAULT_EXIT_CODE);
    }

    public FatalStartupError(String message, int exitCode) {
        super(message);
        this.exitCode = exitCode;
    }

    public FatalStartupError(String message, Throwable cause) {
        this(message, DEFAULT_EXIT_CODE, cause);
    }

    public FatalStartupError(String message, int exitCode, Throwable cause) {
        super(message, cause);
        this.exitCode = exitCode;
    }

    public int getExitCode() {
        return exitCode;
    }
}
