/*
 * Copyright (C) 2016 Google Inc.
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

package com.google.copybara.exception;

/**
 * An exception thrown when a dependency expressed as a label in a content cannot be resolved.
 */
public class CannotResolveLabel extends ValidationException {

  public CannotResolveLabel(String message) {
    super(message);
  }

  public CannotResolveLabel(String message, Exception exception) {
    super(message, exception);
  }
}
