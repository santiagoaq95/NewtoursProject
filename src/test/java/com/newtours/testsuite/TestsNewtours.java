package com.newtours.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.newtours.testcase.VerifyNewtoursLogin;
import com.wordpress.testcases.VerifyWordpressLogin;

@RunWith(Suite.class)
@SuiteClasses({ VerifyNewtoursLogin.class, VerifyWordpressLogin.class })
public class TestsNewtours {

}
