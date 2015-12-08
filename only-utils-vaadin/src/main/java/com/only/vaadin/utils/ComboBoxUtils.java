/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.only.vaadin.utils;

import com.vaadin.ui.ComboBox;

/**
 *
 * @since 0.0.1-SNAPSHOT
 * @author �scar Montes
 *
 */
public class ComboBoxUtils {
	/**
	 * Check if the ComboBox is null and the value is null or empty
	 * 
	 * @param comboBox
	 * @return {@code true} if the ComboBox is null or the value is null, empty
	 */
	public static boolean isValueNotEmpty(ComboBox comboBox) {

		return comboBox != null && comboBox.getValue() != null
				&& comboBox.getItemCaption(comboBox.getValue()).isEmpty() == false;

	}
}