/**
 * Designed and developed by Andrea Cioccarelli (@cioccarellia)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cioccarellia.kspref.converter

import com.cioccarellia.kspref.extensions.byteArray
import com.cioccarellia.kspref.extensions.string
import java.math.BigDecimal

@PublishedApi
internal class BigDecimalConverter : TypeConverter<BigDecimal>() {
    override fun transform(value: BigDecimal) = value.toString().byteArray()
    override fun reify(value: ByteArray) = value.string().toBigDecimal()
}