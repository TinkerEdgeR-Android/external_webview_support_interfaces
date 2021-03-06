// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.support_lib_boundary;

/**
 * Boundary interface for WebResourceErrorCompat.
 */
public interface WebResourceErrorBoundaryInterface {
    public int getErrorCode();
    public CharSequence getDescription();
}
