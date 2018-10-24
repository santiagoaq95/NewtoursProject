package com.wordpress.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.wordpress.testcases.VerifyWordpressLogin;

@RunWith(Suite.class)
@SuiteClasses({ VerifyWordpressLogin.class })
public class TestsWordpress {

}
