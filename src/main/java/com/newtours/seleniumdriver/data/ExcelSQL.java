package com.newtours.seleniumdriver.data;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelSQL {

	// Método para traer datos de de una columna de Excel en una lista
	public List<String> DataExcel(String nombreColumna, String ruta, String nombreTabla, String query) throws FilloException {

		List<String> listColumn = new ArrayList<>();
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(ruta);
		String strQuery = query+" "+nombreTabla;
		Recordset recordset = connection.executeQuery(strQuery);

		while (recordset.next()) {
			listColumn.add(recordset.getField(nombreColumna));
		}

		recordset.close();
		connection.close();
		return listColumn;
	}

}
