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
package sample.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import sample.mybatis.domain.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link CityMapper}.
 * @author wonwoo
 * @since 1.2.1
 */
@ExtendWith(SpringExtension.class)
@MybatisTest
class CityMapperTest {

  @Autowired
  private CityMapper cityMapper;

  @Test
  void findByStateTest() {
    City city = cityMapper.findByState("CA");
    assertThat(city.getName()).isEqualTo("San Francisco");
    assertThat(city.getState()).isEqualTo("CA");
    assertThat(city.getCountry()).isEqualTo("US");
  }

}
