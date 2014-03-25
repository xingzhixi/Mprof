package dataflow.model.mapper;

import java.io.Serializable;

public class MapFunc implements Serializable {


    private static final long serialVersionUID = 3972332854774013306L;
    
    private long mapInputRecords; // equals "Map input records"
    private long mapInputBytes; // equals "HDFS_BYTES_READ"

    private long mapOutputRecords; // equals "Map output records"
    private long mapOutputBytes; // equals "Map output bytes"

    public long getMapInputRecords() {
	return mapInputRecords;
    }

    public void setMapInputRecords(long mapInputRecords) {
	this.mapInputRecords = mapInputRecords;
    }

    public long getMapInputBytes() {
	return mapInputBytes;
    }

    public void setMapInputBytes(long mapInputBytes) {
	this.mapInputBytes = mapInputBytes;
    }

    public long getMapOutputRecords() {
	return mapOutputRecords;
    }

    public void setMapOutputRecords(long mapOutputRecords) {
	this.mapOutputRecords = mapOutputRecords;
    }

    public long getMapOutputBytes() {
	return mapOutputBytes;
    }

    public void setMapOutputBytes(long mapOutputBytes) {
	this.mapOutputBytes = mapOutputBytes;
    }

}