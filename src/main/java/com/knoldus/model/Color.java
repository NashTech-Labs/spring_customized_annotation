package com.knoldus.model;

import com.knoldus.customizedAnnotations.ColorValidation;

public class Color {
    @ColorValidation()
    private String colorName;

    private String code;

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
