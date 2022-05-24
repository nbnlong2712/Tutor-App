package com.nguyenhuyhoang.lettutor.models.tutor;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RowTutor {
    @SerializedName("rows")
    List<Tutor> tutorList = null;

    public List<Tutor> getTutorList() {
        return tutorList;
    }

    public void setTutorList(List<Tutor> tutorList) {
        this.tutorList = tutorList;
    }
}

