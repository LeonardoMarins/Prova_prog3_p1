/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1.backend;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author marin
 */
public class ExportarExcel {
    
    public void ExportaExcel(String nomePlanilha) throws IOException {
        Workbook workbook = new XSSFWorkbook(); // Cria um novo arquivo Excel em formato .xlsx
        Sheet sheet = workbook.createSheet(nomePlanilha); // Cria uma nova planilha
        
        Row row = sheet.createRow(0); // Cria uma nova linha na planilha
        Cell cell = row.createCell(0); // Cria uma célula na primeira coluna da linha
        cell.setCellValue("Hello, World!"); // Define o valor da célula
        
        FileOutputStream fileOut = new FileOutputStream("workbook.xlsx"); // Nome do arquivo de saída
        workbook.write(fileOut); // Escreve os dados no arquivo Excel
        fileOut.close(); // Fecha o stream
        workbook.close(); // Fecha o workbook
    }
}
