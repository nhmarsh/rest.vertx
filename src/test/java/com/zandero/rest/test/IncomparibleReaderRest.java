package com.zandero.rest.test;

import com.zandero.rest.annotation.RequestReader;
import com.zandero.rest.reader.IntegerBodyReader;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 */
@Path("/incompatible")
public class IncomparibleReaderRest {

	@POST
	@Path("ouch")
	@RequestReader(IntegerBodyReader.class)
	public String returnOuch(String bla) {

		return "should not work!";
	}
}