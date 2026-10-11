package com.tatf.adminCes;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite por tag: regresion")
@SelectPackages("com.tatf.adminCes")
@IncludeTags("regresion")
public class SuiteRegresion {
}
