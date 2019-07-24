Feature: Rest calculator
	Scenario: invoking Addition
		Given A rest url as "http://localhost:9400/addition?firstOperand=10&secondOperand=10"
		When invoking rest api for addition
		Then expecting result as 20









