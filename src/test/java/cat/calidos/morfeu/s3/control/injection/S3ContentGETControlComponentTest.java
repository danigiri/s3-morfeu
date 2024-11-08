package cat.calidos.morfeu.s3.control.injection;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * @author daniel giribet
 *//////////////////////////////////////////////////////////////////////////////////////////////////
public class S3ContentGETControlComponentTest {

@Test @DisplayName("Read S3 with mocks")
public void namedPairTest() {

	var contentStream = new ByteArrayInputStream("foo".getBytes());

	String received = S3ContentGetControlModule.content("", "", contentStream);
	assertEquals("foo", received);

}

}

/*
 * Copyright 2024 Daniel Giribet
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
