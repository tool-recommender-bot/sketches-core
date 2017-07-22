/*
 * Copyright 2017, Yahoo! Inc. Licensed under the terms of the
 * Apache License 2.0. See LICENSE file at the project root for terms.
 */

package com.yahoo.sketches.hll;

import com.yahoo.memory.Memory;
import com.yahoo.memory.WritableMemory;

/**
 * @author Lee Rhodes
 */
class DirectHll8Array extends DirectHllArray {

  DirectHll8Array(final WritableMemory wmem) {
    super(wmem);
  }

  DirectHll8Array(final Memory mem) {
    super(mem);
  }


}