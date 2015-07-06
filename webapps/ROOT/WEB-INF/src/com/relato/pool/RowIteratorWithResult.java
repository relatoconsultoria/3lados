/*
 * Created on 08/07/2004
 *
 */
package com.relato.pool;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Kumpera
 *
 */
public interface RowIteratorWithResult {
	Object iterate(ResultSet rs) throws SQLException;
}
