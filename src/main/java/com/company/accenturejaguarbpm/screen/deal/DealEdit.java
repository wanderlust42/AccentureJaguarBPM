package com.company.accenturejaguarbpm.screen.deal;

import io.jmix.ui.screen.*;
import com.company.accenturejaguarbpm.entity.Deal;

@UiController("Deal.edit")
@UiDescriptor("deal-edit.xml")
@EditedEntityContainer("dealDc")
public class DealEdit extends StandardEditor<Deal> {
}