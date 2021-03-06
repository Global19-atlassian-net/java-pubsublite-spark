/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.pubsublite.spark;

import com.google.auto.value.AutoValue;
import com.google.cloud.pubsublite.Offset;
import com.google.cloud.pubsublite.Partition;
import java.util.Map;

@AutoValue
public abstract class PslSourceOffset {

  public abstract Map<Partition, Offset> partitionOffsetMap();

  public static Builder builder() {
    return new AutoValue_PslSourceOffset.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder partitionOffsetMap(Map<Partition, Offset> partitionOffsetMap);

    public abstract PslSourceOffset build();
  }
}
