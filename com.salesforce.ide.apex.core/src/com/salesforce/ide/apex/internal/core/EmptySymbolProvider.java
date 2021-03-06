/*
 * Copyright 2016 salesforce.com, inc.
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

package com.salesforce.ide.apex.internal.core;

import apex.jorje.semantic.compiler.CodeUnit;
import apex.jorje.semantic.compiler.Namespace;
import apex.jorje.semantic.compiler.sfdc.SymbolProvider;
import apex.jorje.semantic.symbol.resolver.SymbolResolver;
import apex.jorje.semantic.symbol.type.TypeInfo;

/**
 * @author jspagnola
 */
public class EmptySymbolProvider implements SymbolProvider {

	private static final EmptySymbolProvider INSTANCE = new EmptySymbolProvider();

	EmptySymbolProvider() {
	}

	public static EmptySymbolProvider get() {
		return INSTANCE;
	}

	@Override
	public void reportParsed(final CodeUnit codeUnit) {
	}

	@Override
	public TypeInfo find(final SymbolResolver symbols, final TypeInfo referencingType, final String lowerCaseFullName) {
		return null;
	}

	@Override
	public TypeInfo getVfComponentType(final SymbolResolver symbols, final TypeInfo referencingType,
			final Namespace namespace, final String name) {
		return null;
	}

	@Override
	public TypeInfo getFlowInterviewType(final SymbolResolver symbols, final TypeInfo referencingType,
			final Namespace namespace, final String name) {
		return null;
	}

	@Override
	public TypeInfo getSObjectType(final TypeInfo referencingType, final String name) {
		return null;
	}

	@Override
	public String getPageReference(final TypeInfo referencingType, final String name) {
		return null;
	}

	@Override
	public boolean hasLabelField(final TypeInfo referencingType, final Namespace namespace, final String name) {
		return false;
	}
}