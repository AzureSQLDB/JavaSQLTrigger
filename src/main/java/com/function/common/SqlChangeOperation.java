package com.function.common;

import com.google.gson.annotations.SerializedName;

public enum SqlChangeOperation {
    @SerializedName("0")
    Insert,
    @SerializedName("1")
    Update,
    @SerializedName("2")
    Delete;
}