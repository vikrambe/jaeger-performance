/**
 * Copyright 2018 The Jaeger Authors
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
package io.jaegertracing.tests.smoke;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.jaegertracing.tests.smoke.tests.BasicSpanTest;
import io.jaegertracing.tests.smoke.tests.FirstJaegerTest;
import io.jaegertracing.tests.smoke.tests.SimpleUITest;
import io.jaegertracing.tests.smoke.tests.TagAndDurationTest;

@RunWith(Suite.class)
@SuiteClasses({
        BasicSpanTest.class,
        FirstJaegerTest.class,
        SimpleUITest.class,
        TagAndDurationTest.class })
public class TestSuiteSmoke {

    public static final String SUITE_NAME = "smoke_test";

    @BeforeClass
    public static void setUp() throws Exception {
        // setting up
    }

    @AfterClass
    public static void tearDown() {
        // tearing down
    }
}
