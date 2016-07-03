/*******************************************************************************
 * Copyright 2016 Pitney Bowes Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 *  See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.pb.locationintelligence.geocode.model;

public enum MatchMode {

	EXACT("Exact"), STANDARD("Standard"), RELAXED("Relaxed"), CUSTOM("Custom"), INTERACTIVE("Interactive");

	private final String value;

	private MatchMode(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static MatchMode fromValue(String v) {
		for (MatchMode c : MatchMode.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}