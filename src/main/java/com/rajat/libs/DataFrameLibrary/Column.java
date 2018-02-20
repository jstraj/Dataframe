package java.com.rajat.libs.DataFrameLibrary;

public class Column {

    private int columnIndex;
    private String columnName;
    private ColumnType columnType;

    public Column(String columnName, ColumnType columnType) {
        this.columnName = columnName;
        this.columnType = columnType;
    }
}
