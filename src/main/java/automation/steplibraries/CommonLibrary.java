package automation.steplibraries;


import automation.core.TestContext;

public class CommonLibrary{
	public TestContext testContext;
	
	
	public CommonLibrary(){
		testContext = new TestContext();
	}

	public TestContext getTestContext() {
		return testContext;
	}

	public void setTestContext(TestContext testContext) {
		this.testContext = testContext;
	}
		
	
}
