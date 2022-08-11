package com.company.accenturejaguarbpm.screen.catalogue;

import io.jmix.ui.screen.*;
import com.company.accenturejaguarbpm.entity.Catalogue;

@UiController("Catalogue.browse")
@UiDescriptor("catalogue-browse.xml")
@LookupComponent("cataloguesTable")
public class CatalogueBrowse extends StandardLookup<Catalogue> {
}