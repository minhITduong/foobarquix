package com.kata.foobarquix

import com.kata.foobarquix.services.FooBarQuixService
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Assertions.assertEquals

@SpringBootTest
class FooBarQuixApplicationTests {

	var fooBarQuixService: FooBarQuixService = FooBarQuixService();

	@Test
	fun whenInputNumberEqualsOne_thenReturnThatNumber() {
		var actual = fooBarQuixService.convertNumber(1);
		var expected = "1";
		assertEquals(expected, actual);
	}

	@Test
	fun whenDevisiableByThree_andContainsThree_thenReturnFooFoo() {
		var actual = fooBarQuixService.convertNumber(3);
		var expected = "FooFoo";
		assertEquals(expected, actual);
	}

	@Test
	fun whenDevisiableByThree_andContainsDoubleThree_thenReturnFooFooFoo() {
		var actual = fooBarQuixService.convertNumber(33);
		var expected = "FooFooFoo";
		assertEquals(expected, actual);
	}

	@Test
	fun whenDevisiableByFive_andContainsFive_thenReturnBarBar() {
		var actual = fooBarQuixService.convertNumber(5);
		var expected = "BarBar";
		assertEquals(expected, actual);
	}

	@Test
	fun whenContainsSeven_thenReturnQuix() {
		var actual = fooBarQuixService.convertNumber(7);
		var expected = "Quix";
		assertEquals(expected, actual);
	}

	@Test
	fun whenDevisiableByThree_thenReturnFoo() {
		var actual = fooBarQuixService.convertNumber(9);
		var expected = "Foo";
		assertEquals(expected, actual);
	}

	@Test
	fun whenDevisiableByFive_thenReturnBar() {
		var actual = fooBarQuixService.convertNumber(10);
		var expected = "Bar";
		assertEquals(expected, actual);
	}

	@Test
	fun whenDevisiableByThree_andContainsFive_thenReturnFooBar() {
		var actual = fooBarQuixService.convertNumber(51);
		var expected = "FooBar";
		assertEquals(expected, actual);
	}

	@Test
	fun whenContainsFive_andContainsThree_thenReturnBarFoo() {
		var actual = fooBarQuixService.convertNumber(53);
		var expected = "BarFoo";
		assertEquals(expected, actual);
	}

	@Test
	fun whenDevisiableByThree_andContainsSeven_thenReturnFooQuix() {
		var actual = fooBarQuixService.convertNumber(27);
		var expected = "FooQuix";
		assertEquals(expected, actual);
	}

	@Test
	fun whenDevisiableByThree_andwhenDevisiableByFive_andContainsFive_thenReturnFooBarBar() {
		var actual = fooBarQuixService.convertNumber(15);
		var expected = "FooBarBar";
		assertEquals(expected, actual);
	}

}
