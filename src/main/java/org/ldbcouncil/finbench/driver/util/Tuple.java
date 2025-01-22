/*
 * Copyright © 2022 Linked Data Benchmark Council (info@ldbcouncil.org)
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

package org.ldbcouncil.finbench.driver.util;

public class Tuple {
    public static <Type1, Type2> Tuple2<Type1, Type2> tuple2(Type1 t1, Type2 t2) {
        return new Tuple2<>(t1, t2);
    }

    public static <Type1, Type2, Type3> Tuple3<Type1, Type2, Type3> tuple3(Type1 t1, Type2 t2, Type3 t3) {
        return new Tuple3<>(t1, t2, t3);
    }
}
