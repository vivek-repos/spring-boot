/*
 * Copyright 2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.maven;

import org.apache.maven.plugins.annotations.Parameter;

/**
 * A class which represents maven dependency path - an old path(which needs to be shortened) and the new
 * path(short path to be replaced).
 *
 * @author Vivek
 * @since 1.0
 */
public class DependencyPath {

	/**
	 * long old path.
	 */
	@Parameter
	private String oldPath;

	/**
	 * short new path.
	 */
	@Parameter
	private String newPath;

	public String getOldPath() {
		return this.oldPath;
	}

	public void setOldPath(String oldPath) {
		this.oldPath = oldPath;
	}

	public String getNewPath() {
		return this.newPath;
	}

	public void setNewPath(String newPath) {
		this.newPath = newPath;
	}

}
