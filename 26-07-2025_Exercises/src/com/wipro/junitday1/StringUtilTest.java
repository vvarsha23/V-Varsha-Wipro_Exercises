package com.wipro.junitday1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringUtilTest {
//	 @Test
//	    void testIsUpperCase_withUpperCaseString() {
//	        assertTrue(StringUtil.isUpperCase("HELLO"));
//	    }
//
//	    @Test
//	    void testIsUpperCase_withLowerCaseString() {
//	        assertFalse(StringUtil.isUpperCase("hello"));
//	    }
//	    @Test
//	    void testIsUpperCase_withMixedCaseString() {
//	        assertFalse(StringUtil.isUpperCase("Hello"));
//	    }
//
//	    @Test
//	    void testIsUpperCase_withEmptyString() {
//	        assertFalse(StringUtil.isUpperCase(""));
//	    }
//	    @Test
//	    void testIsUpperCase_withNull() {
//	        assertFalse(StringUtil.isUpperCase(null));
//	    }

//	    @Test
//	    void testIsUpperCase_withNumbersAndSymbols() {
//	        assertTrue(StringUtil.isUpperCase("123!@#"));  // Uppercase check doesn't affect non-letter characters
//	    }
//	    @Test
//	    void testIsUpperCase_withUpperCaseAndNumbers() {
//	        assertTrue(StringUtil.isUpperCase("HELLO123"));
//	    }
	@ParameterizedTest
    @ValueSource(strings = {"hello", "world", "java", "lowercase"})
    void testIsLowerCase_shouldReturnTrue(String input) {
        assertTrue(StringUtil.isUpperCase(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "WORLD", "Java123", "CamelCase", "UPPER", ""})
    void testIsLowerCase_shouldReturnFalse(String input) {
        assertFalse(StringUtil.isUpperCase(input));
    }

}
