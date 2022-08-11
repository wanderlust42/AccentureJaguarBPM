package com.company.accenturejaguarbpm.screen.catalogue;

import io.jmix.ui.screen.*;
import com.company.accenturejaguarbpm.entity.Catalogue;

@UiController("Catalogue.edit")
@UiDescriptor("catalogue-edit.xml")
@EditedEntityContainer("catalogueDc")
public class CatalogueEdit extends StandardEditor<Catalogue> {
}