package com.example.odlingino;

import java.util.List;

import wse.generated.definitions.GetSensorDataSchema;

public class AllData {
    List<GetSensorDataSchema.Data> ID1;
    List<GetSensorDataSchema.Data> ID2;
    List<GetSensorDataSchema.Data> ID3;
    List<GetSensorDataSchema.Data> ID4;

    AllData(List<GetSensorDataSchema.Data> ID1,List<GetSensorDataSchema.Data> ID2,List<GetSensorDataSchema.Data> ID3,List<GetSensorDataSchema.Data> ID4){
        this.ID1 = ID1;
        this.ID2 = ID2;
        this.ID3 = ID3;
        this.ID4 = ID4;
    }


    public List<GetSensorDataSchema.Data> getID1() {
        return ID1;
    }

    public List<GetSensorDataSchema.Data> getID2() {
        return ID2;
    }

    public List<GetSensorDataSchema.Data> getID3() {
        return ID3;
    }

    public List<GetSensorDataSchema.Data> getID4() {
        return ID4;
    }
}
