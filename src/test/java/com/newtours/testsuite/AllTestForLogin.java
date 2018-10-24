package com.newtours.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.newtours.testsuite.testcase.login.TestLoginOnChrome;
import com.newtours.testsuite.testcase.login.TestLoginOnEdge;
import com.newtours.testsuite.testcase.login.TestLoginOnFirefox;
import com.newtours.testsuite.testcase.login.TestLoginOnInternetExplorer;

@RunWith(Suite.class)
@SuiteClasses({ TestLoginOnEdge.class, TestLoginOnChrome.class, TestLoginOnFirefox.class,
		TestLoginOnInternetExplorer.class })
public class AllTestForLogin {

}
