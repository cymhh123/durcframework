package org.durcframework.expression.subexpression;

import org.durcframework.expression.SqlContent;

/**
 * 内连接条件
 * 
 * @author thc 2011-10-28
 */
public class InnerJoinExpression extends AbstractJoinExpression {

	public InnerJoinExpression(String secondTableName,
			String secondTableTableAlias, String firstTableColumn,
			String secondTableColumn) {
		super(secondTableName, secondTableTableAlias, firstTableColumn,
				secondTableColumn);
	}

	@Override
	protected String getJoinType() {
		return SqlContent.INNER_JOIN;
	}

}
