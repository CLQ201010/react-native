/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.react.flat;

/**
 * ViewManager that creates instances of RCTText.
 */
/* package */ final class RCTTextManager extends VirtualViewManager<RCTText> {

  @Override
  public String getName() {
    return "RCTText";
  }

  @Override
  public RCTText createShadowNodeInstance() {
    return new RCTText();
  }

  @Override
  public Class<RCTText> getShadowNodeClass() {
    return RCTText.class;
  }
}