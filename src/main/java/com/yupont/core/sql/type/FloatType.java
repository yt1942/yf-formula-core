/*
 * Copyright 2016 requery.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yupont.core.sql.type;

import com.yupont.core.sql.Keywords;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
/**
 * @author Administrator
 */
public class FloatType extends BaseType<Float> implements PrimitiveFloatType
{

	public FloatType()
	{
		super(Float.class, Types.FLOAT);
	}

	@Override
	public Float fromResult(ResultSet results, int column) throws SQLException
	{
		return results.getFloat(column);
	}

	@Override
	public Keywords getKeyword()
	{
		return Keywords.FLOAT;
	}

	@Override
	public float readFloat(ResultSet results, int column) throws SQLException
	{
		return results.getFloat(column);
	}

	@Override
	public void writeFloat(PreparedStatement statement, int index, float value)
			throws SQLException
	{
		statement.setFloat(index, value);
	}
}
