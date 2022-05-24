package com.nguyenhuyhoang.lettutor.models.tutor;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tutors {

    @SerializedName("tutors")
    RowTutor row;

    public RowTutor getRow() {
        return row;
    }

    public void setRow(RowTutor row) {
        this.row = row;
    }
}