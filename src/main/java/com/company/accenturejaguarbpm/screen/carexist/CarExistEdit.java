package com.company.accenturejaguarbpm.screen.carexist;

import io.jmix.ui.screen.*;
import com.company.accenturejaguarbpm.entity.CarExist;

@UiController("CarExist.edit")
@UiDescriptor("car-exist-edit.xml")
@EditedEntityContainer("carExistDc")
public class CarExistEdit extends StandardEditor<CarExist> {
}