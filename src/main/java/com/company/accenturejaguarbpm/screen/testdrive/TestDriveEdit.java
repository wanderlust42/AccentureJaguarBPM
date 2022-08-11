package com.company.accenturejaguarbpm.screen.testdrive;

import io.jmix.ui.screen.*;
import com.company.accenturejaguarbpm.entity.TestDrive;

@UiController("TestDrive.edit")
@UiDescriptor("test-drive-edit.xml")
@EditedEntityContainer("testDriveDc")
public class TestDriveEdit extends StandardEditor<TestDrive> {
}