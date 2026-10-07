package com.aic.edudemo.web.vm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LabelValue {

    private String label;

    private String value;

    private boolean selectable = true;
}