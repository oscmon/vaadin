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
package com.vaadin.commons.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.only.vaadin.utils.ComboBoxUtils;
import com.vaadin.ui.ComboBox;

public class ComboBoxUtilsTest {

	@Test
	public void testComboBoxNull() {
		ComboBox comboBox = null;
		assertFalse(ComboBoxUtils.isValueNotEmpty(comboBox));
	}

	@Test
	public void testComboBoxValueNull() {
		ComboBox comboBox = new ComboBox();
		comboBox.setValue(null);
		assertFalse(ComboBoxUtils.isValueNotEmpty(comboBox));
	}

	@Test
	public void testComboBoxValueEmpty() {
		ComboBox comboBox = new ComboBox();
		comboBox.addItem(1);
		comboBox.setItemCaption(1, "One");
		assertFalse(ComboBoxUtils.isValueNotEmpty(comboBox));
	}

	@Test
	public void testComboBoxValueTrue() {
		ComboBox comboBox = new ComboBox();
		comboBox.addItem(1);
		comboBox.setItemCaption(1, "One");
		comboBox.setValue(1);
		assertTrue(ComboBoxUtils.isValueNotEmpty(comboBox));
	}

}
