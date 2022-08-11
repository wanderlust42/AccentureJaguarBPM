package com.company.accenturejaguarbpm.screen.deal;

import io.jmix.ui.screen.*;
import com.company.accenturejaguarbpm.entity.Deal;

@UiController("Deal.browse")
@UiDescriptor("deal-browse.xml")
@LookupComponent("dealsTable")
public class DealBrowse extends StandardLookup<Deal> {
}