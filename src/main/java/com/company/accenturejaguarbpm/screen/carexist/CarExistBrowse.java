package com.company.accenturejaguarbpm.screen.carexist;

import io.jmix.ui.screen.*;
import com.company.accenturejaguarbpm.entity.CarExist;

@UiController("CarExist.browse")
@UiDescriptor("car-exist-browse.xml")
@LookupComponent("carExistsTable")
public class CarExistBrowse extends StandardLookup<CarExist> {
}