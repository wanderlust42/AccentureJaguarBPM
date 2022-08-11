package com.company.accenturejaguarbpm.screen.testdrive;

import io.jmix.ui.screen.*;
import com.company.accenturejaguarbpm.entity.TestDrive;

@UiController("TestDrive.browse")
@UiDescriptor("test-drive-browse.xml")
@LookupComponent("testDrivesTable")
public class TestDriveBrowse extends StandardLookup<TestDrive> {
}