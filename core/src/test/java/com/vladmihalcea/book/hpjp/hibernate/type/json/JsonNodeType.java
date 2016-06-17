/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */

package com.vladmihalcea.book.hpjp.hibernate.type.json;

import com.fasterxml.jackson.databind.JsonNode;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;

/**
 * Descriptor for a Json type.
 *
 * @author Vlad MIhalcea
 *
 */
public class JsonNodeType extends AbstractSingleColumnStandardBasicType<JsonNode> {

	public static final JsonNodeType INSTANCE = new JsonNodeType();

	public JsonNodeType() {
		super( JsonNodeSqlTypeDescriptor.INSTANCE, JsonNodeJavaTypeDescriptor.INSTANCE );
	}

	public String getName() {
		return "json-node";
	}

	@Override
	protected boolean registerUnderJavaType() {
		return true;
	}

}