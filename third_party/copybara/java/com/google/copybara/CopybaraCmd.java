/*
 * Copyright (C) 2018 Google Inc.
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

package com.google.copybara;

import com.google.copybara.exception.RepoException;
import com.google.copybara.exception.ValidationException;
import com.google.copybara.util.ExitCode;
import java.io.IOException;

/**
 * A Copybara command like 'info' 'migrate', etc.
 */
public interface CopybaraCmd {

  /**
   * Run the command
   * @param commandEnv Command environment: Params, workdir, etc.
   * @return Result exit code
   */
  ExitCode run(CommandEnv commandEnv) throws ValidationException, IOException, RepoException;

  /**
   * Command name
   */
  String name();

}
