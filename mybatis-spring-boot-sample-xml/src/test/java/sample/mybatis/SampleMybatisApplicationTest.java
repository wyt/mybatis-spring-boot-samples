/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package sample.mybatis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import extensions.CaptureSystemOutput;
import extensions.CaptureSystemOutput.OutputCapture;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Eddú Meléndez
 * @author Kazuki Shimizu
 */
@CaptureSystemOutput
@ExtendWith(SpringExtension.class)
@SpringBootTest
class SampleMybatisApplicationTest {

	@Test
	void test(OutputCapture outputCapture) {
		String output = outputCapture.toString();
		assertThat(output).contains("1,San Francisco,CA,US");
		assertThat(output).contains("1,Conrad Treasury Place,William & George Streets,4001");
	}
	
}
